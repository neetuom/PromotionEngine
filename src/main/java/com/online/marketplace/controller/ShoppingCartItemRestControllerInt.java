package com.online.marketplace.controller;

import com.online.marketplace.model.ShoppingCartItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *
 *  This class used to define the ShoppingCartItemRestControllerInt interface methods prototype
 *
 */
@RequestMapping("/default")
public interface ShoppingCartItemRestControllerInt {

    /**
     *  This methods return listOfShoppingCartItems
     * @return List<ShoppingCartItem>
     */
    @GetMapping("/all")
    public List<ShoppingCartItem> listOfShoppingCartItems();

    /**
     * This methods return getShoppingCartItemId
     * @param id
     * @return ResponseEntity<ShoppingCartItem>
     */
    @GetMapping("/{id}")
    public ResponseEntity<ShoppingCartItem> getShoppingCartItemId(Integer id);

    /**
     * This methods return addAllShoppingCartItems
     * @param shoppingCartItem
     * @return ResponseEntity<?>
     */
    @PostMapping("/")
    public ResponseEntity<?>  addAllShoppingCartItems(List<ShoppingCartItem> shoppingCartItem);

    /**
     * This methods return updateShoppingCartItem
     * @param shoppingCartItem
     * @param id
     * @return ResponseEntity<?>
     */
    @PutMapping("/{id}")
    public  ResponseEntity<?> updateShoppingCartItem(ShoppingCartItem shoppingCartItem,Integer id);

    /**
     * This methods return deleteShoppingCartItem
     * @param id
     * @return ResponseEntity<?>
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteShoppingCartItem(Integer id);
}
