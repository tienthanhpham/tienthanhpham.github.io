$(document).ready(function () {
  getCart();
  displayNumber();
  //Chon Category Tui
  $(".bag-categ").click(function (e) {
    e.preventDefault();
    let productList = document.querySelector(".product-list");
    productList.innerHTML = "";
    productList.innerHTML += `
    <a href="#" onclick="viewProductDetail(this)" class= "bag-categ" data-categ= "Tui" style = "text-decoration: none; color: black;">
        <div class="card ml-auto mr-auto" data-id="2" data-categ= "Tui" data-name="Túi thời trang" data-img="./images/bag1.jpeg" data-price="100000" data-incart="0" data-desc="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quae nostrum ipsam suscipit illo. Odit facere fuga, praesentium assumenda rerum doloribus veniam nisi sunt possimus molestiae aliquam libero, ipsum quam esse.">
          <div class="card-img ml-auto mr-auto">
            <img src="./images/bag1.jpeg" class="card-img-top w-50 ml-auto mr-auto" alt="...">
          </div>
          <div class="bestsell card-body">
              <div class="my-1 category">
                <div class="categ-icon"><img src="./images/bag.svg" width="20rem;" alt=""></div>
                <div class="categ-name ml-2">Túi</div>
              </div>
              <div class="my-1 category">
                <div class="prod-icon"><img src="./images/bag (1).svg"  width="20rem;" alt=""></div>
                <div class="prod-name ml-2">Túi thời trang</div>
              </div>
              <div class="my-1 category">
                <div class="price-icon"><img src="./images/price.svg"  width="20rem;" alt=""></div>
                <div class="ml-2">100.000 VND</div>
              </div>
          </div>
        </div>
    </a>
    <a href="#" class= "bag-categ" data-categ= "Tui" style = "text-decoration: none; color: black;">
        <div class="card ml-auto mr-auto" data-id="22" data-categ= "Tui" data-name="Túi thời trang" data-img="./images/bag3.jpeg" data-price="100000" data-incart="0" data-desc="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quae nostrum ipsam suscipit illo. Odit facere fuga, praesentium assumenda rerum doloribus veniam nisi sunt possimus molestiae aliquam libero, ipsum quam esse.">
          <div class="card-img ml-auto mr-auto">
            <img src="./images/bag3.jpeg" class="card-img-top w-50 ml-auto mr-auto" alt="...">
          </div>
          <div class="bestsell card-body">
              <div class="my-1 category">
                <div class="categ-icon"><img src="./images/bag.svg" width="20rem;" alt=""></div>
                <div class="categ-name ml-2">Túi</div>
              </div>
              <div class="my-1 category">
                <div class="prod-icon"><img src="./images/bag (1).svg"  width="20rem;" alt=""></div>
                <div class="prod-name ml-2">Túi thời trang</div>
              </div>
              <div class="my-1 category">
                <div class="price-icon"><img src="./images/price.svg"  width="20rem;" alt=""></div>
                <div class="ml-2">100.000 VND</div>
              </div>
          </div>
        </div>
    </a>
    <a href="#" class= "bag-categ" data-categ= "Tui" style = "text-decoration: none; color: black;">
        <div class="card ml-auto mr-auto" data-id="23" data-categ= "Tui" data-name="Túi thời trang" data-img="./images/bag4.jpeg" data-price="100000" data-incart="0" data-desc="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quae nostrum ipsam suscipit illo. Odit facere fuga, praesentium assumenda rerum doloribus veniam nisi sunt possimus molestiae aliquam libero, ipsum quam esse.">
          <div class="card-img ml-auto mr-auto">
            <img src="./images/bag4.jpeg" class="card-img-top w-50 ml-auto mr-auto" alt="...">
          </div>
          <div class="bestsell card-body">
              <div class="my-1 category">
                <div class="categ-icon"><img src="./images/bag.svg" width="20rem;" alt=""></div>
                <div class="categ-name ml-2">Túi</div>
              </div>
              <div class="my-1 category">
                <div class="prod-icon"><img src="./images/bag (1).svg"  width="20rem;" alt=""></div>
                <div class="prod-name ml-2">Túi thời trang</div>
              </div>
              <div class="my-1 category">
                <div class="price-icon"><img src="./images/price.svg"  width="20rem;" alt=""></div>
                <div class="ml-2">100.000 VND</div>
              </div>
          </div>
        </div>
    </a>
    `;
    $(".bag-categ a").css("font-weight", "bold");

    $(".male-categ a").css("font-weight", "normal");
    $(".female-categ a").css("font-weight", "normal");
    $(".footware-categ a").css("font-weight", "normal");
    $(".all-categ a").css("font-weight", "normal");
  });
  //Chon Category Giay dep
  $(".footware-categ").click(function (e) {
    e.preventDefault();
    let productList = document.querySelector(".product-list");
    productList.innerHTML = "";
    productList.innerHTML += `
      <a href="#" class= "footware-categ" data-categ= "Giay dep" style = "text-decoration: none; color: black;">
            <div class="card ml-auto mr-auto" data-categ= "Giay dep">
              <div class="card-img ml-auto mr-auto">
                <img src="./images/shoe1.jpeg" class="card-img-top w-50 ml-auto mr-auto" alt="...">
              </div>
              <div class="categ-name ml-auto mr-auto mb-3">Giày dép</div>
            </div>
          </a>
      `;
    $(".footware-categ a").css("font-weight", "bold");

    $(".male-categ a").css("font-weight", "normal");
    $(".female-categ a").css("font-weight", "normal");
    $(".bag-categ a").css("font-weight", "normal");
    $(".all-categ a").css("font-weight", "normal");
  });
  //Chon Category Do nam
  $(".male-categ").click(function (e) {
    e.preventDefault();
    let productList = document.querySelector(".product-list");
    productList.innerHTML = "";
    productList.innerHTML += `
        <a href="#" class= "male-categ" data-categ= "Do nam" style = "text-decoration: none; color: black;">
              <div class="card ml-auto mr-auto" data-categ= "Do nam">
                <div class="card-img ml-auto mr-auto">
                  <img src="./images/shirt1.jpg" class="card-img-top w-50 ml-auto mr-auto" alt="...">
                </div>
                <div class="categ-name ml-auto mr-auto mb-3">Đồ nam</div>
              </div>
            </a>
        `;
    $(".male-categ a").css("font-weight", "bold");

    $(".footware-categ a").css("font-weight", "normal");
    $(".female-categ a").css("font-weight", "normal");
    $(".bag-categ a").css("font-weight", "normal");
    $(".all-categ a").css("font-weight", "normal");
  });
  //Chon Category Do nu
  $(".female-categ").click(function (e) {
    e.preventDefault();
    let productList = document.querySelector(".product-list");
    productList.innerHTML = "";
    productList.innerHTML += `
          <a href="#" class= "female-categ" data-categ= "Do nu" style = "text-decoration: none; color: black;">
                <div class="card ml-auto mr-auto" data-categ= "Do nu">
                  <div class="card-img ml-auto mr-auto">
                    <img src="./images/women1.jpeg" class="card-img-top w-50 ml-auto mr-auto" alt="...">
                  </div>
                  <div class="categ-name ml-auto mr-auto mb-3">Đồ nữ</div>
                </div>
              </a>
          `;
    $(".female-categ a").css("font-weight", "bold");

    $(".male-categ a").css("font-weight", "normal");
    $(".footware-categ a").css("font-weight", "normal");
    $(".bag-categ a").css("font-weight", "normal");
    $(".all-categ a").css("font-weight", "normal");
  });
  //Chon All Category
  $(".all-categ").click(function (e) {
    e.preventDefault();
    $(".all-categ a").css("font-weight", "bold");

    $(".male-categ a").css("font-weight", "normal");
    $(".footware-categ a").css("font-weight", "normal");
    $(".bag-categ a").css("font-weight", "normal");
    $(".female-categ a").css("font-weight", "normal");
    location.reload(true);
  });

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
});
function viewProductDetail(product) {
  let productList = document.querySelector(".product-list");
  productList.innerHTML = "";
  productList.innerHTML += `
    <a href="#" onclick="viewProductDetail(this)" class= "bag-categ" data-categ= "Tui" style = "text-decoration: none; color: black;">
        <div class="card ml-auto mr-auto" data-id="2" data-categ= "Tui" data-name="Túi thời trang" data-img="./images/bag1.jpeg" data-price="100000" data-incart="0" data-desc="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quae nostrum ipsam suscipit illo. Odit facere fuga, praesentium assumenda rerum doloribus veniam nisi sunt possimus molestiae aliquam libero, ipsum quam esse.">
          <div class="card-img ml-auto mr-auto">
            <img src="./images/bag1.jpeg" class="card-img-top w-50 ml-auto mr-auto" alt="...">
          </div>
          <div class="bestsell card-body">
              <div class="my-1 category">
                <div id="choose" class="prod-selected" onclick="chooseProduct(this)">
                  <img src="./images/bag1.jpeg" style ="object-fit: cover;" class="card-img-top w-50 ml-auto mr-auto" alt="..."></div>
                <div class="prod-unselected" onclick="chooseProduct(this)">
                  <img src="./images/bag2.jpeg" style ="object-fit: cover;" class="card-img-top w-50 ml-auto mr-auto" alt="..."></div>
              </div>
          </div>
        </div>
    </a>
    <div class="product-info-detail d-flex flex-column align-items-start mt-2">
      <div class="product-desc">
        <h2>TÚI THỜI TRANG</h2>
        <div class="border-top w-25 ml-0 mb-2" style="border: 2px solid #e1e1e1;"></div>
        <div class="my-1 priceinfo">
          <div class="price-icon d-flex flex-row justify-content-center align-items-center"><img class="mr-2" style="width: 2rem;"src="./images/price.svg" alt="">
            <h4 class="m-auto"><strong>100.000 VND</strong></h4>
          </div>
        </div>  
        <p class="mt-3 mr-3 lead">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quae nostrum ipsam suscipit illo. Odit facere fuga, praesentium assumenda rerum doloribus veniam nisi sunt possimus molestiae aliquam libero, ipsum quam esse.</p>
        <div class="border-top w-25 ml-0 mb-2" style="border: 2px solid #e1e1e1;"></div>
      </div>
      <div class="product-add-to-cart mt-3 d-flex flex-row justify-content-start align-items-center">
        <div class="amountgroup d-flex flex-row justify-content-start align-items-center">
          <input onclick = "minus(this)" class="minus form-control w-25 text-center border-right-0 rounded-0" type="button" name="" value="-">
          <input class="amount w-25 form-control text-center border-right-0 rounded-0" type="text" name="" value="1">
          <input onclick = "plus(this)" class="plus form-control w-25 text-center rounded-0" type="button" name="" value="+">
        </div>
        <button onclick = "updateCartContent(this)" class="btn-addtocart btn btn-primary rounded-0 ml-3" type="button">CHO VÀO GIỎ</button>
      </div>
    </div>
    `;
}

