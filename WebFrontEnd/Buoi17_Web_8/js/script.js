$(function() {
  let newFragment = $("<h1>");
  newFragment.text("Before ul");
  console.log(newFragment);
  $("ul").before(newFragment);
});
