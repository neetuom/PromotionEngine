package com.online.marketplace.repository;

import com.online.marketplace.model.ShoppingCartItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * This class implement the JpaRepository interface to perform the CRUD operations on ShoppingCartItem Object Entity
 *
 */
public interface ShoppingCartItemRepositoryInt extends JpaRepository<ShoppingCartItem,Integer> {
}
