let todolist = [];
let ul = document.createElement("ul");
let display = document.getElementsByTagName("body")[0].appendChild(ul);
let index;

render(todolist);

function render(lists) {
  let itemlist = lists
    .map(
      item =>
        `<li id="${item.id}"><div>${item.value} 
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

function deleteItem(obj) {
  for (let i = 0; i < todolist.length; i++) {
    if (todolist[i].id == obj.parentNode.parentNode.id) todolist.splice(i, 1);
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
