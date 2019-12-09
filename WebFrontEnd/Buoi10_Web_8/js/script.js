function firstLetterCap(str) {
  let arr1 = [];
  let arr2 = [];
  arr1 = str.toLowerCase().split(" ");

  for (let i = 0; i < arr1.length; i++) {
    arr2.push(arr1[i][0].toUpperCase() + arr1[i].slice(1, arr1[i].length));
  }
  return arr2.join(" ");
}

function spinal(str) {
  return str
    .toLowerCase()
    .split(" ")
    .join("-");
}

function symmetry(str) {
  let arr = [];
  let j = 0;
  arr = str
    .toLowerCase()
    .split(" ")
    .join("");
  for (let i = 0; i < arr.length; i++) {
    j = arr.length - i - 1;
    if (arr[i] !== arr[j]) return false;
  }
  return true;
}

function findStr(str1, str2) {
  return str1.toUpperCase().includes(str2.toUpperCase()); //input of find() is a callback func
}

function findChar(str1, str2) {
  for (let i = 0; i < str2.length; i++)
    if (!str1.toLowerCase().includes(str2[i].toLowerCase())) return false;
  return true;
}

function removeArrayElement(arr) {
  for (let i = 0; i < arr.length; i++) {
    if (!arr[i]) arr.splice(i, 1);
  }
  return arr;
}

function arrayElementMatch(arr1, arr2) {
  let arr = [];
  for (let i = 0; i < arr1.length; i++) {
    if (!arr2.includes(arr1[i])) arr.push(arr1[i]);
  }
  for (let j = 0; j < arr2.length; j++) {
    if (!arr1.includes(arr2[j])) arr.push(arr2[j]);
  }
  return arr;
}

function arrayElementLength(arr) {
  let len = arr.map(value => value.length).sort((a, b) => b - a)[0];
  return arr.filter(value => value.length == len);
}

function arrayMatrix(m, n) {
  let arr1 = [];
  let arr2 = [];
  for (let i = 0; i < m; i++) {
    for (let j = i * n + 1; j <= i * n + n; j++) {
      arr1.push(j);
    }
    arr2.push(arr1);
    arr1 = [];
  }
  return arr2;
}

function createArrayZicZAc(m, n) {
  // Khởi tạo mảng 1 chiều length m
  let arraym = new Array(m);
  // loop to create 2d array using 1d array
  for (let i = 0; i < arraym.length; i++) {
    arraym[i] = new Array(n);
  }
  // lặp qua để tạo các mảng các phần tử 2 chiều
  let h = 0;
  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      arraym[i][j] = h++;
    }
    if (i % 2 != 0) {
      arraym[i].reverse();
    }
  }

  return arraym;
}

function filterMaxLength(arrStr) {
  let maxlength = arrStr[0].length;
  let newArray = [];
  for (let i = 0; i < arrStr.length; i++) {
    if (arrStr[i].length > maxlength) {
      maxlength = arrStr[i].length;
    }
  }

  for (let j = 0; j < arrStr.length; j++) {
    if (arrStr[j].length == maxlength) {
      newArray.push(arrStr[j]);
    }
  }

  return newArray;
}
