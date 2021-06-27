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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author NFCS
 */
@Entity
@Table(name = "promo_buku")
@EntityListeners(AuditingEntityListener.class)
public class PromoBuku implements Serializable {

    @Id
    @Column(name = "id")
    private String promoBukuId;

    @ManyToOne
    @JoinColumn(name = "id_buku")
    private Buku buku;

    @Column(name = "tanggal_awal")
    private Date tanggalAwal;

    @Column(name = "tanggal_akhir")
    private Date tanggalAkhir;

    @Column(name = "harga_promo")
    private Integer hargaPromo;

    public String getPromoBukuId() {
        return promoBukuId;
    }

    public void setPromoBukuId(String promoBukuId) {
        this.promoBukuId = promoBukuId;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
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
