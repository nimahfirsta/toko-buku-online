/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  NFCS
 */

-- SEQUENCE: toko_buku_online.nomor_transaksi_seq

-- DROP SEQUENCE toko_buku_online.nomor_transaksi_seq;

CREATE SEQUENCE toko_buku_online.nomor_transaksi_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9999999999
    CACHE 1;

ALTER SEQUENCE toko_buku_online.nomor_transaksi_seq
    OWNER TO postgres;