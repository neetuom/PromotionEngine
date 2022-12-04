package com.online.marketplace;

import com.online.marketplace.model.Cart;

public class TestCart {

    public static void main(String[] args) {
        int price = 50;
        int quantity = 5;

        Cart cartObjA = new Cart();
        cartObjA.setPrice(50);
        cartObjA.setQuantity(5);
        cartObjA.setSku("A");

        if(cartObjA.getSku()=="A" )
        {
            cartObjA.setPrice(((cartObjA.getQuantity()/3) * 130) + ((cartObjA.getQuantity()%3) * cartObjA.getPrice()));
            System.out.println("price of SKU A :- " + cartObjA.getPrice());
        }


        Cart cartObjB = new Cart();
        cartObjB.setPrice(30);
        cartObjB.setQuantity(5);
        cartObjB.setSku("B");

        if(cartObjB.getSku()=="B" )
        {
            cartObjB.setPrice(((cartObjB.getQuantity()/2) * 45) + ((cartObjB.getQuantity()%2) * cartObjB.getPrice()));
            System.out.println("price of SKU B :- " + cartObjB.getPrice());
        }

        Cart cartObjC = new Cart();
        cartObjC.setPrice(20);
        cartObjC.setQuantity(5);
        cartObjC.setSku("C");

        if(cartObjC.getSku()=="C")
        {
            cartObjC.setPrice((cartObjC.getQuantity() * cartObjC.getPrice()));
            System.out.println("price of SKU C :- " + cartObjC.getPrice());
        }

        Cart cartObjD = new Cart();
        cartObjD.setPrice(15);
        cartObjD.setQuantity(5);
        cartObjD.setSku("D");

        if(cartObjD.getSku()=="D" )
        {
            cartObjD.setPrice((cartObjD.getQuantity() * cartObjD.getPrice()));
            System.out.println("price of SKU D :- " + cartObjD.getPrice());
        }

    }
}

/*
* "#{ shoppingcartitem.sku == 'A' ? '(((shoppingcartitem.quantity/3) * 130) + ((shoppingcartitem.quantity%3) * shoppingcartitem.price))' : 'shoppingcartitem.quantity'}"
* "#{ shoppingcartitem.sku == 'B' ? '(((shoppingcartitem.quantity/2) * 45) + ((shoppingcartitem.quantity%2) * shoppingcartitem.price))' : 'shoppingcartitem.quantity'}"
* "#{ shoppingcartitem.sku == 'C' ? '((shoppingcartitem.quantity * shoppingcartitem.price))' : 'shoppingcartitem.quantity'}"
* "#{ shoppingcartitem.sku == 'D' ? '((shoppingcartitem.quantity * shoppingcartitem.price))' : 'shoppingcartitem.quantity'}"
* */

