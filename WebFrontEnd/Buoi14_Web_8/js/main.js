let sec = document.getElementsByClassName("content");

sec[0].addEventListener("click", showParagraph);
sec[1].addEventListener("click", showParagraph);
sec[2].addEventListener("click", showParagraph);

function showParagraph() {
  let i = 0;
  let classes = this.classList.toggle("active");
  for (i = 0; i < sec.length; i++) {
    if (sec[i].classList.contains("active")) {
      sec[i].style.backgroundColor = "crimson";
      sec[i].lastElementChild.style.display = "block";
      sec[i].childNodes[3].style.display = "none";
      sec[i].childNodes[5].style.display = "block";
      sec[i].childNodes[9].style.margin = "1px";
    } else {
      sec[i].style.backgroundColor = "aquamarine";
      sec[i].lastElementChild.style.display = "none";
      sec[i].childNodes[3].style.display = "block";
      sec[i].childNodes[5].style.display = "none";
    }
  }
}


