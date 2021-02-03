/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.aegyo.SCL_Project.rest;

import id.aegyo.SCL_Project.dto.CategoriesDTO;
import id.aegyo.SCL_Project.model.Categories;
import id.aegyo.SCL_Project.service.CategoriesService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author NFCS
 */
@RestController
@RequestMapping("/categories")
public class CategoriesRest {
    
    @Inject
    private CategoriesService categoriesService;
    
    @GetMapping("/get-all")
    public ResponseEntity<List<Categories>> getAllCategories() {
        List<Categories> categories = categoriesService.getAll();
        return ResponseEntity.ok(categories);
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody CategoriesDTO categoriesDTO) {
        categoriesService.create(categoriesDTO);
        return ResponseEntity.ok(categoriesDTO);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody CategoriesDTO categoriesDTO) {
        try {
            if(categoriesDTO.getCategoryId() != null) {
                categoriesService.update(categoriesDTO);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoriesRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseEntity.ok(categoriesDTO);
    }
    
    @DeleteMapping("/delete/{categoryId}")
    public ResponseEntity delete(@PathVariable (value = "categoryId") Integer categoryId) {
        try {
            if(categoryId != null && !categoryId.equals("")) {
                categoriesService.delete(categoryId);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoriesRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseEntity.ok("Delete Successfully");
    }
}
