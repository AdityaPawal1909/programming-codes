// import http from "http";

// const server = http.createServer((req,res)=>{

//     res.end("Welcome to NodeJS");

// });

// server.listen(3000);/

// import http from "http";

// const server=http.createServer((req,res)=>{

//     console.log(req.url);

//     res.end("Done");

// });

// server.listen(3000);

import http from "http";

const server = http.createServer((req, res) => {

    if (req.url === "/") {

        res.end("Home Page");

    }

    else if (req.url === "/about") {

        res.end("About Page");

    }

    else if (req.url === "/contact") {

        res.end("Contact Page");

    }

    else {

        res.end("404 Page Not Found");

    }

});

server.listen(3000);