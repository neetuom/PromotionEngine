
 Promotion Engine :- This application is developed to calculate price of the shopping cart items after applying promotions at the product level.


 Technology Stack:-
 1). Java 1.17
 2). Spring Boot 2.6.3
 3). JUnit 1.16.2
 4). Lombok 1.18.24
 5). Spring Expression Language 5.3.24
 6). JPA 2.6.3
 7). MySQL 8.0.19
 8). Gradle 7.3.3
 9) Swagger Open API 1.6.13


 Swagger  Open API URL :- Open API is used for contract first design approach and testing.

 1). http://localhost:8085/swagger-ui.html
 2). http://localhost:8085/promotion-docs/


 HTTP_POST Method Request Data
         -------------------------------

         [
            {
             "shoppingCartItemId": 0,
             "productId": "PROD101",
             "cartId": "CART001",
             "skuType": "A",
             "price": 50,
             "discount": 0,
             "quantity": 5,
             "active": true,
             "createdAt": "2022-11-29",
             "updatedAt": "2022-11-29"
           },
           {
             "shoppingCartItemId": 0,
             "productId": "PROD102",
             "cartId": "CART002",
             "skuType": "B",
             "price": 30,
             "discount": 0,
             "quantity": 5,
             "active": true,
             "createdAt": "2022-11-29",
             "updatedAt": "2022-11-29"
           },
           {
             "shoppingCartItemId": 0,
             "productId": "PROD103",
             "cartId": "CART003",
             "skuType": "C",
             "price": 20,
             "discount": 0,
             "quantity": 1,
             "active": true,
             "createdAt": "2022-11-29",
             "updatedAt": "2022-11-29"
           },
           {
             "shoppingCartItemId": 0,
             "productId": "PROD104",
             "cartId": "CART004",
             "skuType": "D",
             "price": 15,
             "discount": 0,
             "quantity": 1,
             "active": true,
             "createdAt": "2022-11-29",
             "updatedAt": "2022-11-29"
           }
         ]


       DB Schema :- refer 'DBSchema.sql' file for sql script.




