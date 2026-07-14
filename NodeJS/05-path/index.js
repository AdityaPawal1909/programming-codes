import path from "path";
let filePath = path.join("images","logo.png");

console.log(filePath);
console.log(path.basename("images/logo.png"));
console.log(path.dirname("images/logo.png"));
console.log(path.extname("logo.png"));
console.log(path.resolve("logo.png"));

console.log(path.parse("images/logo.png"));

const file = {

dir:"images",
name:"logo",
ext:".png"

};

console.log(path.format(file));