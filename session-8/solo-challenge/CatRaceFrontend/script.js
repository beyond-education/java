document.addEventListener('DOMContentLoaded', function() {
    const BASE_URL = 'http://localhost:8080';
    const catImages = [
        'cat_snack.png',
        'cat_win.png',
        'grumpy_party.png'
    ];

    function getRandomCatImage() {
        const randomIndex = Math.floor(Math.random() * catImages.length);
        return catImages[randomIndex];
    }

    function displayCats(text) {
      const displayArea = document.getElementById('catsDisplayArea');
      displayArea.value = text;
    }

    document.getElementById('registerCatForm').addEventListener('submit', function(event) {
        event.preventDefault();
        const catName = document.getElementById('catName').value;
        const catSpeed = document.getElementById('catSpeed').value;
        const catAgility = document.getElementById('catAgility').value;

        fetch(`${BASE_URL}/cats`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                name: catName,
                speed: Number(catSpeed),
                agility: Number(catAgility)
            })
        })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            alert(`Cat ${catName} registered successfully!`);
        })
        .catch((error) => {
            console.error('Error:', error);
            alert(`Error registering cat ${catName}.`);
        });

        event.target.reset(); // Clear form after submission
    });

    document.getElementById('getAllCats').addEventListener('click', function() {
        fetch(`${BASE_URL}/cats`)
        .then(response => response.json())
        .then(data => {
            displayCats(data.map(cat => `Name: ${cat.name}, Speed: ${cat.speed}, Agility: ${cat.agility}`).join('\n'));
        })
        .catch(error => {
            console.error('Error:', error);
            displayCats('Failed to load cats.');
        });
    });

    document.getElementById('getCatByName').addEventListener('click', function() {
        const catName = document.getElementById('manageCatName').value;
        fetch(`${BASE_URL}/cats/${catName}`)
        .then(response => response.json())
        .then(data => {
            displayCats(`Name: ${data.name}, Speed: ${data.speed}, Agility: ${data.agility}`);
        })
        .catch(error => {
            console.error('Error:', error);
            displayCats('Failed to load the cat.');
        });
    });

    document.getElementById('deleteCatByName').addEventListener('click', function() {
        const catName = document.getElementById('manageCatName').value;
        fetch(`${BASE_URL}/cats/${catName}`, { method: 'DELETE' })
        .then(response => {
            if(response.ok) {
                displayCats(`Cat named ${catName} deleted.`);
            } else {
                displayCats(`Failed to delete the cat named ${catName}.`);
            }
        })
        .catch(error => {
            console.error('Error:', error);
            displayCats('Failed to delete the cat.');
        });
    });

    document.getElementById('startRaceBtn').addEventListener('click', function() {
        fetch(`${BASE_URL}/race/start`)
        .then(response => response.json())
        .then(data => {
            const winnerText = `The winner is ${data.name} with speed: ${data.speed} and agility: ${data.agility}!`;
            displayCats(winnerText);

            // Display a random cat image for the winner
            const raceResultDiv = document.getElementById('raceResult');
            raceResultDiv.innerHTML = `<img src="images/${getRandomCatImage()}" alt="Winning Cat" class="img-fluid mt-3">`;
        })
        .catch(error => {
            console.error('Error:', error);
            displayCats('Failed to start the race.');
        });
    });
});
