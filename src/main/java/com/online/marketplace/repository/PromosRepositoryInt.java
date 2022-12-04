package com.online.marketplace.repository;

import com.online.marketplace.model.Promos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * This class implement the JpaRepository interface to perform the CRUD operations on PROMOS Object  Entity
 *
 */
public interface PromosRepositoryInt extends JpaRepository<Promos,Integer> {
}
