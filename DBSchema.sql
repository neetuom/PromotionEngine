

  DB URL :- https://vizdiff.blogspot.com/2021/05/creating-kanban-board-in-tableau.html

  Problem Statement 1: Promotion Engine

  Active Promotions - I).   3 of A's for 130       -  if (A/3)=0 && if(A%3)=0 ? A/3 + A%2 : 0
                      II).  2 of B's for 45        -  if (B/2)=0 && if(B%2) ? B/2 + B%2 : 0
                      III). C & D for 30           -  if C+D ? 30 : 0


  Unit price for SKU IDs I).   A 50 
                         II).  B 30 
                         III). C 20 
                         IV).  D 15




       shoppingcartitem.skuType == 'A'
       shoppingcartitem.skuType == 'B'
       shoppingcartitem.skuType == 'C'
       shoppingcartitem.skuType == 'D'


       Active Promotions - I).   3 of A's for 130       -  "#{shoppingcartitem.skuType == 'A' && (shoppingcartitem.quantity/3)==0 && (shoppingcartitem.quantity%3)==0 ? shoppingcartitem.quantity/3 + shoppingcartitem.quantity%2 : 0}"
                        II).  2 of B's for 45        -  "#{shoppingcartitem.skuType == 'B' && (shoppingcartitem.quantity/2)==0 && (shoppingcartitem.quantity%2)==0 ? shoppingcartitem.quantity/2 + shoppingcartitem.quantity%2 : 0}"
                        III). C & D for 30           -  "#{ shoppingcartitem.skuType == 'C' + shoppingcartitem.skuType == 'D' ? 30 : 0 }"

        Unit price for SKU_TYPE IDs I).   A 50
                               II).  B 30
                               III). C 20
                               IV).  D 15


        Varun Ideas:-

        SKU Type  Key1   Value1   Key 2  Value 2  operator  Expiry
        S       A         S         B      +
        S       A         Q         130    GT

        



        // PROMOS Table Design

        promotion_id SKU_Type promotion_rule creation_date start_date end_date

     
        CREATE TABLE PROMOS(PROMOTION_ID  int NOT NULL AUTO_INCREMENT primary key, SKU_Type varchar(10)  NOT NULL, PROMOTION_RULE varchar(200)  NOT NULL, CREATION_DATE DATE NOT NULL, START_DATE DATE NOT NULL, END_DATE DATE NOT NULL);


        INSERT INTO PROMOS(SKU_TYPE, PROMOTION_RULE , CREATION_DATE, START_DATE, END_DATE) VALUES ('A',"skuType == 'A' ? (((quantity/3) * 130) + ((quantity%3) * price)) : price",'2022-11-29','2022-12-01','2022-12-08');


        INSERT INTO PROMOS(SKU_TYPE, PROMOTION_RULE , CREATION_DATE, START_DATE, END_DATE) VALUES ('B',"skuType == 'B' ? (((quantity/2) * 45) + ((quantity%2) * price)) : price",'2022-11-29','2022-12-01','2022-12-08');


        INSERT INTO PROMOS(SKU_TYPE, PROMOTION_RULE , CREATION_DATE, START_DATE, END_DATE) VALUES ('C',"skuType == 'C' ? ((quantity * price)) : price",'2022-11-29','2022-12-01','2022-12-08');
       

        INSERT INTO PROMOS(SKU_TYPE, PROMOTION_RULE , CREATION_DATE, START_DATE, END_DATE) VALUES ('D',"skuType == 'D' ? ((quantity * price)) : price",'2022-11-29','2022-12-01','2022-12-08');



        "skuType == 'A' ? (((quantity/3) * 130) + ((quantity%3) * price)) : price"
        "skuType == 'B' ? (((quantity/2) * 45) + ((quantity%2) * price)) : price"
        "skuType == 'C' ? ((quantity * price)) : price"
        "skuType == 'D' ? ((quantity * price)) : price"



        // SHOPPING_CART_ITEM Table Design

        DROP TABLE SHOPPING_CART_ITEM;

        DESC SHOPPING_CART_ITEM;
        

        CREATE TABLE SHOPPING_CART_ITEM(SHOPPING_CART_ITEM_ID int NOT NULL AUTO_INCREMENT primary key, PRODUCT_ID varchar(50)  NOT NULL, CART_ID varchar(50) NOT NULL, SKU_TYPE varchar(50)  NOT NULL, PRICE float NOT NULL, DISCOUNT float NOT NULL, QUANTITY int NOT NULL, ACTIVE BOOLEAN NOT NULL, CREATED_AT  DATE  NOT NULL, UPDATED_AT DATE);

        insert into SHOPPING_CART_ITEM(PRODUCT_ID,CART_ID,SKU_TYPE,PRICE,DISCOUNT,QUANTITY,ACTIVE,CREATED_AT,UPDATED_AT) values('PROD101','CART001','A',50,0,5,true,'2021-11-21',NULL);  # CURRENT_DATE() // NOW()

        insert into SHOPPING_CART_ITEM(PRODUCT_ID,CART_ID,SKU_TYPE,PRICE,DISCOUNT,QUANTITY,ACTIVE,CREATED_AT,UPDATED_AT) values('PROD102','CART002','B',30,0,5,true,'2021-11-21',NULL);

        insert into SHOPPING_CART_ITEM(PRODUCT_ID,CART_ID,SKU_TYPE,PRICE,DISCOUNT,QUANTITY,ACTIVE,CREATED_AT,UPDATED_AT) values('PROD103','CART003','C',20,0,1,true,'2021-11-21',NULL);

        insert into SHOPPING_CART_ITEM(PRODUCT_ID,CART_ID,SKU_TYPE,PRICE,DISCOUNT,QUANTITY,ACTIVE,CREATED_AT,UPDATED_AT) values('PROD104','CART004','D',15,0,1,true,'2021-11-21',NULL);

        SELECT * FROM SHOPPING_CART_ITEM;




