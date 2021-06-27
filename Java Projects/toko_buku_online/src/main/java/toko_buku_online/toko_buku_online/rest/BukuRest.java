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
import javax.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import toko_buku_online.toko_buku_online.dto.BukuDTO;
import toko_buku_online.toko_buku_online.model.Buku;
import toko_buku_online.toko_buku_online.service.BukuService;

/**
 *
 * @author NFCS
 */
@RestController
@RequestMapping("/buku")
public class BukuRest {

    @Inject
    private BukuService bukuService;

    @GetMapping("/get-all")
    public ResponseEntity<List<Buku>> getAllBuku() {
        List<Buku> buku = bukuService.getAll();
        return ResponseEntity.ok(buku);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody BukuDTO bukuDTO) {
        bukuService.create(bukuDTO);
        return ResponseEntity.ok(bukuDTO);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody BukuDTO bukuDTO) {
        try {
            if (bukuDTO.getBukuId() != null) {
                bukuService.update(bukuDTO);
            }
        } catch (Exception ex) {
            Logger.getLogger(BukuRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseEntity.ok(bukuDTO);
    }

    @GetMapping("/pageable")
    public ResponseEntity pageable(Pageable pageable, 
            @RequestParam(required = false) String judul,
            @RequestParam(required = false) String kategori) {
        BukuDTO bukuDTO = new BukuDTO();
        bukuDTO.setJudul(judul);
        bukuDTO.setKategori(kategori);
        Page<BukuDTO> page = bukuService.filterBuku(bukuDTO, pageable);
        return new ResponseEntity<>(page, HttpStatus.OK);
    }

    @GetMapping("/show/{bukuId}")
    public ResponseEntity<BukuDTO> findOne(@PathVariable String bukuId) {
        BukuDTO bukuDTO = bukuService.getOneBuku(bukuId);
        return ResponseEntity.ok(bukuDTO);
    }

}
