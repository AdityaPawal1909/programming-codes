function calculate(a, b, callback) {
    let result = a + b;
    return callback(result);
}

function showResult(answer) {
    console.log(answer);
}

calculate(10, 5, showResult);

//Question 2

function download(callback){
    console.log("Downloading...");
    setTimeout(() => {
        console.log("Download completed.");
        callback();
    }, 2000);
}

download(function(){
    console.log("Processing...");
    process(function(){
        console.log("Uploading...");
        upload();
    });
});

function process(callback){
    setTimeout(() => {
        console.log("Processing completed.");
        callback();
    }, 2000);
}

function upload(){
    setTimeout(() => {
        console.log("Upload completed.");
    }, 2000);
}