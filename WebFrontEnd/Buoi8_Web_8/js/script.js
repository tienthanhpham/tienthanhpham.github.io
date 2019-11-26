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

function arrayMin(arr) {
  return Math.min(...arr);
  
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

function copyStr(str) {
  let i = 0;
  while (i < 10) {
    if (i == 9) {
      document.write(str);
      return;
    }
    document.write(str + "-");
    i++;
  }
}

function factorial(numb) {
  let fact = 1;
  if (numb < 0) return -1;
  if (numb == 0) {
    fact = 1;
  } else {
    for (let i = numb; i > 0; i--) fact *= i;
  }
  return fact;
}

function stringReverse(str) {
  let reversed = [];
  let revStr = "";
  reversed = str.split("");
  for (let i = str.length - 1; i >= 0; i--) revStr += str[i];
  return revStr;
}

function nameSortIndex(names) {
  let lowerNames = [];
  for (let i = 0; i < names.length; i++) {
    lowerNames[i] = names[i].toLowerCase();
  }
  lowerNames.sort();
  for (let j = 0; j < lowerNames.length; j++)
    for (let k = 0; k < names.length; k++) {
      if (lowerNames[j] == names[k].toLowerCase())
        console.log(k + ", " + names[k] + "\n");
    }
}

function remainder(numbers) {
  let remainderArr = [];
  for (let i = 0; i < numbers.length; i++) {
    remainderArr[i] = numbers[i] % 2;
  }
  return remainderArr;
}

function writeNumber() {
  let i = 1;
  let j = 2;
  while (i <= 100) {
    document.write('<span style="color:red" >' + i + " " + "</span>");
    document.write('<span style="color:green" >' + j + " " + "</span>");
    i = i + 2;
    j = j + 2;
  }
}
