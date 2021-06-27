/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.dto;

import toko_buku_online.toko_buku_online.model.Buku;

/**
 *
 * @author NFCS
 */
public class BukuDTO {

    private String bukuId;
    private String judul;
    private String kategori;
    private Integer harga;
    private String penulis;
    private String penerbit;
    private Integer jumlahStok;
    private String sinopsis;
    private String gambar;
    private boolean aktif;

    public BukuDTO() {
    }

    public BukuDTO(Buku buku) {
        this.bukuId = buku.getBukuId();
        this.judul = buku.getJudul();
        this.kategori = buku.getKategori();
        this.harga = buku.getHarga();
        this.penulis = buku.getPenulis();
        this.penerbit = buku.getPenerbit();
        this.jumlahStok = buku.getJumlahStok();
        this.sinopsis = buku.getSinopsis();
        this.gambar = buku.getGambar();
        this.aktif = buku.isAktif();
    }

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
