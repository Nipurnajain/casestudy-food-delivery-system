package com.hexaware.casestudy.service;

import java.util.List;

import com.hexaware.casestudy.entity.Cart;

public class CartServiceImp implements ICartService {

	@Override
	public Long addToCart(Long customerId, Long menuId, int quantity) {
		
		return null;
	}

	@Override
	public void removeFromCart(Long customerId, Long menuId) {
		

	}

	@Override
	public void updateCartQuantity(Long customerId, Long menuId, int newQuantity) {
		

	}

	@Override
	public List<Cart> getCartItems(Long userId) {
		
		return null;
	}

}
