function changeColor(para, color) {
    document.getElementById(para).style.color = color;
}

function changeBgColor() {
    // document.getElementsByClassName("container")[0].style.backgroundColor = "red";
    // document.getElementById("para1").style.backgroundColor = "aquamarine";
    document.body.style.backgroundColor = "red";
}

function copyContent(paragraph1, paragraph2) {
    let para = "";
    para = document.getElementById(paragraph1).innerText;
    document.getElementById(paragraph1).innerText = document.getElementById(paragraph2).innerText;
    document.getElementById(paragraph2).innerText = para;
}

function changeFontSize(classes, fontsize) {
    // let arr = document.getElementsByClassName(classes);
    let arr = document.querySelectorAll("." + classes);
    
    // arr.forEach(element => {
    //     element => element.style.fontSize = fontsize; 
    // });
}

function changeFontSize2(fontsize, pixel = "px") {
    for (let i=0;i<document.getElementsByClassName("para").length; i++) {
        document.getElementsByClassName("para")[i].style.fontSize = fontsize + pixel;
    }
}