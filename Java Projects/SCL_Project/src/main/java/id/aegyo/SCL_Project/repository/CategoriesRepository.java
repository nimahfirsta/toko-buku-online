/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.aegyo.SCL_Project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import id.aegyo.SCL_Project.model.Categories;

/**
 *
 * @author NFCS
 */
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
    
}
