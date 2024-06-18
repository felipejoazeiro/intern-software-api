package br.com.tekno.features.contracts.domain.entity;

import java.sql.Date;

public class ContractRhEntity {
    private int id;
    private Date hour_limit;
    private Date minutes_limit;
    private int days_first_exp;
    private int days_second_exp;
    private Date data_init;
    private boolean pay_extra_hour;
    private boolean bank_hours_compens;
    private boolean manual_stitch;
    private boolean pays_breakfast;

    public ContractRhEntity(int id, Date hour_limit, Date minutes_limit, int days_first_exp, int days_second_exp,
            Date data_init, boolean pay_extra_hour, boolean bank_hours_compens, boolean manual_stitch,
            boolean pays_breakfast) {
        this.id = id;
        this.hour_limit = hour_limit;
        this.minutes_limit = minutes_limit;
        this.days_first_exp = days_first_exp;
        this.days_second_exp = days_second_exp;
        this.data_init = data_init;
        this.pay_extra_hour = pay_extra_hour;
        this.bank_hours_compens = bank_hours_compens;
        this.manual_stitch = manual_stitch;
        this.pays_breakfast = pays_breakfast;
    }

    public int getId() {
        return id;
    }

    public Date getHour_limit() {
        return hour_limit;
    }

    public Date getMinutes_limit() {
        return minutes_limit;
    }

    public int getDays_first_exp() {
        return days_first_exp;
    }

    public int getDays_second_exp() {
        return days_second_exp;
    }

    public Date getData_init() {
        return data_init;
    }

    public boolean isPay_extra_hour() {
        return pay_extra_hour;
    }

    public boolean isBank_hours_compens() {
        return bank_hours_compens;
    }

    public boolean isManual_stitch() {
        return manual_stitch;
    }

    public boolean isPays_breakfast() {
        return pays_breakfast;
    }

}
