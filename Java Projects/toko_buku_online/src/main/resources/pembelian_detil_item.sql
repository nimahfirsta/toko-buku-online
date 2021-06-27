-- Table: toko_buku_online.pembelian_detil_item

-- DROP TABLE toko_buku_online.pembelian_detil_item;

CREATE TABLE toko_buku_online.pembelian_detil_item
(
    id character varying(100) COLLATE pg_catalog."default" NOT NULL,
    id_pembelian character varying(100) COLLATE pg_catalog."default",
    id_buku character varying(100) COLLATE pg_catalog."default",
    qty numeric(10,0),
    harga numeric(10,0),
    sub_total numeric(10,0),
    CONSTRAINT fkkwp8gf5lvbn5eejg1qbd6limd FOREIGN KEY (id_pembelian)
        REFERENCES toko_buku_online.pembelian (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkmapy45atkt6nsone0y59m5ava FOREIGN KEY (id_buku)
        REFERENCES toko_buku_online.buku (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT id_buku FOREIGN KEY (id_buku)
        REFERENCES toko_buku_online.buku (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT id_pembelian FOREIGN KEY (id_pembelian)
        REFERENCES toko_buku_online.pembelian (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE toko_buku_online.pembelian_detil_item
    OWNER to postgres;