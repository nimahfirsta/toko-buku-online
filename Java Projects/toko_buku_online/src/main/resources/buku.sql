/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  NFCS
 */
-- Table: toko_buku_online.buku

-- DROP TABLE toko_buku_online.buku;

CREATE TABLE toko_buku_online.buku
(
    id character varying(100) COLLATE pg_catalog."default" NOT NULL,
    judul character varying(100) COLLATE pg_catalog."default",
    kategori character varying(100) COLLATE pg_catalog."default",
    harga numeric(10,0),
    penulis character varying(100) COLLATE pg_catalog."default",
    penerbit character varying(100) COLLATE pg_catalog."default",
    jumlah_stok numeric(10,0),
    sinopsis text COLLATE pg_catalog."default",
    gambar text COLLATE pg_catalog."default",
    aktif boolean NOT NULL,
    CONSTRAINT buku_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE toko_buku_online.buku
    OWNER to postgres;
