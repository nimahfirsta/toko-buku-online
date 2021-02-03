/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.aegyo.SCL_Project.model;

import java.io.Serializable;
import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author NFCS
 */
@Entity
@Table(name = "ARTICLES")
@EntityListeners(AuditingEntityListener.class)

public class Articles implements Serializable {
    @Id
    @Column(name = "ARTICLE_ID")
    private Integer articleId;
    
    @JoinColumn (name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
    @ManyToOne
    private Categories categories;
    
    @Column(name = "TITLE")
    private String title;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "CONTENT")
    private String content;

    public Articles() {
        
    }

    public Articles(Articles article) {
        this.articleId = article.getArticleId();
        this.categories = article.getCategories();
        this.content = article.getContent();
        this.description = article.getDescription();
        this.title = article.getTitle();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
