package br.com.tekno.features.sindicate.domain.entity;

public class SindicateCbEntity {
    private int id;
    private int discount_basic;
    private int value_basic;
    private int limit_disc_basic;
    private boolean falta_disc_basic;
    private boolean afast_disc_porp;
    private boolean ferias_disc;
    private boolean get_basic_with_one_day;
    private boolean magnetic_card;
    private boolean misses_day_prop_disc;
    private boolean afast_prop_disc;
    private boolean atestado_disc;
    private boolean atestado_prop_disc;
    private boolean ferias_prop_disc;
    private boolean basic_nature;

    public SindicateCbEntity(int id, int discount_basic, int value_basic, int limit_disc_basic,
            boolean falta_disc_basic, boolean afast_disc_porp, boolean ferias_disc, boolean get_basic_with_one_day,
            boolean magnetic_card, boolean misses_day_prop_disc, boolean afast_prop_disc, boolean atestado_disc,
            boolean atestado_prop_disc, boolean ferias_prop_disc, boolean basic_nature) {
        this.id = id;
        this.discount_basic = discount_basic;
        this.value_basic = value_basic;
        this.limit_disc_basic = limit_disc_basic;
        this.falta_disc_basic = falta_disc_basic;
        this.afast_disc_porp = afast_disc_porp;
        this.ferias_disc = ferias_disc;
        this.get_basic_with_one_day = get_basic_with_one_day;
        this.magnetic_card = magnetic_card;
        this.misses_day_prop_disc = misses_day_prop_disc;
        this.afast_prop_disc = afast_prop_disc;
        this.atestado_disc = atestado_disc;
        this.atestado_prop_disc = atestado_prop_disc;
        this.ferias_prop_disc = ferias_prop_disc;
        this.basic_nature = basic_nature;
    }

    public int getId() {
        return id;
    }

    public int getDiscount_basic() {
        return discount_basic;
    }

    public int getValue_basic() {
        return value_basic;
    }

    public int getLimit_disc_basic() {
        return limit_disc_basic;
    }

    public boolean isFalta_disc_basic() {
        return falta_disc_basic;
    }

    public boolean isAfast_disc_porp() {
        return afast_disc_porp;
    }

    public boolean isFerias_disc() {
        return ferias_disc;
    }

    public boolean isGet_basic_with_one_day() {
        return get_basic_with_one_day;
    }

    public boolean isMagnetic_card() {
        return magnetic_card;
    }

    public boolean isMisses_day_prop_disc() {
        return misses_day_prop_disc;
    }

    public boolean isAfast_prop_disc() {
        return afast_prop_disc;
    }

    public boolean isAtestado_disc() {
        return atestado_disc;
    }

    public boolean isAtestado_prop_disc() {
        return atestado_prop_disc;
    }

    public boolean isFerias_prop_disc() {
        return ferias_prop_disc;
    }

    public boolean isBasic_nature() {
        return basic_nature;
    }

}
