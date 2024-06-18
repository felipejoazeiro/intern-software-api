package br.com.tekno.features.sindicate.domain.entity;

public class SindicateValeEntity {
    private int id;
    private boolean falta_disc_va_vr;
    private boolean falta_disc_vr;
    private boolean atestado_disc_va_vr;
    private boolean atestado_disc_vt;
    private boolean vacation_disc_va_vr;
    private boolean vacation_disc_vt;
    private boolean afast_disc_vt_inss;
    private boolean afast_disc_va_vr_inss;
    private boolean vt_disc_min_salary;
    private int value_alim_day;
    private int limit_desc_vale_folha;
    private int limit_desc_va_vr_perc;
    private int limit_desc_va_vr_folha;
    private int desc_vt_perc;

    public SindicateValeEntity(int id, boolean falta_disc_va_vr, boolean falta_disc_vr, boolean atestado_disc_va_vr,
            boolean atestado_disc_vt, boolean vacation_disc_va_vr, boolean vacation_disc_vt, boolean afast_disc_vt_inss,
            boolean afast_disc_va_vr_inss, boolean vt_disc_min_salary, int value_alim_day, int limit_desc_vale_folha,
            int limit_desc_va_vr_perc, int limit_desc_va_vr_folha, int desc_vt_perc) {
        this.id = id;
        this.falta_disc_va_vr = falta_disc_va_vr;
        this.falta_disc_vr = falta_disc_vr;
        this.atestado_disc_va_vr = atestado_disc_va_vr;
        this.atestado_disc_vt = atestado_disc_vt;
        this.vacation_disc_va_vr = vacation_disc_va_vr;
        this.vacation_disc_vt = vacation_disc_vt;
        this.afast_disc_vt_inss = afast_disc_vt_inss;
        this.afast_disc_va_vr_inss = afast_disc_va_vr_inss;
        this.vt_disc_min_salary = vt_disc_min_salary;
        this.value_alim_day = value_alim_day;
        this.limit_desc_vale_folha = limit_desc_vale_folha;
        this.limit_desc_va_vr_perc = limit_desc_va_vr_perc;
        this.limit_desc_va_vr_folha = limit_desc_va_vr_folha;
        this.desc_vt_perc = desc_vt_perc;
    }

    public int getId() {
        return id;
    }

    public boolean isFalta_disc_va_vr() {
        return falta_disc_va_vr;
    }

    public boolean isFalta_disc_vr() {
        return falta_disc_vr;
    }

    public boolean isAtestado_disc_va_vr() {
        return atestado_disc_va_vr;
    }

    public boolean isAtestado_disc_vt() {
        return atestado_disc_vt;
    }

    public boolean isVacation_disc_va_vr() {
        return vacation_disc_va_vr;
    }

    public boolean isVacation_disc_vt() {
        return vacation_disc_vt;
    }

    public boolean isAfast_disc_vt_inss() {
        return afast_disc_vt_inss;
    }

    public boolean isAfast_disc_va_vr_inss() {
        return afast_disc_va_vr_inss;
    }

    public boolean isVt_disc_min_salary() {
        return vt_disc_min_salary;
    }

    public int getValue_alim_day() {
        return value_alim_day;
    }

    public int getLimit_desc_vale_folha() {
        return limit_desc_vale_folha;
    }

    public int getLimit_desc_va_vr_perc() {
        return limit_desc_va_vr_perc;
    }

    public int getLimit_desc_va_vr_folha() {
        return limit_desc_va_vr_folha;
    }

    public int getDesc_vt_perc() {
        return desc_vt_perc;
    }

}
