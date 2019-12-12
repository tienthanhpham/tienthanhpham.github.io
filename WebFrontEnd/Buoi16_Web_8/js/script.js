let result = "";
let display = document.getElementById("display");
// let calcul = "";

function press(obj) {
  result += obj.innerText;
  display.innerText = result;
  console.log(result);
}

function reset() {
  display.innerText = "0";
  result = "";
}

function cal() {
  if (result !== "") display.innerText = eval(result);
  result = "";
}
