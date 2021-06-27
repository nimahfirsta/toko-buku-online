/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.dto;

import java.util.Date;
import toko_buku_online.toko_buku_online.model.Pembelian;

/**
 *
 * @author NFCS
 */
public class PembelianDTO {
    private String pembelianId;
    private Integer nomorTransaksi;
    private Date tanggalTransaksi;
    private String namaPembeli;
    private String emailPembeli;
    private String noHpPembeli;
    private String alamatPembeli;
    private Integer totalHargaBeli;

    public PembelianDTO() {
    }
    
    public PembelianDTO(Pembelian pembelian){
        this.pembelianId = pembelian.getPembelianId();
        this.nomorTransaksi = pembelian.getNomorTransaksi();
        this.tanggalTransaksi = pembelian.getTanggalTransaksi();
        this.namaPembeli = pembelian.getNamaPembeli();
        this.emailPembeli = pembelian.getEmailPembeli();
        this.noHpPembeli = pembelian.getNoHpPembeli();
        this.alamatPembeli = pembelian.getAlamatPembeli();
        this.totalHargaBeli = pembelian.getTotalHargaBeli();
    }

    public String getPembelianId() {
        return pembelianId;
    }

    public void setPembelianId(String pembelianId) {
        this.pembelianId = pembelianId;
    }

    public Integer getNomorTransaksi() {
        return nomorTransaksi;
    }

    public void setNomorTransaksi(Integer nomorTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getEmailPembeli() {
        return emailPembeli;
    }

    public void setEmailPembeli(String emailPembeli) {
        this.emailPembeli = emailPembeli;
    }

    public String getNoHpPembeli() {
        return noHpPembeli;
    }

    public void setNoHpPembeli(String noHpPembeli) {
        this.noHpPembeli = noHpPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    public Integer getTotalHargaBeli() {
        return totalHargaBeli;
    }

    public void setTotalHargaBeli(Integer totalHargaBeli) {
        this.totalHargaBeli = totalHargaBeli;
    }
    
    
}
