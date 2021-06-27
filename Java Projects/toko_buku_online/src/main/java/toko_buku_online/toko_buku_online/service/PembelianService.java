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
import toko_buku_online.toko_buku_online.dto.PembelianDTO;
import toko_buku_online.toko_buku_online.model.Pembelian;
import toko_buku_online.toko_buku_online.repository.PembelianRepository;

/**
 *
 * @author ASUS
 */
@Service
@Transactional
public class PembelianService {

    @Inject
    private PembelianRepository pembelianRepository;

    @Transactional
    public List<Pembelian> getAll() {
        return pembelianRepository.findAll();
    }

    @Transactional
    public Pembelian create(PembelianDTO pembelianDTO) {
        Pembelian pembelian = new Pembelian();
        pembelian.setPembelianId(pembelianDTO.getPembelianId());
        pembelian.setTanggalTransaksi(pembelianDTO.getTanggalTransaksi());
        pembelian.setNamaPembeli(pembelianDTO.getNamaPembeli());
        pembelian.setEmailPembeli(pembelianDTO.getEmailPembeli());
        pembelian.setNoHpPembeli(pembelianDTO.getNoHpPembeli());
        pembelian.setAlamatPembeli(pembelianDTO.getAlamatPembeli());
        pembelian.setTotalHargaBeli(pembelianDTO.getTotalHargaBeli());
        pembelianRepository.saveAndFlush(pembelian);
        return pembelian;
    }

    @Transactional
    public Pembelian update(PembelianDTO pembelianDTO) {
        Pembelian pembelian = pembelianRepository.findOne(pembelianDTO.getPembelianId());
        if (pembelian != null) {
            pembelian.setTanggalTransaksi(pembelianDTO.getTanggalTransaksi());
            pembelian.setNamaPembeli(pembelianDTO.getNamaPembeli());
            pembelian.setEmailPembeli(pembelianDTO.getEmailPembeli());
            pembelian.setNoHpPembeli(pembelianDTO.getNoHpPembeli());
            pembelian.setAlamatPembeli(pembelianDTO.getAlamatPembeli());
            pembelian.setTotalHargaBeli(pembelianDTO.getTotalHargaBeli());
        }
        pembelianRepository.saveAndFlush(pembelian);
        return pembelian;
    }
    
    @Transactional
    public PembelianDTO findOne(String pembelianId){
        return new PembelianDTO(pembelianRepository.findOne(pembelianId));
    }
}
