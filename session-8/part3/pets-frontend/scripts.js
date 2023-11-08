const ENDPOINT = 'http://localhost:8080/pets'
const result = document.getElementById('result')

document.getElementById('btn-get-all').addEventListener('click', getAll)
function getAll() {
  fetch(ENDPOINT)
    .then(response => response.json())
    .then(json => (result.value = toString(json)))
    .catch(error => console.error(error))
}

function toString(pets) {
  if (pets.length == 0) {
    return 'No entries.'
  }
  return pets.map(pet => `${pet.name}, ${pet.age} years old. ID: ${pet.id}`).join('\n')
}

const names = ['Mittens', 'Paws', 'Cookie', 'Duke', 'Luna', 'Milo', 'Lucy']
document.getElementById('btn-post-one').addEventListener('click', postOne)
function postOne() {
  const index = Math.floor(Math.random() * names.length)
  const name = names[index]
  const age = Math.floor(Math.random() * 5)
  const pet = { name, age }
  const body = JSON.stringify(pet)
  fetch(ENDPOINT, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: body,
  }).then(getAll)
}

document.getElementById('btn-delete-all').addEventListener('click', deleteAll)
function deleteAll() {
  fetch(ENDPOINT, { method: 'DELETE' }).then(getAll)
}
