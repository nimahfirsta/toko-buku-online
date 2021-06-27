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
@Table(name = "pembelian_detil_item")
@EntityListeners(AuditingEntityListener.class)
public class PembelianDetilItem implements Serializable {

    @Id
    @Column(name = "id")
    private String pembelianDetilItemId;

    @ManyToOne
    @JoinColumn(name = "id_pembelian")
    private Pembelian pembelian;

    @ManyToOne
    @JoinColumn(name = "id_buku")
    private Buku buku;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "harga")
    private Integer harga;

    @Column(name = "sub_total")
    private Integer subTotal;

    public String getPembelianDetilItemId() {
        return pembelianDetilItemId;
    }

    public void setPembelianDetilItemId(String pembelianDetilItemId) {
        this.pembelianDetilItemId = pembelianDetilItemId;
    }

    public Pembelian getPembelian() {
        return pembelian;
    }

    public void setPembelian(Pembelian pembelian) {
        this.pembelian = pembelian;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
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
