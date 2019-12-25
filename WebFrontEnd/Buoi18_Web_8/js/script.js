// $(document).ready(function() {
let todolist = [];
let ul = $("<ul>");
let display = ul.appendTo("body");
let index;
let answer;
let id = -1;

$(document).ready(function() {
  render(todolist);
});

function render(lists) {
  let itemlist = lists
    .map(
      item =>
        `<li id="${item.id}"><div>${item.value} 
        <div class="minus" onclick = "confirm(this)"><i class="fas fa-minus" ></i></div>
        <div class="edit" onclick = "editItem(this)"><i class="fas fa-pencil-alt"></i></div></div></li>`
    )
    .join(" ");

  display.html(itemlist);
  display.addClass("listUI");
  let buttonInput = $("#submit");
  buttonInput.click(addItem);

  $("#iteminput").val("");
}

function addItem() {
  let itemobj = {};
  let item = $("#iteminput");
  if (item.val() == "") return;
  else {
    itemobj.id = new Date().getUTCMilliseconds();
    itemobj.value = item.val();
    todolist.push(itemobj);

    render(todolist);
  }
  itemobj = {};
}

function deleteItem(id) {
  for (let i = 0; i < todolist.length; i++) {
    if (todolist[i].id == id) todolist.splice(i, 1);
  }
  render(todolist);
}

function editItem(obj) {
  $("#save").removeClass("inactive");
  let editText = $("#iteminput");

  for (let i = 0; i < todolist.length; i++) {
    if (todolist[i].id == obj.parentNode.parentNode.id) {
      editText.val(todolist[i].value);
      index = i;
    }
  }
  return index;
}

function saveItem() {
  let editText = $("#iteminput");
  for (let i = 0; i < todolist.length; i++)
    if (i == index) todolist[i].value = editText.val();
  editText.val("");
  render(todolist);
  index = -1;
}

function confirm(item) {
  $(".confirm").addClass("active"); //hien hoi thoai Confirm
  // $(".confirm").show();
  id = $(item)
    .parent()
    .parent()
    .attr("id"); //lay the li ca^n xoa

  $(".container")
    .children()
    .prop("disabled", true);
  $(".fas")
    .parent()
    .hide();
}

function confirmHidden() {
  // $(".fas")
  //   .parent()
  //   .click(confirm($(this)));
  $(".fas")
    .parent()
    .show();
  $(".container")
    .children()
    .removeAttr("disabled");
  $(".confirm").removeClass("active");
  $(".confirm").addClass("inactive");
}

function getConfirm(answer) {
  if ($(answer).text() == "YES") {
    deleteItem(id);
    confirmHidden();
  } else confirmHidden();
  id = -1;
}
// });
