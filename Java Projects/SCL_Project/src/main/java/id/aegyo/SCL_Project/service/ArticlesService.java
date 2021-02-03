/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.aegyo.SCL_Project.service;

import id.aegyo.SCL_Project.dto.ArticlesDTO;
import id.aegyo.SCL_Project.model.Articles;
import id.aegyo.SCL_Project.model.Categories;
import id.aegyo.SCL_Project.repository.ArticlesRepository;
import id.aegyo.SCL_Project.repository.CategoriesRepository;
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
public class ArticlesService {
    
    @Inject
    private ArticlesRepository articlesRepository;
    
    @Inject
    private CategoriesRepository categoriesRepository;
    
    @Transactional
    public List<Articles> getAll(){
        List<Articles> articles = articlesRepository.findAll();
        return articles;
    }
    
    @Transactional
    public Articles create(ArticlesDTO articlesDTO) {
        Articles articles = new Articles();
        if(articlesDTO.getCategoryId() != null) {
            Categories categories = categoriesRepository.findOne(articlesDTO.getCategoryId());
            articles.setCategories(categories);
        }
        
        articles.setArticleId(articlesDTO.getArticleId());
        articles.setContent(articlesDTO.getContent());
        articles.setDescription(articlesDTO.getDescription());
        articles.setTitle(articlesDTO.getTitle());
        articlesRepository.save(articles);
        return articles;
    }

    @Transactional
    public Articles update(ArticlesDTO articlesDTO) {
        Articles articles = articlesRepository.findOne(articlesDTO.getArticleId());
        if (articles != null) {
            articles.setContent(articlesDTO.getContent());
            articles.setDescription(articlesDTO.getDescription());
            articles.setTitle(articlesDTO.getTitle());
            if(articlesDTO.getCategoryId() != null) {
                articles.setCategories(categoriesRepository.findOne(articlesDTO.getCategoryId()));
            }
        }
        articlesRepository.save(articles);
        return articles;
    }
    
    @Transactional
    public void delete(Integer articleId) {
        Articles articles = articlesRepository.findOne(articleId);
        if (articles != null) {
            articlesRepository.delete(articles);
        }
    }
}
