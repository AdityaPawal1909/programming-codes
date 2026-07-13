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
            reject("Uploading Failed")
        }, 2000);
    });
}


async function deployProject() {
    try {
        let message1 = await downloadProject();
        console.log(message1);
        let message2 = await compileProject();
        console.log(message2);
        let message3 = await uploadProject();
        console.log(message3);
        console.log("Deployment Successful!");
    }
    catch(error) {
        console.log(reject);
    }
}
deployProject();