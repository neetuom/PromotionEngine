package com.online.marketplace.service;

import com.online.marketplace.model.ShoppingCartItem;

import java.util.List;

/**
 *
 *  This class used to define the ShoppingCartItemServiceInt interface methods prototype
 *
 */
public interface ShoppingCartItemServiceInt {
    /**
     * This method fetch the getShoppingCartItemById
     *
     * @param id
     * @return ShoppingCartItem
     */
    public ShoppingCartItem getShoppingCartItemById(Integer id);

    /**
     * This method fetch the listOfShoppingCartItems
     *
     * @return List<ShoppingCartItem>
     */
    public List<ShoppingCartItem> listOfShoppingCartItems();

    /**
     * This method saveAllShoppingCartItems
     *
     * @param shoppingCartItem
     * @return String
     */
    public String saveAllShoppingCartItems(List<ShoppingCartItem> shoppingCartItem);

    /**
     *  This method updateShoppingCartItem By Id
     *
     * @param shoppingCartItem
     */
    public void updateShoppingCartItemForId(ShoppingCartItem shoppingCartItem);

    /**
     * This method deleteShoppingCartItem By Id
     *
     * @param id
     * @return Integer
     */
    public  boolean deleteShoppingCartItem(Integer id);
}
