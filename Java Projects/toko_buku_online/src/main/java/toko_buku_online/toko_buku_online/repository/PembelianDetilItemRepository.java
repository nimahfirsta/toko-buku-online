/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toko_buku_online.toko_buku_online.model.PembelianDetilItem;

/**
 *
 * @author NFCS
 */
public interface PembelianDetilItemRepository extends JpaRepository<PembelianDetilItem, String>{
    
}
