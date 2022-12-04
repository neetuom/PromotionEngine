package com.online.marketplace.model;


import lombok.*;


import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *  Promos ShoppingCartItem Pojo used to perform CRUD operation on the PROMOS table in MySQL database.
 *
 *  This class used Lombok to generate
 * @Getter
 * @Setter
 * @NoArgsConstructor
 * @EqualsAndHashCode
 * @ToString
 *
 */
@Entity
@Table(name="SHOPPING_CART_ITEM",schema="promotion")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ShoppingCartItem implements Serializable {

          /**
             * serialVersionUID - used to serialize and deserialize the object.
           */
          @Serial
          private static final long serialVersionUID = 1L;

          /**
            *  shoppingCartItemId - type int
          */
          @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
          @Column(name="SHOPPING_CART_ITEM_ID", columnDefinition = "int")
          private int shoppingCartItemId;

          /**
           *  productId - type String
           */
          @Column(name="PRODUCT_ID", columnDefinition = "varchar(50)")
          private String productId;

          /**
           *  cartId - type String
           *  */
          @Column(name="CART_ID", columnDefinition = "varchar(50)")
          private String cartId;

          /**
           *  skuType - type String
          */
          @Column(name="SKU_TYPE", columnDefinition = "varchar(50)")
          private String skuType;

          /**
           *  price - type float
          */
          @Column(name="PRICE", columnDefinition = "float")
          private float price ;

          /**
           *  discount - type float
          */
          @Column(name="DISCOUNT", columnDefinition = "float")
          private float discount;

          /**
           *  quantity - type int
          */
          @Column(name="QUANTITY", columnDefinition = "int")
          private int quantity;

          /**
            *  active - type Boolean
          */
          @Column(name="ACTIVE", columnDefinition = "BOOLEAN")
          private Boolean active;

          /**
           *  createdAt - type LocalDate
          */
          @Column(name = "createdAt", columnDefinition = "DATE")
          private LocalDate createdAt;

          /**
            *  updatedAt - type LocalDate
          */
          @Column(name = "updatedAt", columnDefinition = "DATE")
          private LocalDate updatedAt;
}