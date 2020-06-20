var delProduct;
$(document).ready(function () {
  getCart();
  displayProductForSettlement();
  //Display Cart on Settlement - Begin
  function displayProductForSettlement() {
    let cartItem = localStorage.getItem("productInCart"); //JSON
    cartItem = JSON.parse(cartItem);
    let totalQuantity = localStorage.getItem("totalQuantity");
    let totalCost = localStorage.getItem("totalCost");
    $("#cartquantity").text(totalQuantity);
    let productContainer = document.querySelector(".products");
    if (cartItem && productContainer) {
      productContainer.innerHTML = "";
      Object.values(cartItem).map((item) => {
        productContainer.innerHTML += `
                <div class="product">
                    <img src="${item.img}">
                    <span style="padding: 0 1rem;"> ${item.name} </span>
                    <span class="del" data-toggle="modal" data-target="#deleteModal">
                      <i class="far fa-trash-alt"></i>
                    </span>
                </div>
                <div class="quantity" data-id=${item.id} data-categ= ${item.categ} data-name=${item.name} data-price=${item.price}>
                  <div class="amountgroup d-flex flex-row align-items-center">
                    <input class="minus form-control w-25 text-center border-right-0 rounded-0" type="button" name="" value="-">
                    <input class="amount form-control w-25 text-center border-right-0 rounded-0" type="text" name="" value="${item.incart}">
                    <input class="plus form-control w-25 text-center rounded-0" type="button" name="" value="+">
                  </div>
                </div>
                <div class="price">${item.price}</div>
                <div class="total">${item.productCost}</div>
                `;
      });
      $(".totalcost").text(`${totalCost}`);
    }
    displayNumber();
  }
  //Display Cart on Settlement - End

  //GetCart on Load - Begin
  function getCart() {
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
        <div class="px-1 py-1"><img src="${item.img}" style="width:50px;"></div>
        <div style="display:flex; flex-direction: column; align-items: center; justify-content: center">
          <div>${item.name}</div>
          <div class="cartprice">${item.productCost}</div>
        </div>
      </div>
      <hr style="border:0.5px #f5f5f5 solid; width: 100%;">
      `;
      });
      $(".totalcost").text(`${totalCost}`);
    }
    displayNumber();
  }
  //GetCart on Load - End

  //Display Number - Begin
  function displayNumber() {
    $(".total").each(function (index, element) {
      money = $(element).text();
      $(element).text(
        money.replace(/\D/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",")
      );
    });
    $(".price").each(function (index, element) {
      money = $(element).text();
      $(element).text(
        money.replace(/\D/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",")
      );
    });
    $(".totalcost").each(function (index, element) {
      money = $(element).text();
      $(element).text(
        money.replace(/\D/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",")
      );
    });
    $(".cartprice").each(function (index, element) {
      money = $(element).text();
      $(element).text(
        money.replace(/\D/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",")
      );
    });
  }
  //Display Number - End
  //Plus click - Begin
  $("input.plus").click(function (e) {
    e.preventDefault();
    console.log("Plus click");
    $(this)
      .prev()
      .val(parseInt($(this).prev().val()) + 1);
    //console.log($(this).parent().parent());
    updateCart($(this).parent().parent(), "plus"); //call function to Update Cart Content
    getCart();
  });
  //Plus - End
  //Minus - Begin
  $("input.minus").click(function (e) {
    e.preventDefault();
    let beforeMinus = parseInt($(this).next().val());
    if (beforeMinus > 0) {
      $(this)
        .next()
        .val(parseInt($(this).next().val()) - 1);
      updateCart($(this).parent().parent(), "minus"); //call function to Update Cart Content
      displayNumber();
      getCart();
    }
  });
  //Minus - End
  //Update Cart - Begin
  function updateCart(product, operator) {
    // let amount = parseInt($(".amount").val()); //Convert amount to number
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
      if (operator == "plus") {
        if (
          Object.keys(cartItem).find(
            (element) => (element = productData.id.toString())
          )
        ) {
          cartItem[productData.id].incart += 1;
          cartItem[productData.id].productCost =
            cartItem[productData.id].incart * cartItem[productData.id].price;
          product.next().next().html(cartItem[productData.id].productCost);
        }
      }
      if (operator == "minus") {
        if (
          Object.keys(cartItem).find(
            (element) => (element = productData.id.toString())
          )
        ) {
          cartItem[productData.id].incart -= 1;
          cartItem[productData.id].productCost =
            cartItem[productData.id].incart * cartItem[productData.id].price;
          product.next().next().html(cartItem[productData.id].productCost);
        }
      }
    }

    localStorage.setItem("productInCart", JSON.stringify(cartItem)); //Obj -> JSON -> Update/insert LocalStorage

    updateStorage();
    displayNumber();
    getCart();
  }
  //Update Cart - End

  //Update Total Cost - Begin
  function updateStorage() {
    // let totalQuantity = localStorage.getItem("totalQuantity");
    // let totalCost = localStorage.getItem("totalCost"); //Text - Check if totalCost exist in localStorage
    let cartItem = localStorage.getItem("productInCart"); //JSON
    cartItem = JSON.parse(cartItem); //JSON to object
    let totalQuantity = 0;
    let totalCost = 0;
    if (cartItem != null) {
      for (let i = 0; i < Object.keys(cartItem).length; i++) {
        totalQuantity = totalQuantity + Object.values(cartItem)[i].incart;
        totalCost =
          totalCost +
          Object.values(cartItem)[i].incart * Object.values(cartItem)[i].price;
      }
      localStorage.setItem("totalCost", totalCost);
      localStorage.setItem("totalQuantity", totalQuantity);
      $("#cartquantity").html(totalQuantity);
      $(".totalcost").html(totalCost);
    }
  }
  //Update TotalCost - End

  //Delete whole item from Cart - Begin
  $(".del").click(function (e) {
    e.preventDefault();
    delProduct = $(this).parent().next();
    // $("#btn-del").on("click", deleteCart(delProduct));
  });

  $("#btn-del").click(function (e) {
    e.preventDefault();
    deleteCart(delProduct); //call Delete item function
  });
  //Delete whole item from Cart - End

  //Delete item function - Begin
  function deleteCart(product) {
    let productData = product.data(); //object
    let cartItem = localStorage.getItem("productInCart"); //JSON
    cartItem = JSON.parse(cartItem); //JSON to object

    if (
      //Neu tim thay trong localstorage
      Object.keys(cartItem).find(
        (element) => (element = productData.id.toString())
      )
    ) {
      console.log(cartItem[productData.id]);
      delete cartItem[productData.id];
    }

    localStorage.setItem("productInCart", JSON.stringify(cartItem)); //Obj -> JSON -> Update/insert LocalStorage
    updateStorage();
    location.reload(true);
  }
  //Delete item function - End
});
