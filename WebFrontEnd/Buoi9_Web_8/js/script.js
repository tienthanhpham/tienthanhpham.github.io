function max(number1, number2) {
  if (typeof number1 == "number" && typeof number2 == "number") {
    return number1 > number2 ? number1 : number2;
  }
  document.write("Not a number");
  return;
}

function factorial(numb) {
  let fact = 1;
  if (numb < 0) {
    document.write("Number input must not be negative");
    return -1;
  }
  if (numb == 0) {
    fact = 1;
  } else {
    for (let i = numb; i > 0; i--) fact *= i;
  }
  document.write(`Result: ${fact}`);
  return fact;
}

function copyEvenArray(numbers) {
  let newArr = [];
  for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] % 2 == 0) newArr.unshift(numbers[i]);
  }
  return newArr.sort((a, b) => b - a);
}

function login(username, password) {
  const user = {
    username: "thanhpt",
    password: "111111"
  };
  if (username == "" || password == "")
    alert("username & password must not be blank");
  else {
    if (username.length > 20 || password.length < 6 || password.length > 32)
      alert("username & password length not valid");
    else {
      if (username == user.username && password == user.password) {
        document.write("Authentication successful");
      } else {
        document.write("Authentication failed");
      }
    }
  }
  return;
}

function getSeason() {
  const now = new Date();
  const date = now.getDate();
  const month = now.getMonth();
  const year = now.getFullYear();
  switch (month) {
    case 1:
      document.write(`Current time: ${date}/${month}/${year}, season: spring`);
      break;
    case 2:
      document.write(`Current time: ${date}/${month}/${year}, season: spring`);
      break;
    case 3:
      document.write(`Current time: ${date}/${month}/${year}, season: spring`);
      break;
    case 4:
      document.write(`Current time: ${date}/${month}/${year}, season: summer`);
      break;
    case 5:
      document.write(`Current time: ${date}/${month}/${year}, season: summer`);
      break;
    case 6:
      document.write(`Current time: ${date}/${month}/${year}, season: summer`);
      break;
    case 7:
      document.write(`Current time: ${date}/${month}/${year}, season: autumn`);
      break;
    case 8:
      document.write(`Current time: ${date}/${month}/${year}, season: autumn`);
      break;
    case 9:
      document.write(`Current time: ${date}/${month}/${year}, season: autumn`);
      break;
    case 10:
      document.write(`Current time: ${date}/${month}/${year}, season: winter`);
      break;
    case 11:
      document.write(`Current time: ${date}/${month}/${year}, season: winter`);
      break;
    case 12:
      document.write(`Current time: ${date}/${month}/${year}, season: winter`);
      break;
    default:
  }
}

function getGrade(mark) {
  if (mark >= 8.5 && mark <= 10) return "A";
  if (mark >= 7 && mark < 8.5) return "B";
  if (mark >= 5.5 && mark < 7) return "C";
  if (mark >= 4 && mark < 5.5) return "D";
  if (mark >= 0 && mark < 4) return "E";
  return "unclassified";
}

function translate(nation) {
  switch (nation.toLowerCase()) {
    case "english":
      return "Hello";
      break;
    case "italian":
      return "Ciao";
      break;
    case "chinese":
      return "Nihao";
      break;
    case "japanese":
      return "Konichiwa";
      break;
    case "french":
      return "Bonjour";
      break;
    default:
      return "Xin chao";
  }
}

function arrayCheck(bools) {
  const check = bools.findIndex(element => element == true);
  return check;
}

function printSquare(numb) {
  for (let i = 0; i < numb; i++) {
    for (let j = 0; j < numb; j++) document.write("*&nbsp;");
    document.write("<br/>");
  }
}

function printTriangle(numb) {
  for (let i = 0; i < numb; i++) {
    for (let j = 0; j <= i; j++) document.write("*&nbsp;");
    document.write("<br/>");
  }
}

function printEmptyRectangle(numb) {
  for (let i = 0; i < numb; i++) {
    for (let j = 0; j < numb; j++) {
      if (i == 0 || i == numb - 1) document.write("*&nbsp;");
      else if (j == 0 || j == numb - 1) document.write("*&nbsp;");
      else document.write("&nbsp;&nbsp;&nbsp;");
    }
    document.write("<br/>");
  }
}

function printSpecialTriangle1(numb) {
  for (let i = 1; i < numb; i++) {
    for (let k = 1; k < numb - i; k++) document.write("&nbsp;&nbsp;");
    for (let j = 1; j <= i; j++) document.write("*&nbsp;&nbsp;");
    document.write("<br/>");
  }
}

function printSpecialTriangle2(numb) {
  for (let i = numb; i >= 1; i--) {
    for (let k = numb - i; k >= 1; k--) document.write("&nbsp;&nbsp;");
    for (let j = 1; j <= i; j++) document.write("*&nbsp;&nbsp;");
    document.write("<br/>");
  }
}

function printX1(numb) {
  let half = Math.round(numb / 2);
  for (let i = half; i >= 1; i--) {
    for (let k = half - i; k >= 1; k--) document.write("&nbsp;&nbsp;");
    for (let j = 1; j <= i; j++) document.write("*&nbsp;&nbsp;");
    document.write("<br/>");
  }
  for (let i = 1; i < half; i++) {
    for (let k = 1; k < half - i + 1; k++) document.write("&nbsp;&nbsp;");
    for (let j = 1; j <= i; j++) document.write("*&nbsp;&nbsp;");
    document.write("<br/>");
  }
}

function printX2(number) {
  let half = Math.floor(number / 2);
  for (let i = 1; i <= half * 2 + 1; i++) {
    for (let j = 0; j <= half * 2 + 1; j++) {
      if (i == j) {
        document.write("*");
      } else if (i + j == half * 2 + 2) {
        document.write("*");
      } else {
        document.write("&nbsp;");
      }
    }
    document.write("<br/>");
  }
}
