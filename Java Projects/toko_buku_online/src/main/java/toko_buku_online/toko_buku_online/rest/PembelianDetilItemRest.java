/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.rest;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import toko_buku_online.toko_buku_online.dto.PembelianDetilItemDTO;
import toko_buku_online.toko_buku_online.model.PembelianDetilItem;
import toko_buku_online.toko_buku_online.service.PembelianDetilItemService;

/**
 *
 * @author NFCS
 */

@RestController
@RequestMapping("/pembelian-detil-item")
public class PembelianDetilItemRest {
    
    @Inject
    private PembelianDetilItemService detilItemService;
    
    @GetMapping("/get-all")
    public ResponseEntity<List<PembelianDetilItem>> getAllDetilItem() {
        List<PembelianDetilItem> pembelianDetilItem = detilItemService.getAll();
        return ResponseEntity.ok(pembelianDetilItem);
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody PembelianDetilItemDTO detilItemDTO) {
        detilItemService.create(detilItemDTO);
        return ResponseEntity.ok(detilItemDTO);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody PembelianDetilItemDTO detilItemDTO) {
        try {
            if(detilItemDTO.getPembelianDetilItemId() != null) {
                detilItemService.update(detilItemDTO);
            }
        } catch (Exception ex) {
            Logger.getLogger(PembelianDetilItemRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseEntity.ok(detilItemDTO);
    }
}
