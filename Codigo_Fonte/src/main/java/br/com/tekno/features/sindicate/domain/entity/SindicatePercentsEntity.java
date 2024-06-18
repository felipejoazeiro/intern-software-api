package br.com.tekno.features.sindicate.domain.entity;

public class SindicatePercentsEntity {
    private int id;
    private int extra_hour_week;
    private int extra_hour_saturday;
    private int extra_hour_sunday_holidays;
    private int sindicate_contr;
    private int seconci;
    private int salary_advance_percents;
    private int incentive_qualify;
    private int complem_retirement;
    private int night_time;

    public SindicatePercentsEntity(int id, int extra_hour_week, int extra_hour_saturday, int extra_hour_sunday_holidays,
            int sindicate_contr, int seconci, int salary_advance_percents, int incentive_qualify,
            int complem_retirement, int night_time) {
        this.id = id;
        this.extra_hour_week = extra_hour_week;
        this.extra_hour_saturday = extra_hour_saturday;
        this.extra_hour_sunday_holidays = extra_hour_sunday_holidays;
        this.sindicate_contr = sindicate_contr;
        this.seconci = seconci;
        this.salary_advance_percents = salary_advance_percents;
        this.incentive_qualify = incentive_qualify;
        this.complem_retirement = complem_retirement;
        this.night_time = night_time;
    }

    public int getId() {
        return id;
    }

    public int getExtra_hour_week() {
        return extra_hour_week;
    }

    public int getExtra_hour_saturday() {
        return extra_hour_saturday;
    }

    public int getExtra_hour_sunday_holidays() {
        return extra_hour_sunday_holidays;
    }

    public int getSindicate_contr() {
        return sindicate_contr;
    }

    public int getSeconci() {
        return seconci;
    }

    public int getSalary_advance_percents() {
        return salary_advance_percents;
    }

    public int getIncentive_qualify() {
        return incentive_qualify;
    }

    public int getComplem_retirement() {
        return complem_retirement;
    }

    public int getNight_time() {
        return night_time;
    }

}