function chooseProduct(product) {
  $(product).children().removeClass("selected");
  $(product).siblings().children().addClass("unselected");

  $(product)
    .parent()
    .parent()
    .prev()
    .children()
    .attr("src", "./images/bag2.jpeg");
  console.log($(product).parent().parent().prev().children().attr("src"));
}

//Plus click - Begin
function plus(plus) {
  console.log("Plus click");
  $(plus)
    .prev()
    .val(parseInt($(plus).prev().val()) + 1);
  //console.log($(this).parent().parent());
}
//Plus - End
//Minus - Begin
function minus(minus) {
  console.log("Minus click");
  let beforeMinus = parseInt($(minus).next().val());
  if (beforeMinus > 0) {
    $(minus)
      .next()
      .val(parseInt($(minus).next().val()) - 1);
  }
}
//Minus - End
//Update cart start
//add to cart click action function
function updateCartContent(product) {
  console.log($(product).parent().parent().prev().children());
  updateCart($(product).parent().parent().prev().children()); //call function to Update Cart Content
}
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
  updateStorage();
  displayCart();
  displayNumber();
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
  displayNumber();
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
  displayNumber();
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
        <div class="px-1 py-1">><img src="${item.img}" style="width:50px;"></div>
        <div style="display:flex; border-bottom: 0; flex-direction: column; align-items: center; justify-content: center">
          <div>${item.name}</div>
          <div class="price">${item.productCost}</div>
        </div>
      </div>
      <hr style="border:0.5px #f5f5f5 solid; width: 100%; ">
      `;
    });
    $(".totalcost").text(`${totalCost}`);
  }
  $("div.cartquickview").addClass("cartview-show");
  displayNumber();
}

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
