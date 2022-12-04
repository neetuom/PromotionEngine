package com.online.marketplace.service;


import com.online.marketplace.model.Promos;
import com.online.marketplace.model.ShoppingCartItem;
import com.online.marketplace.repository.ShoppingCartItemRepositoryInt;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 *  This class used to implement the ShoppingCartItemServiceInt interface methods prototype
 *
 *  This class used Lombok
 *  @Service
 *  @Transactional
 *  @Getter
 *  @Setter
 *
 */
@Service
@Transactional
@Getter
@Setter
public class ShoppingCartItemServiceImpl implements ShoppingCartItemServiceInt {

    /**
     * StandardEvaluationContext used
     */
    private StandardEvaluationContext context;

    /**
     * Spring ExpressionParser used
     */
    private ExpressionParser parser;

    /**
     * Default constructor used to initialize the StandardEvaluationContext & ExpressionParser object
     */
    public ShoppingCartItemServiceImpl(){

         context = new StandardEvaluationContext();
         parser = new SpelExpressionParser();
    }

    /**
     * ShoppingCartItemRepositoryInt interface injection
     */
    @Autowired
    private ShoppingCartItemRepositoryInt shoppingCartItemRepository;

    /**
     * PromoServiceInt interface injection
     */
    @Autowired
    private PromoServiceInt promoService;

    /**
     * This method getShoppingCartItemById
     *
     * @param id
     * @return ShoppingCartItem
     */
    @Override
    public ShoppingCartItem getShoppingCartItemById(Integer id) {
        Optional<ShoppingCartItem> result =  shoppingCartItemRepository.findById(id);
        return result.orElse(null);
    }

    /**
     * This method fetch the listOfShoppingCartItems
     *
     * @return List<ShoppingCartItem>
     */
    @Override
    public List<ShoppingCartItem> listOfShoppingCartItems(){
        return (List<ShoppingCartItem>)shoppingCartItemRepository.findAll();
    }

    /**
     *  This method saveAllShoppingCartItems
     *
     * @param shoppingCartItemList
     * @return String
     */
    @Override
    public String saveAllShoppingCartItems(List<ShoppingCartItem> shoppingCartItemList) {

        List<Promos>  promosObjList = promoService.listOfPromos();

        float totalListShoppingCartItemsPrice = 0;

        // Get Promos from promosObjList
        for(Promos prommosObj:promosObjList) {

            // Get ShoppingCartItem from shoppingCartItemList
            for(ShoppingCartItem shoppingCartItem:shoppingCartItemList) {

                getContext().setRootObject(shoppingCartItem);

                float price =  getParser().parseExpression(prommosObj.getPromotionRule()).getValue(getContext(), Float.class);

                shoppingCartItem.setPrice(price);

                shoppingCartItemRepository.save(shoppingCartItem);

            }
        }

        List<ShoppingCartItem> listOfAllCartItemObj = shoppingCartItemRepository.findAll();

        for(ShoppingCartItem shoppingCartItem:listOfAllCartItemObj) {
            totalListShoppingCartItemsPrice += shoppingCartItem.getPrice();
        }
        return  " Order has been Successfully placed, Total Shopping Items Price is :- " + totalListShoppingCartItemsPrice;
    }

    /**
     * This method updateShoppingCartItemForId
     *
     * @param shoppingCartItem
     */
    @Override
    public void updateShoppingCartItemForId(ShoppingCartItem shoppingCartItem) {
         shoppingCartItemRepository.save(shoppingCartItem);
    }

    /**
     * This method deleteShoppingCartItem by ID
     *
     * @param id
     * @return boolean
     */
    @Override
    public  boolean deleteShoppingCartItem(Integer id) {
        try
        {
          shoppingCartItemRepository.deleteById(id);
          return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
