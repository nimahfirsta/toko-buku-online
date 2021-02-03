/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.aegyo.SCL_Project.service;

import id.aegyo.SCL_Project.model.Categories;
import id.aegyo.SCL_Project.repository.CategoriesRepository;
import id.aegyo.SCL_Project.dto.CategoriesDTO;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author NFCS
 */

@Service
@Transactional
public class CategoriesService {
    
    @Inject
    private CategoriesRepository categoriesRepository;
    
    @Transactional
    public List<Categories> getAll(){
        return categoriesRepository.findAll();
    }
    
    @Transactional
    public Categories create(CategoriesDTO categoriesDTO){
        Categories categories = new Categories();
        categories.setCategoryId(categoriesDTO.getCategoryId());
        categories.setName(categoriesDTO.getName());
        categoriesRepository.save(categories);
        return categories;
    }
    
    @Transactional
    public Categories update(CategoriesDTO categoriesDTO) throws Exception {
        Categories categories = categoriesRepository.findOne(categoriesDTO.getCategoryId());
        if (categories != null) {
            categories.setName(categoriesDTO.getName());
            categoriesRepository.save(categories);
        } else {
            throw new Exception("Categories is not found.");
        }
        return categories;
    }
    
    @Transactional
    public void delete(Integer categoryId) {
        Categories categories = categoriesRepository.findOne(categoryId);
        if(categories != null) {
            categoriesRepository.delete(categories);
        }
    }
}
