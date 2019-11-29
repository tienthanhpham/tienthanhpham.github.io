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

// function printX2(number) {
//   let half = Math.floor(number / 2);
//   for (let i = 1; i <= half * 2 + 1; i++) {
//     for (let j = 0; j <= half * 2 + 1; j++) {
//       if (i == j) {
//         document.write("*");
//       } else if (i + j == half * 2 + 2) {
//         document.write("*");
//       } else {
//         document.write("&nbsp;");
//       }
//     }
//     document.write("<br/>");
//   }
// }

function printX3(numb) {
  for (let i = 1; i <= numb; i++) {
    let j = numb - i + 1;
    for (k = 1; k <= numb; k++)
      if (k == j || k == i) document.write("*");
      else document.write("&nbsp;");
    document.write("<br/>");
  }
}

// function printHalfButterfly(numb) {
//   for (let i = 0; i <= numb; i++) {
//     for (let j = 1; j <= i + 1; j++) {
//       document.write("*");
//     }
//     document.write("<br/>");
//   }
//   for (let i = 0; i <= numb; i++) {
//     for (let j = numb; j >= i + 1; j--) {
//       document.write("*");
//     }
//     document.write("<br/>");
//   }
// }

// function printButterfly(numb) {
//   for (let i = 0; i <= numb; i++) {
//     for (let j = 1; j <= i + 1; j++) document.write("*");
//     for (let k = 0; k <= numb * 2 - i * 2 - 1; k++)
//       document.write("&nbsp;&nbsp;");
//     for (let l = 1; l <= i + 1; l++) document.write("*");
//     document.write("<br/>");
//   }
//   for (let i = 0; i < numb; i++) {
//     for (let j = numb; j >= i + 1; j--) document.write("*");
//     for (let k = 0; k <= i * 2 + 1; k++) document.write("&nbsp;&nbsp;");
//     for (let l = numb; l >= i + 1; l--) document.write("*");
//     document.write("<br/>");
//   }
// }

function butterfly(numb) {
  let half = Math.floor(numb / 2);
  for (let i = 0; i <= half; i++) {
    for (let j = 1; j <= i + 1; j++) document.write("*");
    for (let k = 0; k <= half * 2 - i * 2 - 1; k++)
      document.write("&nbsp;&nbsp;");
    for (let l = 1; l <= i + 1; l++) document.write("*");
    document.write("<br/>");
  }
  for (let i = 0; i < half; i++) {
    for (let j = half; j >= i + 1; j--) document.write("*");
    for (let k = 0; k <= i * 2 + 1; k++) document.write("&nbsp;&nbsp;");
    for (let l = half; l >= i + 1; l--) document.write("*");
    document.write("<br/>");
  }
}

function arraySum(numbers) {
  return numbers.reduce((sum, value) => sum + value);
}

function arrayMap(numbers) {
  return numbers.map(value => value % 2);
}

function arrayFilter(numbers) {
  return numbers.filter(value => value % 2 == 0);
}

function studentFilter(students) {
  return students.filter(student => student[0].toLowerCase() == "h");
}

function Cube(radian) {
  return (Math.pow(radian, 3) * Math.PI * 4) / 3;
}

function sumMedium(numb1, numb2) {
  let sum = 0;
  if (numb1 < numb2)
    for (let i = numb1 + 1; i <= numb2 - 1; i++) {
      sum = sum + i;
    }
  else
    for (let i = numb2 + 1; i <= numb1 - 1; i++) {
      sum = sum + i;
    }
  return sum;
}

function primeNumb(numb) {
  for (let i = numb - 1; i >= 2; i--)
    if (numb % i == 0) {
      return false;
    }
  return true;
}

function sumPrimeNumb(numb) {
  if (numb <= 0) return -1;
  let sum = 0;
  for (let i = numb; i >= 1; i--) if (primeNumb(i)) sum += i;
  return sum;
}

function sumFactor(numb) {
  if (numb <= 0) return -1;
  let sum = 0;
  for (let i = numb - 1; i >= 1; i--) {
    if (numb % i === 0) sum += i;
  }
  return sum;
}

function Fibo(numb) {
  let arr = [1, 1];
  let i = 1;
  while (arr[i - 1] + arr[i] <= numb) {
    arr.push(arr[i - 1] + arr[i]);
    i++;
  }
  return arr;
}

function sumFibo(numbers) {
  let numb = Fibo(numbers);
  return numb
    .filter(value => value % 2 == 0)
    .reduce((sum, value) => sum + value);
}
