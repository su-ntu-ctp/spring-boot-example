package com.skillsunion.projectexample.controller;

import java.util.List;

import com.skillsunion.projectexample.entity.Cart;
import com.skillsunion.projectexample.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    
    @Autowired CartService service;

    @GetMapping("/carts")
    public @ResponseBody List<Cart> list(){
        return service.list();
    }

    @PostMapping("/carts")
    public @ResponseBody Cart create(@RequestBody AddCartRequestBody data){

        return service.add(data.getItemId(), data.getQuantity());
    }
    
}

class AddCartRequestBody {
    int itemId;
    int quantity;

    public AddCartRequestBody(){

    }

    public AddCartRequestBody(int itemId, int quantity){
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
