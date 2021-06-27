/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.dto;

import toko_buku_online.toko_buku_online.model.Buku;
import toko_buku_online.toko_buku_online.model.Pembelian;

/**
 *
 * @author NFCS
 */
public class PembelianDetilItemDTO {
    private String pembelianDetilItemId;
    private String pembelianId;
    private String bukuId;
    private Integer qty;
    private Integer harga;
    private Integer subTotal;

    public PembelianDetilItemDTO() {
    }

    public String getPembelianDetilItemId() {
        return pembelianDetilItemId;
    }

    public void setPembelianDetilItemId(String pembelianDetilItemId) {
        this.pembelianDetilItemId = pembelianDetilItemId;
    }

    public String getPembelianId() {
        return pembelianId;
    }

    public void setPembelianId(String pembelianId) {
        this.pembelianId = pembelianId;
    }

    public String getBukuId() {
        return bukuId;
    }

    public void setBukuId(String bukuId) {
        this.bukuId = bukuId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }
    
    
}
