package com.online.marketplace.controller;


import com.online.marketplace.model.ShoppingCartItem;
import com.online.marketplace.service.ShoppingCartItemServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;


/**
 *
 *  This class used to implement the ShoppingCartItemRestControllerInt interface methods prototype
 *
 */
@RestController
@RequestMapping("/cartitem")
public class ShoppingCartItemRestControllerImpl implements  ShoppingCartItemRestControllerInt {

    /**
     *  ShoppingCartItemServiceInt interface injection
     */
    @Autowired
    private ShoppingCartItemServiceInt shoppingCartItemServiceInt;


    /**
     * This methods returns all the listOfShoppingCartItems
     *
     * @return List<ShoppingCartItem>
     */
    @Override
    public List<ShoppingCartItem> listOfShoppingCartItems(){
        System.out.println("ShoppingCart controller -> listOfShoppingCartItems");
        return (List<ShoppingCartItem>)shoppingCartItemServiceInt.listOfShoppingCartItems();
    }

    /**
     * This methods returns the getShoppingCartItemId
     *
     * @param id
     * @return ResponseEntity<ShoppingCartItem>
     */
    @Override
    public ResponseEntity<ShoppingCartItem> getShoppingCartItemId(@PathVariable Integer id) {
        try{
            //Integer longId = Integer.parseInt(id);
            ShoppingCartItem shoppingCartItem = shoppingCartItemServiceInt.getShoppingCartItemById(id);
            return new ResponseEntity<ShoppingCartItem>(shoppingCartItem, HttpStatus.OK);
        }catch(NoSuchElementException noSuchElementException) {
            return new ResponseEntity<ShoppingCartItem>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * This methods returns the addAllShoppingCartItems
     *
     * @param shoppingCartItem
     * @return ResponseEntity<?>
     */
    @Override
    public ResponseEntity<?>  addAllShoppingCartItems(@RequestBody List<ShoppingCartItem> shoppingCartItem){

        float totalListShoppingCartItemsPrice = 0;


            if(shoppingCartItem!=null && !shoppingCartItem.isEmpty()) {

                String totalOrderPrice = shoppingCartItemServiceInt.saveAllShoppingCartItems(shoppingCartItem);

                return new ResponseEntity<> (totalOrderPrice ,HttpStatus.OK);

            } else {
                return new ResponseEntity<> (" Order has not been placed !",HttpStatus.OK);
            }

    }

    /**
     * This methods returns the updatedShoppingCartItem
     *
     * @param shoppingCartItem
     * @param id
     * @return ResponseEntity<?>
     */
    @Override
    public  ResponseEntity<?> updateShoppingCartItem(@RequestBody ShoppingCartItem shoppingCartItem,@PathVariable Integer id) {
        try{
            //Integer longId = Integer.parseInt(id);
            ShoppingCartItem shoppingCartItemObj = shoppingCartItemServiceInt.getShoppingCartItemById(id);
            shoppingCartItemObj.setShoppingCartItemId(id);
            shoppingCartItemServiceInt.updateShoppingCartItemForId(shoppingCartItem);
            return new ResponseEntity<> (HttpStatus.OK);
        }catch(NoSuchElementException noSuchElementException){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * This methods returns the deleteShoppingCartItem
     *
     * @param id
     * @return ResponseEntity<?>
     */
    @Override
    public ResponseEntity<?> deleteShoppingCartItem(@PathVariable Integer id) {
        //Integer longId = Integer.parseInt(id);
        if(id>0) {
            if(shoppingCartItemServiceInt.deleteShoppingCartItem(id)) {
                return new ResponseEntity<> (" ShoppingCartItem has been deleted",HttpStatus.OK);
            } else {
                return new ResponseEntity<> (" Can't delete the ShoppingCartItem",HttpStatus.OK);
            }
        }
        return new ResponseEntity<> (" Invalid id!",HttpStatus.OK);
    }
}
