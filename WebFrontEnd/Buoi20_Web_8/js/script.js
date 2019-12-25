$(".toggle").on("click", accountToggle);
$(".navtimes").on("click", accountToggle);
$(".navbar-toggler-icon").on("click", accountToggle);

function accountToggle() {
  $(".usershow").toggleClass("d-none");
  //   $(".usershow").animate({
  //     height: "toggle"
  //   });
  $(".fa-chevron-up").toggleClass("d-none");
  $(".fa-chevron-down").toggleClass("d-none");
  $(".navtimes").toggleClass("d-none");
  $(".navbar-toggler-icon").toggleClass("d-none");
}
