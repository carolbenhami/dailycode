console.log("This program takes a number as an input and adds all the digits of it.");

function addup(){
    let input = prompt("Enter a number to add up: ");
    const array = Array.from(String(input), Number);
    let sum = 0;

    for(let i = 0; i < array.length; i++){
        sum = sum + array[i];
    }

    console.log("The sum of the digits is " + sum + ".");
}

let x = addup()