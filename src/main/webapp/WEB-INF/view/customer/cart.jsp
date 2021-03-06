<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Ogani Template">
<meta name="keywords" content="Ogani, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Ogani | Template</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>

	<!-- Breadcrumb Section Begin -->
	<section class="breadcrumb-section set-bg"
		data-setbg="img/breadcrumb.jpg">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<div class="breadcrumb__text">
						<h2>Shopping Cart</h2>
						<div class="breadcrumb__option">
							<a href="./index.html">Home</a> <span>Shopping Cart</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Breadcrumb Section End -->

	<!-- Shoping Cart Section Begin -->
	<section class="shoping-cart spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="shoping__cart__table">
						<table>
							<thead>
								<tr>
									<th class="shoping__product">Products</th>
									<th>Price</th>
									<th>Quantity</th>
									<th>Total</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="i" items="${cartItemList}">
									<tr>
										<td class="shoping__cart__item" data-value="${i.cartId}"><img
											src="img/products/${i.categoryName}/${i.remoteName}" alt=""
											style="width: 200px; height: 150px;">
											<h5>${i.name}</h5></td>
										<td class="shoping__cart__price">${i.price}</td>
										<td class="shoping__cart__quantity">
											<div class="quantity">
												<div class="pro-qty">
													<input type="text" value="${i.count}" class="quantityVal"/>
												</div>
											</div>
										</td>
										<td class="shoping__cart__total">
										${i.price * i.count}
										</td>
										<td class="shoping__cart__item__close"><span
											class="icon_close"></span></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="shoping__cart__btns">
						<a href="#" class="primary-btn cart-btn">CONTINUE SHOPPING</a> <a
							href="#" class="primary-btn cart-btn cart-btn-right"><span
							class="icon_loading"></span> Upadate Cart</a>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="shoping__continue">
						<div class="shoping__discount">
							<h5>Discount Codes</h5>
							<form action="#">
								<input type="text" placeholder="Enter your coupon code">
								<button type="submit" class="site-btn">APPLY COUPON</button>
							</form>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="shoping__checkout">
						<h5>Cart Total</h5>
						<ul>
							<li>Total <span id="totProducts">${sum}</span></li>
						</ul>
						<a href="/checkout" class="primary-btn">PROCEED TO CHECKOUT</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Shoping Cart Section End -->

	<script type="text/javascript">
    let prices = document.getElementsByClassName("shoping__cart__price") // price ????????? ??????
    let totals = document.getElementsByClassName("shoping__cart__total") // total ????????? ??????
	let closes = document.getElementsByClassName("icon_close") // close Button ????????? ??????
	let decBtns = document.getElementsByClassName("dec qtybtn") // ???????????? ????????? ??????
	let incBtns = document.getElementsByClassName("inc qtybtn") // ???????????? ????????? ??????
    
	function addEvent(){
    	for(let i = 0; i < incBtns.length; i++){
    		incBtns[i].onclick = function(){
    			
    			let quans = document.getElementsByClassName("quantityVal") // quantity ????????? ?????? 
    			let sum = (Number(quans[i].value) + 1) * prices[i].textContent
    			totals[i].textContent = sum
    			
    			let totSum = 0
    			let newTotals = document.getElementsByClassName("shoping__cart__total")
    			for(let j = 0; j < newTotals.length; j++){
    				totSum += Number(newTotals[j].textContent)
    			}
    			let sa = document.getElementById("totProducts")
    			sa.textContent = totSum
    			
    		}
    		
    		decBtns[i].onclick = function(){
    			let quans = document.getElementsByClassName("quantityVal") // quantity ????????? ?????? 
    			let sum = (Number(quans[i].value) - 1) * prices[i].textContent
    			
    			if(Number(sum) < 0){
    				sum = 0
    			}
    			
    			totals[i].textContent = sum
    			
    			let totSum = 0
    			let newTotals = document.getElementsByClassName("shoping__cart__total")
    			for(let j = 0; j < newTotals.length; j++){
    				totSum += Number(newTotals[j].textContent)
    			}
    			let sa = document.getElementById("totProducts")
    			sa.textContent = totSum
    		}
    		
    		closes[i].onclick = function(){
    			let cartItem = document.getElementsByClassName('shoping__cart__item')
    			let cartId = cartItem[i].dataset.value
    			let addr = "/deleteCart?cartId=" + cartId
    					
    			window.location.href = addr
    		}
    	}
    }
	
	window.onload = addEvent
	
	</script>
</body>

</html>