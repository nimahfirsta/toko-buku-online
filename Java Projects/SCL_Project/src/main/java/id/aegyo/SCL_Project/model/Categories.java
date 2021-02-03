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
@Table(name = "CATEGORIES")
@EntityListeners(AuditingEntityListener.class)

public class Categories implements Serializable {
    
    @Id
    @Column(name = "CATEGORY_ID")
    private Integer categoryId;
    
    @Column(name = "NAME")
    private String name;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
