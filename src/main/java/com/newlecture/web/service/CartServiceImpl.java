package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.CartDao;
import com.newlecture.web.entity.Cart;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartDao cartDao;

	@Override
	public void registerCartItem(Cart cart) {
		cartDao.createCart(cart);
	}

	@Override
	public List<Cart> retrieveCartListByUserId(Long userId) {
		// TODO Auto-generated method stub
		return cartDao.retrieveCartListByUserId(userId);
	}

	@Override
	public void deleteCartByCartId(String cartId) {
		cartDao.deleteCartByCartId(cartId);
	}

	@Override
	public void deleteCartAll() {
		cartDao.deleteCartAll();
	}

	@Override
	public void deleteCartAllByUserId(long id) {
		cartDao.deleteCartAllByUserId(id);
	}

}
