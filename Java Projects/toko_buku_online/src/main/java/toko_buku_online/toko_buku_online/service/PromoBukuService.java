/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.service;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import toko_buku_online.toko_buku_online.dto.PromoBukuDTO;
import toko_buku_online.toko_buku_online.model.Buku;
import toko_buku_online.toko_buku_online.model.PromoBuku;
import toko_buku_online.toko_buku_online.repository.BukuRepository;
import toko_buku_online.toko_buku_online.repository.PromoBukuRepository;

/**
 *
 * @author NFCS
 */
@Service
@Transactional
public class PromoBukuService {

    @Inject
    private PromoBukuRepository promoBukuRepository;

    @Inject
    private BukuRepository bukuRepository;

    @Transactional
    public List<PromoBuku> getAll() {
        return promoBukuRepository.findAll();
    }

    @Transactional
    public PromoBuku create(PromoBukuDTO promoBukuDTO) {
        PromoBuku promoBuku = new PromoBuku();
        promoBuku.setPromoBukuId(promoBukuDTO.getPromoBukuId());
        if (promoBukuDTO.getBukuId() != null) {
            Buku buku = bukuRepository.findOne(promoBukuDTO.getBukuId());
            promoBuku.setBuku(buku);
        }

        promoBuku.setTanggalAwal(promoBukuDTO.getTanggalAwal());
        promoBuku.setTanggalAkhir(promoBukuDTO.getTanggalAkhir());
        promoBuku.setHargaPromo(promoBukuDTO.getHargaPromo());
        promoBukuRepository.save(promoBuku);
        return promoBuku;
    }

    @Transactional
    public PromoBuku update(PromoBukuDTO promoBukuDTO) {
        PromoBuku promoBuku = promoBukuRepository.findOne(promoBukuDTO.getPromoBukuId());
        if (promoBuku != null) {
            if (promoBukuDTO.getBukuId() != null) {
                Buku buku = bukuRepository.findOne(promoBukuDTO.getBukuId());
                promoBuku.setBuku(bukuRepository.findOne(promoBukuDTO.getBukuId()));
            }
            promoBuku.setTanggalAwal(promoBukuDTO.getTanggalAwal());
            promoBuku.setTanggalAkhir(promoBukuDTO.getTanggalAkhir());
            promoBuku.setHargaPromo(promoBukuDTO.getHargaPromo());
        }
        promoBukuRepository.save(promoBuku);
        return promoBuku;
    }
    
    @Transactional
    public PromoBukuDTO findByBukuId(String bukuId){
        return new PromoBukuDTO(promoBukuRepository.findByBukuId(bukuId));
    }
}
