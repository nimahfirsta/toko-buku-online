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
import toko_buku_online.toko_buku_online.dto.PembelianDetilItemDTO;
import toko_buku_online.toko_buku_online.model.Buku;
import toko_buku_online.toko_buku_online.model.Pembelian;
import toko_buku_online.toko_buku_online.model.PembelianDetilItem;
import toko_buku_online.toko_buku_online.repository.BukuRepository;
import toko_buku_online.toko_buku_online.repository.PembelianDetilItemRepository;
import toko_buku_online.toko_buku_online.repository.PembelianRepository;

/**
 *
 * @author NFCS
 */
@Service
@Transactional
public class PembelianDetilItemService {

    @Inject
    private PembelianDetilItemRepository detilItemRepository;

    @Inject
    private PembelianRepository pembelianRepository;

    @Inject
    private BukuRepository bukuRepository;

    @Transactional
    public List<PembelianDetilItem> getAll() {
        return detilItemRepository.findAll();
    }

    @Transactional
    public PembelianDetilItem create(PembelianDetilItemDTO detilItemDTO) {
        PembelianDetilItem detilItem = new PembelianDetilItem();
        detilItem.setPembelianDetilItemId(detilItemDTO.getPembelianDetilItemId());
        if (detilItemDTO.getPembelianId() != null) {
            Pembelian pembelian = pembelianRepository.findOne(detilItemDTO.getPembelianId());
            detilItem.setPembelian(pembelian);
        }

        if (detilItemDTO.getBukuId() != null) {
            Buku buku = bukuRepository.findOne(detilItemDTO.getBukuId());
            detilItem.setBuku(buku);
        }

        detilItem.setQty(detilItemDTO.getQty());
        detilItem.setHarga(detilItemDTO.getHarga());
        detilItem.setSubTotal(detilItemDTO.getSubTotal());
        detilItemRepository.save(detilItem);
        return detilItem;
    }

    @Transactional
    public PembelianDetilItem update(PembelianDetilItemDTO detilItemDTO) {
        PembelianDetilItem detilItem = detilItemRepository.findOne(detilItemDTO.getPembelianDetilItemId());
        if (detilItem != null) {
            detilItem.setQty(detilItemDTO.getQty());
            detilItem.setHarga(detilItemDTO.getHarga());
            detilItem.setSubTotal(detilItemDTO.getSubTotal());
            if (detilItemDTO.getPembelianId() != null) {
                detilItem.setPembelian(pembelianRepository.findOne(detilItemDTO.getPembelianId()));
            }
            if (detilItemDTO.getBukuId() != null) {
                detilItem.setBuku(bukuRepository.findOne(detilItemDTO.getBukuId()));
            }
        }
        detilItemRepository.save(detilItem);
        return detilItem;
    }
}
