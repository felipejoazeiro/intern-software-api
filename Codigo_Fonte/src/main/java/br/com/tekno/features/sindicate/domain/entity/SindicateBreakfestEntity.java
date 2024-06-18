package br.com.tekno.features.sindicate.domain.entity;

public class SindicateBreakfestEntity {
    private int id;
    private boolean atest_disc;
    private boolean atest_disc_prop;
    private boolean falta_disc;
    private boolean falta_disc_prop;
    private boolean vacation_disc;
    private boolean vacation_disc_prop;
    private boolean afast_disc;
    private boolean afast_disc_prop;
    private boolean break_nature;
    private int limit_desc_percent;
    private int value_day;
    private int value_month;
    private int limit_desc;

    public SindicateBreakfestEntity(int id, boolean atest_disc, boolean atest_disc_prop, boolean falta_disc,
            boolean falta_disc_prop, boolean vacation_disc, boolean vacation_disc_prop, boolean afast_disc,
            boolean afast_disc_prop, boolean break_nature, int limit_desc_percent, int value_day, int value_month,
            int limit_desc) {
        this.id = id;
        this.atest_disc = atest_disc;
        this.atest_disc_prop = atest_disc_prop;
        this.falta_disc = falta_disc;
        this.falta_disc_prop = falta_disc_prop;
        this.vacation_disc = vacation_disc;
        this.vacation_disc_prop = vacation_disc_prop;
        this.afast_disc = afast_disc;
        this.afast_disc_prop = afast_disc_prop;
        this.break_nature = break_nature;
        this.limit_desc_percent = limit_desc_percent;
        this.value_day = value_day;
        this.value_month = value_month;
        this.limit_desc = limit_desc;
    }

    public int getId() {
        return id;
    }

    public boolean isAtest_disc() {
        return atest_disc;
    }

    public boolean isAtest_disc_prop() {
        return atest_disc_prop;
    }

    public boolean isFalta_disc() {
        return falta_disc;
    }

    public boolean isFalta_disc_prop() {
        return falta_disc_prop;
    }

    public boolean isVacation_disc() {
        return vacation_disc;
    }

    public boolean isVacation_disc_prop() {
        return vacation_disc_prop;
    }

    public boolean isAfast_disc() {
        return afast_disc;
    }

    public boolean isAfast_disc_prop() {
        return afast_disc_prop;
    }

    public boolean isBreak_nature() {
        return break_nature;
    }

    public int getLimit_desc_percent() {
        return limit_desc_percent;
    }

    public int getValue_day() {
        return value_day;
    }

    public int getValue_month() {
        return value_month;
    }

    public int getLimit_desc() {
        return limit_desc;
    }

}
