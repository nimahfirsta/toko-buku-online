/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.service;

import com.google.common.base.Optional;
import com.querydsl.core.BooleanBuilder;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import toko_buku_online.toko_buku_online.dto.BukuDTO;
import toko_buku_online.toko_buku_online.model.Buku;
import toko_buku_online.toko_buku_online.model.QBuku;
import toko_buku_online.toko_buku_online.repository.BukuRepository;

/**
 *
 * @author NFCS
 */
@Service
@Transactional
public class BukuService {

    @Inject
    private BukuRepository bukuRepository;

    @Transactional
    public List<Buku> getAll() {
        return bukuRepository.findAll();
    }

    @Transactional
    public Buku create(BukuDTO bukuDTO) {
        Buku buku = new Buku();
        buku.setBukuId(bukuDTO.getBukuId());
        buku.setJudul(bukuDTO.getJudul());
        buku.setKategori(bukuDTO.getKategori());
        buku.setHarga(bukuDTO.getHarga());
        buku.setPenulis(bukuDTO.getPenulis());
        buku.setPenerbit(bukuDTO.getPenerbit());
        buku.setSinopsis(bukuDTO.getSinopsis());
        buku.setJumlahStok(bukuDTO.getJumlahStok());
        buku.setGambar(bukuDTO.getGambar());
        buku.setAktif(bukuDTO.isAktif());
        bukuRepository.save(buku);
        return buku;
    }

    @Transactional
    public Buku update(BukuDTO bukuDTO) {
        Buku buku = bukuRepository.findOne(bukuDTO.getBukuId());
        if (buku != null) {
            buku.setJudul(bukuDTO.getJudul());
            buku.setKategori(bukuDTO.getKategori());
            buku.setHarga(bukuDTO.getHarga());
            buku.setPenulis(bukuDTO.getPenulis());
            buku.setPenerbit(bukuDTO.getPenerbit());
            buku.setSinopsis(bukuDTO.getSinopsis());
            buku.setJumlahStok(bukuDTO.getJumlahStok());
            buku.setGambar(bukuDTO.getGambar());
            buku.setAktif(bukuDTO.isAktif());
        }
        bukuRepository.save(buku);
        return buku;
    }
    
    @Transactional
    public Page<BukuDTO> filterBuku(BukuDTO bukuDTO, Pageable pageable){
        BooleanBuilder query = new BooleanBuilder();
        QBuku qbuku = QBuku.buku;

        if(bukuDTO.getKategori() != null && !bukuDTO.getKategori().equals("")) {
            query.and(qbuku.kategori.containsIgnoreCase(bukuDTO.getKategori()));
        }
        
        if(bukuDTO.getJudul() != null && !bukuDTO.getJudul().equals("")) {
            query.and(qbuku.judul.containsIgnoreCase(bukuDTO.getJudul()));
        }
        
        Page<Buku> book = bukuRepository.findAll(query, pageable);
        return book.map(BukuDTO::new);
    }
    
    @Transactional
    public BukuDTO getOneBuku(String bukuId) {
        return new BukuDTO(bukuRepository.findOne(bukuId));
    }

}
