function sayHello(name) {
  return `Xin chao ${name}`;
}

function sum(number1, number2) {
  return number1 + number2;
}

function square(number) {
  return number * number;
}

function century(year) {
  return Math.floor(year / 100) + 1;
}

function stringCut(str) {
  const cut = str.length > 15 ? str.slice(0, 10) + "..." : str;
  return cut;
}

function textFormat(str) {
  const lower = str.toLowerCase();
  const remainLower = lower.slice(1, str.length);
  const firstLetter = str.slice(0, 1);
  const cut = firstLetter.toUpperCase() + remainLower;
  return cut;
}

function arraySort(arr) {
  const sorted = arr.sort();
  return sorted.shift();
}

function nameSort(names) {
  let lowerNames = [];
  for (let i = 0; i < names.length; i++) {
    lowerNames[i] = names[i].toLowerCase();
  }
  lowerNames.sort();
  for (let j = 0; j < lowerNames.length; j++)
    for (let k = 0; k < names.length; k++) {
      if (lowerNames[j] == names[k].toLowerCase()) console.log(names[k] + "\n");
    }
}
