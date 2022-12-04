package com.online.marketplace;

import com.online.marketplace.controller.ShoppingCartItemRestControllerInt;
import com.online.marketplace.model.ShoppingCartItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;


/**
 *
 * This class is used to test the JUnit methods
 *
 */
@SpringBootTest
class PromotionEngineApplicationTests {

	/**
	 * ShoppingCartItemRestControllerInt  - Interface injection has been used.
	 *
	 */
	@Autowired
	private ShoppingCartItemRestControllerInt shoppingCartItemRestControllerInt;


	/**
	 * This methods fetch the listOfShoppingCartItems and test this method return value is not null.
	 *
	 */
	//@Test
	public void listOfShoppingCartItemsTest(){
		System.out.println("PromotionEngineApplicationTests ->  listOfShoppingCartItemsTest()");
		assertNotNull(shoppingCartItemRestControllerInt.listOfShoppingCartItems());

	}


	/**
	 * This methods fetch the getShoppingCartItemId and test this method return value is not null.
	 *
	 */

	//@Test
	public void getShoppingCartItemIdTest() {
      int shoppingCartItemId = 1;

		System.out.println("PromotionEngineApplicationTests ->  getShoppingCartItemIdTest()");

		assertNotNull(shoppingCartItemRestControllerInt.getShoppingCartItemId(shoppingCartItemId));
	}


	/**
	 * This methods submit the list of ShoppingCartItem object into addAllShoppingCartItems list and make sure to not return null value.
	 *
	 */
	//@Test
	public void addAllShoppingCartItemsTest() {
		System.out.println("PromotionEngineApplicationTests ->  addAllShoppingCartItemsTest()");

		List<ShoppingCartItem> shoppingCartItemObjList = new ArrayList<>();

		ShoppingCartItem shoppingCartItemObj1 = new ShoppingCartItem();
		shoppingCartItemObj1.setShoppingCartItemId(5);
		shoppingCartItemObj1.setProductId("PROD101");
		shoppingCartItemObj1.setCartId("CART001");
		shoppingCartItemObj1.setSkuType("A");
		shoppingCartItemObj1.setPrice(50);
		shoppingCartItemObj1.setDiscount(0);
		shoppingCartItemObj1.setQuantity(7);
		shoppingCartItemObj1.setActive(true);
		shoppingCartItemObj1.setCreatedAt(LocalDate.now());
		shoppingCartItemObj1.setUpdatedAt(LocalDate.now());


		ShoppingCartItem shoppingCartItemObj2 = new ShoppingCartItem();
		shoppingCartItemObj2.setShoppingCartItemId(6);
		shoppingCartItemObj2.setProductId("PROD102");
		shoppingCartItemObj2.setCartId("CART002");
		shoppingCartItemObj2.setSkuType("B");
		shoppingCartItemObj2.setPrice(30);
		shoppingCartItemObj2.setDiscount(0);
		shoppingCartItemObj2.setQuantity(8);
		shoppingCartItemObj2.setActive(true);
		shoppingCartItemObj2.setCreatedAt(LocalDate.now());
		shoppingCartItemObj2.setUpdatedAt(LocalDate.now());


		ShoppingCartItem shoppingCartItemObj3 = new ShoppingCartItem();
		shoppingCartItemObj3.setShoppingCartItemId(7);
		shoppingCartItemObj3.setProductId("PROD103");
		shoppingCartItemObj3.setCartId("CART003");
		shoppingCartItemObj3.setSkuType("C");
		shoppingCartItemObj3.setPrice(20);
		shoppingCartItemObj3.setDiscount(0);
		shoppingCartItemObj3.setQuantity(1);
		shoppingCartItemObj3.setActive(true);
		shoppingCartItemObj3.setCreatedAt(LocalDate.now());
		shoppingCartItemObj3.setUpdatedAt(LocalDate.now());


		ShoppingCartItem shoppingCartItemObj4 = new ShoppingCartItem();
		shoppingCartItemObj4.setShoppingCartItemId(8);
		shoppingCartItemObj4.setProductId("PROD104");
		shoppingCartItemObj4.setCartId("CART004");
		shoppingCartItemObj4.setSkuType("D");
		shoppingCartItemObj4.setPrice(15);
		shoppingCartItemObj4.setDiscount(0);
		shoppingCartItemObj4.setQuantity(1);
		shoppingCartItemObj4.setActive(true);
		shoppingCartItemObj4.setCreatedAt(LocalDate.now());
		shoppingCartItemObj4.setUpdatedAt(LocalDate.now());

		shoppingCartItemObjList.add(shoppingCartItemObj1);
		shoppingCartItemObjList.add(shoppingCartItemObj2);
		shoppingCartItemObjList.add(shoppingCartItemObj3);
		shoppingCartItemObjList.add(shoppingCartItemObj4);


		assertNotNull(shoppingCartItemRestControllerInt.addAllShoppingCartItems(shoppingCartItemObjList));
	}


	/**
	 * This methods takes the shoppingCartItemId and ShoppingCartItem to updated the existing record in the database.
	 *
	 */
	@Test
	public void updateShoppingCartItemTest() {

		int shoppingCartItemId = 1;

		ShoppingCartItem shoppingCartItemObj = new ShoppingCartItem();
		shoppingCartItemObj.setShoppingCartItemId(12);
		shoppingCartItemObj.setProductId("PROD104");
		shoppingCartItemObj.setCartId("CART004");
		shoppingCartItemObj.setSkuType("D");
		shoppingCartItemObj.setPrice(15);
		shoppingCartItemObj.setDiscount(0);
		shoppingCartItemObj.setQuantity(1);
		shoppingCartItemObj.setActive(true);
		shoppingCartItemObj.setCreatedAt(LocalDate.now());
		shoppingCartItemObj.setUpdatedAt(LocalDate.now());

		System.out.println("PromotionEngineApplicationTests ->  updateShoppingCartItemTest()");


		assertNotNull(shoppingCartItemRestControllerInt.updateShoppingCartItem(shoppingCartItemObj,shoppingCartItemId));
	}

}
