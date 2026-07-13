let obj1 = {
    "1": "Crazy",
    "2": "Amazing",
    "3": "Fire"
}

let obj2 = {
    "1": "Engine",
    "2": "Foods",
    "3": "Garments"
}

let obj3 = {
    "1": "Bros",
    "2": "Limited",
    "3": "Hub"
}

let obj4 = {
    "1": "Pvt Ltd",
    "2": "Corporation",
    "3": "International"
}

let randomNum1 = Math.floor(Math.random() * (3 - 1 + 1)) + 1;
let randomNum2 = Math.floor(Math.random() * (3 - 1 + 1)) + 1;
let randomNum3 = Math.floor(Math.random() * (3 - 1 + 1)) + 1;
let randomNum4 = Math.floor(Math.random() * (3 - 1 + 1)) + 1;

alert("The Company Name is" + " " + obj1[randomNum1] + " " + obj2[randomNum2] + " " + obj3[randomNum3] + " " + obj4[randomNum4]);
