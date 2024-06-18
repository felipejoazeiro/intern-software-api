package br.com.tekno.features.sindicate.domain.entity;

import java.sql.Date;

public class SindicateEntity {
    private int id;
    private String nro_register_cct;
    private Date date_start_cct;
    private Date date_finish_cct;

    public SindicateEntity(int id, String nro_register_cct, Date date_start_cct, Date date_finish_cct) {
        this.id = id;
        this.nro_register_cct = nro_register_cct;
        this.date_start_cct = date_start_cct;
        this.date_finish_cct = date_finish_cct;
    }

    public int getId() {
        return id;
    }

    public String getNro_register_cct() {
        return nro_register_cct;
    }

    public Date getDate_start_cct() {
        return date_start_cct;
    }

    public Date getDate_finish_cct() {
        return date_finish_cct;
    }

}
