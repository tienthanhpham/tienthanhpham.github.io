let todolist = [];
let ul = document.createElement("ul");
let display = document.getElementsByTagName("body")[0].appendChild(ul);
// let display = document.querySelector(".container").appendChild(ul);
let index;
let answer;
let id = -1;

render(todolist);

function render(lists) {
  let itemlist = lists
    .map(
      item =>
        `<li id="${item.id}"><div>${item.value} 
        <div class="minus" onclick = "confirm(this)"><i class="fas fa-minus" ></i></div>
        <div class="edit" onclick = "editItem(this)"><i class="fas fa-pencil-alt"></i></div></div></li>`
    )
    .join(" ");

  display.innerHTML = itemlist;
  display.classList.add("listUI");
  let buttonInput = document.getElementById("submit");
  buttonInput.addEventListener("click", addItem);
}

function addItem() {
  let itemobj = {};
  let item = document.getElementById("iteminput");
  if (item.value == "") console.log("empty");
  else {
    itemobj.id = new Date().getUTCMilliseconds();
    itemobj.value = item.value;
    todolist.push(itemobj);
    document.getElementById("iteminput").value = "";
    render(todolist);
  }
  itemobj = {};
}

// function deleteItem(obj) {
//   for (let i = 0; i < todolist.length; i++) {
//     if (todolist[i].id == obj.parentNode.parentNode.id) todolist.splice(i, 1);
//   }
//   render(todolist);
// }

function deleteItem(id) {
  for (let i = 0; i < todolist.length; i++) {
    if (todolist[i].id == id) todolist.splice(i, 1);
  }
  render(todolist);
}

function editItem(obj) {
  let editText = document.getElementById("iteminput");
  for (let i = 0; i < todolist.length; i++) {
    if (todolist[i].id == obj.parentNode.parentNode.id) {
      editText.value = todolist[i].value;
      index = i;
    }
  }
  return index;
}

function saveItem() {
  let editText = document.getElementById("iteminput");
  for (let i = 0; i < todolist.length; i++)
    if (i == index) todolist[i].value = editText.value;
  document.getElementById("iteminput").value = "";
  render(todolist);
  index = -1;
}

function confirm(item) {
  document.querySelector(".confirm").classList.add("active");
  id = item.parentNode.parentNode.id;
  // console.log(item.parentNode.parentNode.id);
}

function confirmHidden() {
  document.getElementsByClassName("confirm")[0].classList.remove("active");
  document.getElementsByClassName("confirm")[0].classList.add("inactive");
}

function getConfirm(answer) {
  // console.log(answer.innerText);
  if (answer.innerText == "YES") {
    deleteItem(id);
    confirmHidden();
  } else confirmHidden();
  id = -1;
}
