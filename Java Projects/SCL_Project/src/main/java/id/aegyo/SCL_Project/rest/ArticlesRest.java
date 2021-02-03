/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.aegyo.SCL_Project.rest;

import id.aegyo.SCL_Project.dto.ArticlesDTO;
import id.aegyo.SCL_Project.model.Articles;
import id.aegyo.SCL_Project.service.ArticlesService;
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
@RequestMapping("/articles")
public class ArticlesRest {
    
    @Inject
    private ArticlesService articlesService;
    
    @GetMapping("/get-all")
    public ResponseEntity<List<Articles>> getAllArticles() {
        List<Articles> categories = articlesService.getAll();
        return ResponseEntity.ok(categories);
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody ArticlesDTO articlesDTO) {
        return ResponseEntity.ok(articlesService.create(articlesDTO));
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody ArticlesDTO articlesDTO) {
        try {
            if(articlesDTO.getArticleId() != null) {
                articlesService.update(articlesDTO);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoriesRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseEntity.ok(articlesDTO);
    }
    
    @DeleteMapping("/delete/{articleId}")
    public ResponseEntity delete(@PathVariable (value = "articleId") Integer articleId) {
        try {
            if(articleId != null) {
                articlesService.delete(articleId);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoriesRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseEntity.ok("Delete Successfully");
    }
}
