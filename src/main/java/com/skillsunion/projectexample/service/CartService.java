package com.skillsunion.projectexample.service;

import java.util.List;

import com.skillsunion.projectexample.entity.Cart;
import com.skillsunion.projectexample.entity.Catalogue;
import com.skillsunion.projectexample.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired CartRepository repo;
    
    public Cart add (int itemId, int quantity){

        Catalogue item = new Catalogue();
        item.setId(itemId);
        Cart cart = new Cart();
        cart.setItem(item);
        cart.setQuantity(quantity);        
        
        return repo.save(cart);
    }

    public List<Cart> list(){
        return (List<Cart>) repo.findAll();
    }
    
}
