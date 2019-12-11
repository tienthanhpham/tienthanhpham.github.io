let todolist = [];
let ul = document.createElement("ul");
let display = document.getElementsByTagName("body")[0].appendChild(ul);
let index;

render(todolist);

function render(lists) {
  let itemlist = lists
    .map(
      item =>
        `<li><div>${item} 
        <div class="minus" onclick = "deleteItem(this)"><i class="fas fa-minus" ></i></div>
        <div class="edit" onclick = "editItem(this)"><i class="fas fa-pencil-alt"></i></div></div></li>`
    )
    .join(" ");

  display.innerHTML = itemlist;
  display.classList.add("listUI");

  let buttonInput = document.getElementById("submit");
  buttonInput.addEventListener("click", addItem);
}

function addItem() {
  let item = document.getElementById("iteminput");
  if (item.value == "") console.log("empty");
  else {
    todolist.push(item.value);
    document.getElementById("iteminput").value = "";
    render(todolist);
  }
}

function deleteItem(obj) {
  for (let i = 0; i < todolist.length; i++) {
    if (todolist[i] == obj.parentNode.innerText) todolist.splice(i, 1);
  }
  render(todolist);
}

function editItem(obj) {
  let editText = document.getElementById("iteminput");
  for (let i = 0; i < todolist.length; i++) {
    if (todolist[i] == obj.parentNode.innerText) {
      editText.value = todolist[i];
      index = i;
    }
  }
  return index;
}

function saveItem() {
  let editText = document.getElementById("iteminput");
  for (let i = 0; i < todolist.length; i++)
    if (i == index) todolist[i] = editText.value;
  render(todolist);
  index = -1;
}
