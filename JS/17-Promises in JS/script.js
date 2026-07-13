//Question 1
// let marks = 78;
// let markspromise = new Promise((resolve, reject) => {
//     if (marks >= 35){
//         resolve("Congratulations! You Passed.");
//     } else {
//         reject("Sorry, you failed.");
//     }
// });
// markspromise.then((message) => {
//     console.log(message);
// }).catch((message) => {
//     console.log(message);
// });

//Question 2

function downloadProject() {
    console.log("Downloading Project...");
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Project Downloaded.");
            resolve("Download Successful");
        }, 2000);
    });
}
function compileProject() {
    console.log("Compiling Project...");
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Project Compiled.");
            resolve("Compilation Successful");
        }, 2000);
    });
}
function uploadProject() {
    console.log("Uploading Project...");
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Project Uploaded.");
            resolve("Upload Successful");
        }, 2000);
    });
}
downloadProject()
    .then((message) => {
        console.log(message);
        return compileProject();
    })
    .then((message) => {
        console.log(message);
        return uploadProject();
    })
    .then((message) => {
        console.log(message);
        console.log("Deployment Successful!");
    })
    .catch((error) => {
        console.log(error);
    });