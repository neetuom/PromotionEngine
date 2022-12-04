package com.online.marketplace.service;

import com.online.marketplace.model.Promos;

import java.util.List;


/**
 *
 *  This class used to define the PromoServiceInt interface methods prototype
 *
 */
public interface PromoServiceInt {

    /**
     * This method return Promos by ID
     *
     * @param id
     * @return Promos
     */
    public Promos getPromos(Integer  id);

    /**
     * This method return List of Promos
     *
     * @return List<Promos>
     */
    public List<Promos> listOfPromos() ;

    /**
     *  This methods saves the Promos Object
     *
     * @param promos
     */
    public void savePromos(Promos promos);

    /**
     * This method deletes the Promos by ID from database.
     * @param id
     */
    public void deletePromos(Integer id);
}
