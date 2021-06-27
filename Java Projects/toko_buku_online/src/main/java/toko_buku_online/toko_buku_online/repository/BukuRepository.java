/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import toko_buku_online.toko_buku_online.model.Buku;

/**
 *
 * @author ASUS
 */
public interface BukuRepository extends JpaRepository<Buku, String>, QueryDslPredicateExecutor<Buku>{
    
}
