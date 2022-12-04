package com.online.marketplace.service;


import com.online.marketplace.model.Promos;
import com.online.marketplace.repository.PromosRepositoryInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

/**
 *
 *  This class used to implement the PromoServiceInt interface methods prototype
 *
 */
@Service
@Transactional
public class PromoServiceImpl implements PromoServiceInt {

    /**
     * Default constructor
     */
    public PromoServiceImpl(){

    }

    /**
     * PromosRepositoryInt interface injection
     */
    @Autowired
    private PromosRepositoryInt promosRepository;

    /**
     * This method get getPromos by ID
     *
     * @param id
     * @return Promos
     */
    @Override
    public Promos getPromos(Integer  id) {
        return promosRepository.findById(id).get();
    }

    /**
     * This method return the listOfPromos
     *
     * @return List<Promos>
     */
    @Override
    public List<Promos> listOfPromos() {

        return promosRepository.findAll();
    }

    /**
     * This method saves the Promos Entity data into MySQL DB
     *
     * @param promos
     */
    @Override
    public void savePromos(Promos promos) {
        promosRepository.save(promos);
    }

    /**
     * This method deletePromos by ID
     *
     * @param id
     */
    @Override
    public void deletePromos(Integer id) {
        promosRepository.deleteById(id);
    }
}
