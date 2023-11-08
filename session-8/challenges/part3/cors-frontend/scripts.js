const ENDPOINT = 'http://localhost:8080/sweets'
const result = document.getElementById('result')
const inputId = document.getElementById('input-id')

function updateResult(text) {
  result.value = text
}

const sweets = ['Candy', 'Cookie', 'Milky Way', 'Bounty', 'Kit-Kat', 'Lollypop', 'Kinder Bueno']
document.getElementById('btn-post-one').addEventListener('click', postOne)
function postOne() {
  const index = Math.floor(Math.random() * sweets.length)
  const name = sweets[index]
  const sweet = { name }
  const body = JSON.stringify(sweet)
  fetch(ENDPOINT, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: body,
  })
    .then(response => response.text())
    .then(text => updateResult(text))
    .catch(error => console.error(error))
}

document.getElementById('btn-get-all').addEventListener('click', getAll)
function getAll() {
  fetch(ENDPOINT)
    .then(response => response.json())
    .then(json => toString(json))
    .then(text => updateResult(text))
    .catch(error => console.error(error))
}

function toString(sweets) {
  if (sweets.length == 0) {
    return 'The sweets bag is empty.'
  }
  return sweets.map(sweet => `${sweet.name}, with ID: ${sweet.id}`).join('\n')
}

function isInvalid(id) {
  const isInvalid = id === null || id === undefined || id === ''
  if (isInvalid) {
    updateResult('The sweet id is not valid.')
  }
  return isInvalid
}

document.getElementById('btn-get-one').addEventListener('click', getOne)
function getOne() {
  const id = inputId.value
  if (isInvalid(id)) {
    return
  }
  const url = ENDPOINT + '/' + id
  fetch(url, { method: 'GET' })
    .then(result => {
      if (result.status == 404) {
        updateResult(`The sweet id does not exist.`)
        throw new Error();
      }
      return result.json()
    })
    .then(json => updateResult(`This is a ${json.name}.`))
    .catch(error => console.error(error))
}

document.getElementById('btn-delete-one').addEventListener('click', deleteOne)
function deleteOne() {
  const id = inputId.value
  if (isInvalid(id)) {
    return
  }
  const url = ENDPOINT + '/' + id
  fetch(url, { method: 'DELETE' })
    .then(result => {
      if (result.status == 404) {
        updateResult(`The sweet id does not exist.`)
        throw new Error();
      }
      return result.json()
    })
    .then(json => updateResult(`This tastes like ${json.name}!`))
    .catch(error => console.error(error))
}
