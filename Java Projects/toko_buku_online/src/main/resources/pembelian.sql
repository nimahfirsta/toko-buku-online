-- Table: toko_buku_online.pembelian

-- DROP TABLE toko_buku_online.pembelian;

CREATE TABLE toko_buku_online.pembelian
(
    id character varying(100) COLLATE pg_catalog."default" NOT NULL,
    nomor_transaksi numeric(10,0) DEFAULT nextval('toko_buku_online.nomor_transaksi_seq'::regclass),
    tanggal_transaksi date,
    nama_pembeli character varying(100) COLLATE pg_catalog."default",
    email_pembeli character varying(100) COLLATE pg_catalog."default",
    no_hp_pembeli character varying(100) COLLATE pg_catalog."default",
    alamat_pembeli character varying(100) COLLATE pg_catalog."default",
    total_harga_beli numeric(10,0),
    CONSTRAINT pembelian_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE toko_buku_online.pembelian
    OWNER to postgres;