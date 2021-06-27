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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import toko_buku_online.toko_buku_online.dto.PromoBukuDTO;
import toko_buku_online.toko_buku_online.model.PromoBuku;
import toko_buku_online.toko_buku_online.service.PromoBukuService;

/**
 *
 * @author NFCS
 */
@RestController
@RequestMapping("/promo-buku")
public class PromoBukuRest {
    
    @Inject
    private PromoBukuService promoBukuService;
    
    @GetMapping("/get-all")
    public ResponseEntity<List<PromoBuku>> getAllPromoBuku() {
        List<PromoBuku> promoBuku = promoBukuService.getAll();
        return ResponseEntity.ok(promoBuku);
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody PromoBukuDTO promoBukuDTO) {
        promoBukuService.create(promoBukuDTO);
        return ResponseEntity.ok(promoBukuDTO);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody PromoBukuDTO promoBukuDTO) {
        try {
            if(promoBukuDTO.getPromoBukuId() != null) {
                promoBukuService.update(promoBukuDTO);
            }
        } catch (Exception ex) {
            Logger.getLogger(PromoBukuRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseEntity.ok(promoBukuDTO);
    }
    
        @GetMapping("/show-by-buku/{pembelianId}")
    public ResponseEntity<PromoBukuDTO> findOne(@PathVariable String bukuId) {
        PromoBukuDTO promoBukuDTO = promoBukuService.findByBukuId(bukuId);
        return ResponseEntity.ok(promoBukuDTO);
    }
}
