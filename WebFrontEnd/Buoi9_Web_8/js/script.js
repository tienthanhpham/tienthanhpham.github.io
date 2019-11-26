function max(number1, number2) {
    if (typeof number1 == 'number' && typeof number2 == 'number') {
        return number1 > number2 ? number1 : number2;
    }
    document.write('Not a number');
    return;
}

function factorial(numb) {
    let fact = 1;
    if (numb < 0) {
        document.write('Number input must not be negative');
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
    for (let i = 0; i<numbers.length; i++) {
        if (numbers[i]%2==0) newArr.unshift(numbers[i]);
    }
    return newArr.sort((a,b)=> b-a);
}