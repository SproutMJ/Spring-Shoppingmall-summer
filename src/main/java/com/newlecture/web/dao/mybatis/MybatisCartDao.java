package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.CartDao;
import com.newlecture.web.entity.Cart;

@Repository
public class MybatisCartDao implements CartDao {

	private CartDao mapper;
	
	@Autowired
	public MybatisCartDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(CartDao.class);
	}

	@Override
	public void createCart(Cart cart) {
		mapper.createCart(cart);
	}

	@Override
	public Cart retrieveCartbyId(long id) {
		return mapper.retrieveCartbyId(id);
	}

	@Override
	public List<Cart> retrieveCartListByUserId(Long userId) {
		// TODO Auto-generated method stub
		return mapper.retrieveCartListByUserId(userId);
	}

	@Override
	public void deleteCartByCartId(String cartId) {
		mapper.deleteCartByCartId(cartId);
	}

	@Override
	public void deleteCartAll() {
		mapper.deleteCartAll();
		
	}

	@Override
	public void deleteCartAllByUserId(long id) {
		mapper.deleteCartAllByUserId(id);
	}
	
}
