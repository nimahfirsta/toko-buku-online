/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author NFCS
 */
@Entity
@Table(name = "buku")
@EntityListeners(AuditingEntityListener.class)

public class Buku implements Serializable {

    @Id
    @Column(name = "id")
    private String bukuId;

    @Column(name = "judul")
    private String judul;

    @Column(name = "kategori")
    private String kategori;

    @Column(name = "harga")
    private Integer harga;

    @Column(name = "penulis")
    private String penulis;
    
    @Column(name = "penerbit")
    private String penerbit;

    @Column(name = "jumlah_stok")
    private Integer jumlahStok;
    
    @Column(name = "sinopsis")
    private String sinopsis;

    @Column(name = "gambar")
    private String gambar;
    
    @Column(name = "aktif")
    private boolean aktif;

    public String getBukuId() {
        return bukuId;
    }

    public void setBukuId(String bukuId) {
        this.bukuId = bukuId;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Integer getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(Integer jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
    
    

}
