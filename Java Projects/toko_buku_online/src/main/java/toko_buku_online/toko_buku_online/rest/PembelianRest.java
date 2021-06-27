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
import toko_buku_online.toko_buku_online.dto.PembelianDTO;
import toko_buku_online.toko_buku_online.model.Pembelian;
import toko_buku_online.toko_buku_online.service.PembelianService;

/**
 *
 * @author NFCS
 */
@RestController
@RequestMapping("/pembelian")
public class PembelianRest {

    @Inject
    private PembelianService pembelianService;

    @GetMapping("/get-all")
    public ResponseEntity<List<Pembelian>> getAllPembelian() {
        List<Pembelian> pembelian = pembelianService.getAll();
        return ResponseEntity.ok(pembelian);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody PembelianDTO pembelianDTO) {
        pembelianService.create(pembelianDTO);
        return ResponseEntity.ok(pembelianDTO);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody PembelianDTO pembelianDTO) {
        try {
            if(pembelianDTO.getPembelianId() != null) {
                pembelianService.update(pembelianDTO);
            }
        } catch (Exception ex) {
            Logger.getLogger(PembelianRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseEntity.ok(pembelianDTO);
    }
    
    @GetMapping("/show/{pembelianId}")
    public ResponseEntity<PembelianDTO> findOne(@PathVariable String pembelianId) {
        PembelianDTO pembelianDTO = pembelianService.findOne(pembelianId);
        return ResponseEntity.ok(pembelianDTO);
    }
}
