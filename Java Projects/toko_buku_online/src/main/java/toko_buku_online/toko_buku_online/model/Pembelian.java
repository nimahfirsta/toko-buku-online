/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_buku_online.toko_buku_online.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author NFCS
 */
@Entity
@Table(name = "pembelian")
@EntityListeners(AuditingEntityListener.class)
public class Pembelian implements Serializable {

    @Id
    @Column(name = "id")
    private String pembelianId;

    @Column(name = "nomor_transaksi", columnDefinition="serial")
    @Generated(GenerationTime.INSERT)
    private Integer nomorTransaksi;

    @Column(name = "tanggal_transaksi")
    private Date tanggalTransaksi;

    @Column(name = "nama_pembeli")
    private String namaPembeli;

    @Column(name = "email_pembeli")
    private String emailPembeli;

    @Column(name = "no_hp_pembeli")
    private String noHpPembeli;

    @Column(name = "alamat_pembeli")
    private String alamatPembeli;

    @Column(name = "total_harga_beli")
    private Integer totalHargaBeli;

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
