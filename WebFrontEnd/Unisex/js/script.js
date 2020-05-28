$(document).ready(function () {
  //Catch changeText of SearchList dropdown button
  $("div.searchlist a.dropdown-item").click(function (e) {
    e.preventDefault();
    $("#search-head").text($(this).text());
  });
  //Show maximum 4 cards
  //Best selling
  for (let i = 0; i < $(".bestsellcards .col-md-3.col-12").length; i++) {
    if (i >= 4)
      $(".bestsellcards .col-md-3.col-12").eq(i).addClass("card-disappear");
  }
  //New product
  for (let i = 0; i < $(".newproductcard .col-md-3.col-12").length; i++) {
    if (i >= 4)
      $(".newproductcard .col-md-3.col-12").eq(i).addClass("card-disappear");
  }
  //Impressive product
  for (
    let i = 0;
    i < $(".impressiveproductcard .col-md-3.col-12").length;
    i++
  ) {
    if (i >= 4)
      $(".impressiveproductcard .col-md-3.col-12")
        .eq(i)
        .addClass("card-disappear");
  }
  //all product category
  for (let i = 0; i < $(".allproductcard .col-md-3.col-12").length; i++) {
    if (i >= 4)
      $(".allproductcard .col-md-3.col-12").eq(i).addClass("card-disappear");
  }

  // Best Selling Previous Button - Forward Slide
  $(".best-selling .prev-next-button.previous").on("click", function () {
    let _last = $(".bestsellcards .col-md-3.col-12").last();
    _last.prependTo(".bestsellcards");
    for (let i = 0; i < $(".bestsellcards .col-md-3.col-12").length; i++) {
      if (i >= 4) {
        $(".bestsellcards .col-md-3.col-12").eq(i).addClass("card-disappear");
        $(".bestsellcards .col-md-3.col-12").eq(i).removeClass("card-appear");
      } else {
        $(".bestsellcards .col-md-3.col-12").eq(i).addClass("card-appear");
        $(".bestsellcards .col-md-3.col-12")
          .eq(i)
          .removeClass("card-disappear");
      }
    }

    $(".bestsellcards").removeClass("move-backward");
    $(".bestsellcards").addClass("move-forward");
    setTimeout(function () {
      $(".bestsellcards").removeClass("move-forward");
    }, 500);
  });

  // Best Selling Next Button - Backward Slide
  $(".best-selling .prev-next-button.next").on("click", function () {
    let _first = $(".bestsellcards .col-md-3.col-12").first();
    _first.appendTo(".bestsellcards");
    for (let i = 0; i < $(".bestsellcards .col-md-3.col-12").length; i++) {
      if (i >= 4) {
        $(".bestsellcards .col-md-3.col-12").eq(i).addClass("card-disappear");
        $(".bestsellcards .col-md-3.col-12").eq(i).removeClass("card-appear");
      } else {
        $(".bestsellcards .col-md-3.col-12").eq(i).addClass("card-appear");
        $(".bestsellcards .col-md-3.col-12")
          .eq(i)
          .removeClass("card-disappear");
      }
    }
    $(".bestsellcards").removeClass("move-forward");
    $(".bestsellcards").addClass("move-backward");
    setTimeout(function () {
      $(".bestsellcards").removeClass("move-backward");
    }, 500);
  });

  //New Product Previous Button - Forward Slide
  $(".new-products .prev-next-button.previous").on("click", function () {
    let _last = $(".newproductcard .col-md-3.col-12").last();
    _last.prependTo(".newproductcard");
    for (let i = 0; i < $(".newproductcard .col-md-3.col-12").length; i++) {
      if (i >= 4) {
        $(".newproductcard .col-md-3.col-12").eq(i).addClass("card-disappear");
        $(".newproductcard .col-md-3.col-12").eq(i).removeClass("card-appear");
      } else {
        $(".newproductcard .col-md-3.col-12").eq(i).addClass("card-appear");
        $(".newproductcard .col-md-3.col-12")
          .eq(i)
          .removeClass("card-disappear");
      }
    }

    $(".newproductcard").removeClass("move-backward");
    $(".newproductcard").addClass("move-forward");
    setTimeout(function () {
      $(".newproductcard").removeClass("move-forward");
    }, 500);
  });

  // New Product Next Button - Backward Slide
  $(".new-products .prev-next-button.next").on("click", function () {
    let _first = $(".newproductcard .col-md-3.col-12").first();
    _first.appendTo(".newproductcard");
    for (let i = 0; i < $(".newproductcard .col-md-3.col-12").length; i++) {
      if (i >= 4) {
        $(".newproductcard .col-md-3.col-12").eq(i).addClass("card-disappear");
        $(".newproductcard .col-md-3.col-12").eq(i).removeClass("card-appear");
      } else {
        $(".newproductcard .col-md-3.col-12").eq(i).addClass("card-appear");
        $(".newproductcard .col-md-3.col-12")
          .eq(i)
          .removeClass("card-disappear");
      }
    }
    $(".newproductcard").removeClass("move-forward");
    $(".newproductcard").addClass("move-backward");
    setTimeout(function () {
      $(".newproductcard").removeClass("move-backward");
    }, 500);
  });

  //Impressive Product Previous Button - Forward Slide
  $(".impressive-products .prev-next-button.previous").on("click", function () {
    let _last = $(".impressiveproductcard .col-md-3.col-12").last();
    _last.prependTo(".impressiveproductcard");
    for (
      let i = 0;
      i < $(".impressiveproductcard .col-md-3.col-12").length;
      i++
    ) {
      if (i >= 4) {
        $(".impressiveproductcard .col-md-3.col-12")
          .eq(i)
          .addClass("card-disappear");
        $(".impressiveproductcard .col-md-3.col-12")
          .eq(i)
          .removeClass("card-appear");
      } else {
        $(".impressiveproductcard .col-md-3.col-12")
          .eq(i)
          .addClass("card-appear");
        $(".impressiveproductcard .col-md-3.col-12")
          .eq(i)
          .removeClass("card-disappear");
      }
    }

    $(".impressiveproductcard").removeClass("move-backward");
    $(".impressiveproductcard").addClass("move-forward");
    setTimeout(function () {
      $(".impressiveproductcard").removeClass("move-forward");
    }, 500);
  });

  // Impressive Product Next Button - Backward Slide
  $(".impressive-products .prev-next-button.next").on("click", function () {
    let _first = $(".impressiveproductcard .col-md-3.col-12").first();
    _first.appendTo(".impressiveproductcard");
    for (
      let i = 0;
      i < $(".impressiveproductcard .col-md-3.col-12").length;
      i++
    ) {
      if (i >= 4) {
        $(".impressiveproductcard .col-md-3.col-12")
          .eq(i)
          .addClass("card-disappear");
        $(".impressiveproductcard .col-md-3.col-12")
          .eq(i)
          .removeClass("card-appear");
      } else {
        $(".impressiveproductcard .col-md-3.col-12")
          .eq(i)
          .addClass("card-appear");
        $(".impressiveproductcard .col-md-3.col-12")
          .eq(i)
          .removeClass("card-disappear");
      }
    }
    $(".impressiveproductcard").removeClass("move-forward");
    $(".impressiveproductcard").addClass("move-backward");
    setTimeout(function () {
      $(".impressiveproductcard").removeClass("move-backward");
    }, 500);
  });

  //All Product Previous Button - Forward Slide
  $(".all-products .prev-next-button.previous").on("click", function () {
    let _last = $(".allproductcard .col-md-3.col-12").last();
    _last.prependTo(".allproductcard");
    for (let i = 0; i < $(".allproductcard .col-md-3.col-12").length; i++) {
      if (i >= 4) {
        $(".allproductcard .col-md-3.col-12").eq(i).addClass("card-disappear");
        $(".allproductcard .col-md-3.col-12").eq(i).removeClass("card-appear");
      } else {
        $(".allproductcard .col-md-3.col-12").eq(i).addClass("card-appear");
        $(".allproductcard .col-md-3.col-12")
          .eq(i)
          .removeClass("card-disappear");
      }
    }

    $(".allproductcard").removeClass("move-backward");
    $(".allproductcard").addClass("move-forward");
    setTimeout(function () {
      $(".allproductcard").removeClass("move-forward");
    }, 500);
  });

  // All Product Next Button - Backward Slide
  $(".all-products .prev-next-button.next").on("click", function () {
    let _first = $(".allproductcard .col-md-3.col-12").first();
    _first.appendTo(".allproductcard");
    for (let i = 0; i < $(".allproductcard .col-md-3.col-12").length; i++) {
      if (i >= 4) {
        $(".allproductcard .col-md-3.col-12").eq(i).addClass("card-disappear");
        $(".allproductcard .col-md-3.col-12").eq(i).removeClass("card-appear");
      } else {
        $(".allproductcard .col-md-3.col-12").eq(i).addClass("card-appear");
        $(".allproductcard .col-md-3.col-12")
          .eq(i)
          .removeClass("card-disappear");
      }
    }
    $(".allproductcard").removeClass("move-forward");
    $(".allproductcard").addClass("move-backward");
    setTimeout(function () {
      $(".allproductcard").removeClass("move-backward");
    }, 500);
  });
  //Show modal product (shoe) - Start
  $(".viewproduct").click(function (e) {
    $(".product-view-modal").addClass("modal-appear");
    $(".bg-for-modal").addClass("bg-appear");
    //Get product info as data or the column of card's parent
    let data = $(this).parent().parent().data();
    //Update product-desc div with data got
    $(".product-desc").data(data);
    //Update product image with image link from data got
    document.getElementsByClassName(
      "product-info-image"
    )[0].style.backgroundImage = `url(${data.img})`;

    //Display product desc with its got data
    document.querySelector(".product-desc").innerHTML = `
    <h2>${data.name}</h2>
              <div class="border-top w-25 ml-0 mb-2" style="border: 2px solid #e1e1e1;"></div>
              <div class="my-1 priceinfo">
                <div class="price-icon d-flex flex-row justify-content-center align-items-center"><img class="mr-2" style="width: 2rem;"src="./images/price.svg" alt="">
                  <h4 class="m-auto"><strong>${data.price} VND</strong></h4>
                </div>
              </div>  
              <p class="mt-3 mr-3 lead">${data.desc}</p>
              <div class="border-top w-25 ml-0 mb-2" style="border: 2px solid #e1e1e1;"></div>
    `;
  });
  //Off modal if click outside
  $(".bg-for-modal").click(function (e) {
    e.preventDefault();
    $(".bg-for-modal").removeClass("bg-appear");
    $(".product-view-modal").removeClass("modal-appear");
  });

  //Show Cartview if click on Account area
  $(".account").click(function (e) {
    $("div.cartquickview").addClass("cartview-show");
  });
  //Close CartView if click outside Account Area or outside Add To Cart button
  $("html, body").click(function (e) {
    if (
      !$(e.target).closest(".account").length &&
      !$(e.target).closest(".btn-addtocart").length
    )
      $("div.cartquickview").removeClass("cartview-show");
  });

  //Off modal if click close
  $(".close").click(function (e) {
    e.preventDefault();
    $(".bg-for-modal").removeClass("bg-appear");
    $(".product-view-modal").removeClass("modal-appear");
  });
  //Plus click
  $("input.plus").click(function (e) {
    e.preventDefault();
    $("input.amount").val(parseInt($("input.amount").val()) + 1);
  });
  //Minus click
  $("input.minus").click(function (e) {
    e.preventDefault();
    let _val = $("input.amount").val(parseInt($("input.amount").val()) - 1);
    if (_val.val() <= 0) $("input.amount").val(0);
  });
  //Show modal product (shoe) - End

  //Update cart start
  //add to cart click action function
  $(".product-add-to-cart button").click(function (e) {
    e.preventDefault();
    updateCart($(this).parent().siblings()); //call function to Update Cart Content
  });
  //function update Cart content after each click of Add to cart
  function updateCart(product) {
    let amount = parseInt($(".amount").val()); //Convert amount to number
    let productData = product.data(); //object
    let cartItem = localStorage.getItem("productInCart"); //JSON
    cartItem = JSON.parse(cartItem); //JSON to object

    if (cartItem != null) {
      //Neu da co productInCart trong LocalStorage
      if (Object.keys(cartItem).includes(productData.id.toString()) == false) {
        // Chua co san pham ddo trong productInCart
        cartItem = {
          //add product(object) selected to cartItem
          ...cartItem,
          [productData.id]: productData,
        };
      }
      //Cap nhat incart va productCost
      if (
        Object.keys(cartItem).find(
          (element) => (element = productData.id.toString())
        )
      ) {
        cartItem[productData.id].incart += amount;
        cartItem[productData.id].productCost =
          cartItem[productData.id].incart * cartItem[productData.id].price;
      }
    } else {
      //Chua co gi trong LocalStorage
      cartItem = { [productData.id]: productData }; //add product selected to cartItem
      //Cap nhat incart va productCost
      cartItem[productData.id].incart = amount;
      cartItem[productData.id].productCost =
        cartItem[productData.id].incart * cartItem[productData.id].price;
    }
    localStorage.setItem("productInCart", JSON.stringify(cartItem)); //Obj -> JSON -> Update/insert LocalStorage
    updateNumbers();
    updateCost(product);
    displayCart();
  }
  function updateNumbers() {
    let amount = parseInt($(".amount").val());
    let totalQuantity = localStorage.getItem("totalQuantity"); //Text - Check if totalQuantity exist in localStorage

    if (totalQuantity != null) {
      totalQuantity = parseInt(totalQuantity);
      totalQuantity += amount;
    } else totalQuantity = amount;

    localStorage.setItem("totalQuantity", totalQuantity);
    // $("#cartquantity").text(totalQuantity);
  }
  function updateCost(product) {
    let amount = parseInt($(".amount").val());
    let productData = product.data(); //object
    let totalCost = localStorage.getItem("totalCost"); //Text - Check if totalCost exist in localStorage

    if (totalCost != null) {
      totalCost = parseInt(totalCost);
      totalCost = totalCost + productData.price * amount;
    } else totalCost = productData.price * amount;

    localStorage.setItem("totalCost", totalCost);
  }
  function displayCart() {
    let cartItem = localStorage.getItem("productInCart"); //JSON
    cartItem = JSON.parse(cartItem);
    let totalQuantity = localStorage.getItem("totalQuantity");
    let totalCost = localStorage.getItem("totalCost");

    $("#cartquantity").text(totalQuantity);

    if (cartItem && $(".cartcontainer")) {
      $(".cartcontainer").html("");
      Object.values(cartItem).map((item) => {
        document.querySelector(".cartcontainer").innerHTML += `
      <div style="display:flex">
        <div><img src="${item.img}" style="width:50px;"></div>
        <div style="display:flex; flex-direction: column; align-items: center; justify-content: center">
          <div>${item.name}</div>
          <div>${item.productCost}</div>
        </div>
      </div>
      <hr style="border:0.5px #f5f5f5 solid; width: 100%; ">
      `;
      });
      $(".totalcost").text(`${totalCost}`);
    }
    $("div.cartquickview").addClass("cartview-show");
  }
  //Update cart end

  //Countdown sale
  $("#clock").countdown("2020/05/10", function (event) {
    $(this).html(event.strftime("%D days %H:%M:%S"));
  });
});
