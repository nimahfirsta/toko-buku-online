/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.dto;

import java.util.Date;
import toko_buku_online.toko_buku_online.model.Buku;
import toko_buku_online.toko_buku_online.model.PromoBuku;

/**
 *
 * @author NFCS
 */
public class PromoBukuDTO {

    private String promoBukuId;
    private String bukuId;
    private Date tanggalAwal;
    private Date tanggalAkhir;
    private Integer hargaPromo;

    public PromoBukuDTO() {
    }

    public PromoBukuDTO(PromoBuku promoBuku) {
        this.promoBukuId = promoBuku.getPromoBukuId();
        this.bukuId = promoBuku.getPromoBukuId();
        this.tanggalAwal = promoBuku.getTanggalAwal();
        this.tanggalAkhir = promoBuku.getTanggalAkhir();
        this.hargaPromo = promoBuku.getHargaPromo();
    }

    public String getPromoBukuId() {
        return promoBukuId;
    }

    public void setPromoBukuId(String promoBukuId) {
        this.promoBukuId = promoBukuId;
    }

    public String getBukuId() {
        return bukuId;
    }

    public void setBukuId(String bukuId) {
        this.bukuId = bukuId;
    }

    public Date getTanggalAwal() {
        return tanggalAwal;
    }

    public void setTanggalAwal(Date tanggalAwal) {
        this.tanggalAwal = tanggalAwal;
    }

    public Date getTanggalAkhir() {
        return tanggalAkhir;
    }

    public void setTanggalAkhir(Date tanggalAkhir) {
        this.tanggalAkhir = tanggalAkhir;
    }

    public Integer getHargaPromo() {
        return hargaPromo;
    }

    public void setHargaPromo(Integer hargaPromo) {
        this.hargaPromo = hargaPromo;
    }

}
