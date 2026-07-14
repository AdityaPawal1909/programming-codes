import fs from "fs";
// let data = fs.readFileSync("hello.txt","utf8");
// console.log(data);

// fs.renameSync("hello.txt","profile.txt");

// fs.unlinkSync("profile.txt");


// fs.mkdirSync("Images");/

// fs.writeFileSync("hello.txt", "Hello Aditya");

// fs.readFile("hello.txt", "utf8", (err, data) => {

//     if (err) {
//         console.log(err);
//         return;
//     }

//     console.log(data);

// });

// console.log("Program Finished");

console.log("1");

fs.readFile("hello.txt", "utf8", (err, data) => {
    console.log("2");
});

console.log("3");