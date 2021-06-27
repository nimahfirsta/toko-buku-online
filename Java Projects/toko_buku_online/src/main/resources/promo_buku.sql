-- Table: toko_buku_online.promo_buku

-- DROP TABLE toko_buku_online.promo_buku;

CREATE TABLE toko_buku_online.promo_buku
(
    id character varying(100) COLLATE pg_catalog."default" NOT NULL,
    id_buku character varying(100) COLLATE pg_catalog."default",
    tanggal_awal date,
    tanggal_akhir date,
    harga_promo numeric(10,0),
    CONSTRAINT fkdx63ab362omli8x180r913srb FOREIGN KEY (id_buku)
        REFERENCES toko_buku_online.buku (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT id_buku FOREIGN KEY (id_buku)
        REFERENCES toko_buku_online.buku (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE toko_buku_online.promo_buku
    OWNER to postgres;