package br.com.tekno.features.sindicate.domain.entity;

import java.sql.Date;


public class CreateSindicateEntity {
    private int idSindicate;
    private String nro_register_cct;
    private Date date_start_cct;
    private Date date_finish_cct;
    private int fk_sindicate_percents;
    private int fk_sindicate_values;
    private int fk_sindicate_authorization;
    private int fk_sindicate_breakfest;
    private int fk_sindicate_cesta_basica;
    private int fk_sindicate_vale;
    private int idCB;
    private int identificationCB;
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
    private int idVale;
    private int identificationVale;
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
    private int idBreakfest;
    private int identificationBreakfest;
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
    private int idAutho;
    private int identificationAuth;
    private boolean normal_hour;
    private boolean salary_advance;
    private boolean bank_hours;
    private boolean shift_work;
    private boolean sind_pays_beneith_emplo;
    private boolean mobile_point_app_approval;
    private int idValues;
    private int identificationValues;
    private int attendance;
    private int base_salary;
    private int health_insurance;
    private int christmas_bonus;
    private int associative_contribution;
    private int childcare_assistance;
    private int education_aid;
    private int unhealthness;
    private int dangerousness;
    private int nightime_supplement;
    private int idPercents;
    private int identificationPercents;
    private int extra_hour_week;
    private int extra_hour_saturday;
    private int extra_hour_sunday_holidays;
    private int sindicate_contr;
    private int seconci;
    private int salary_advance_percents;
    private int incentive_qualify;
    private int complem_retirement;
    private int night_time;

    public CreateSindicateEntity(String nro_register_cct, Date date_start_cct, Date date_finish_cct,
            int fk_sindicate_percents, int fk_sindicate_values, int fk_sindicate_authorization,
            int fk_sindicate_breakfest, int fk_sindicate_cesta_basica, int fk_sindicate_vale, int identificationCB,
            int discount_basic, int value_basic, int limit_disc_basic, boolean falta_disc_basic,
            boolean afast_disc_porp, boolean ferias_disc, boolean get_basic_with_one_day, boolean magnetic_card,
            boolean misses_day_prop_disc, boolean afast_prop_disc, boolean atestado_disc, boolean atestado_prop_disc,
            boolean ferias_prop_disc, boolean basic_nature, int identificationVale, boolean falta_disc_va_vr,
            boolean falta_disc_vr, boolean atestado_disc_va_vr, boolean atestado_disc_vt, boolean vacation_disc_va_vr,
            boolean vacation_disc_vt, boolean afast_disc_vt_inss, boolean afast_disc_va_vr_inss,
            boolean vt_disc_min_salary, int value_alim_day, int limit_desc_vale_folha, int limit_desc_va_vr_perc,
            int limit_desc_va_vr_folha, int desc_vt_perc, int identificationBreakfest, boolean atest_disc,
            boolean atest_disc_prop, boolean falta_disc, boolean falta_disc_prop, boolean vacation_disc,
            boolean vacation_disc_prop, boolean afast_disc, boolean afast_disc_prop, boolean break_nature,
            int limit_desc_percent, int value_day, int value_month, int limit_desc, int identificationAuth,
            boolean normal_hour, boolean salary_advance, boolean bank_hours, boolean shift_work,
            boolean sind_pays_beneith_emplo, boolean mobile_point_app_approval, int idValues, int identificationValues,
            int attendance, int base_salary, int health_insurance, int christmas_bonus, int associative_contribution,
            int childcare_assistance, int education_aid, int unhealthness, int dangerousness, int nightime_supplement,
            int identificationPercents, int extra_hour_week, int extra_hour_saturday, int extra_hour_sunday_holidays,
            int sindicate_contr, int seconci, int salary_advance_percents, int incentive_qualify,
            int complem_retirement, int night_time) {
        this.nro_register_cct = nro_register_cct;
        this.date_start_cct = date_start_cct;
        this.date_finish_cct = date_finish_cct;
        this.fk_sindicate_percents = fk_sindicate_percents;
        this.fk_sindicate_values = fk_sindicate_values;
        this.fk_sindicate_authorization = fk_sindicate_authorization;
        this.fk_sindicate_breakfest = fk_sindicate_breakfest;
        this.fk_sindicate_cesta_basica = fk_sindicate_cesta_basica;
        this.fk_sindicate_vale = fk_sindicate_vale;
        this.identificationCB = identificationCB;
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
        this.identificationVale = identificationVale;
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
        this.identificationBreakfest = identificationBreakfest;
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
        this.identificationAuth = identificationAuth;
        this.normal_hour = normal_hour;
        this.salary_advance = salary_advance;
        this.bank_hours = bank_hours;
        this.shift_work = shift_work;
        this.sind_pays_beneith_emplo = sind_pays_beneith_emplo;
        this.mobile_point_app_approval = mobile_point_app_approval;
        this.idValues = idValues;
        this.identificationValues = identificationValues;
        this.attendance = attendance;
        this.base_salary = base_salary;
        this.health_insurance = health_insurance;
        this.christmas_bonus = christmas_bonus;
        this.associative_contribution = associative_contribution;
        this.childcare_assistance = childcare_assistance;
        this.education_aid = education_aid;
        this.unhealthness = unhealthness;
        this.dangerousness = dangerousness;
        this.nightime_supplement = nightime_supplement;
        this.identificationPercents = identificationPercents;
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

    public CreateSindicateEntity(int idSindicate, String nro_register_cct, Date date_start_cct, Date date_finish_cct) {
        this.idSindicate = idSindicate;
        this.nro_register_cct = nro_register_cct;
        this.date_start_cct = date_start_cct;
        this.date_finish_cct = date_finish_cct;
    }

    public CreateSindicateEntity(int idCB, int discount_basic, int value_basic, int limit_disc_basic,
            boolean falta_disc_basic, boolean afast_disc_porp, boolean ferias_disc, boolean get_basic_with_one_day,
            boolean magnetic_card, boolean misses_day_prop_disc, boolean afast_prop_disc, boolean atestado_disc,
            boolean atestado_prop_disc, boolean ferias_prop_disc, boolean basic_nature) {
        this.idCB = idCB;
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
    
    public CreateSindicateEntity(int idVale, boolean falta_disc_va_vr, boolean falta_disc_vr,
            boolean atestado_disc_va_vr, boolean atestado_disc_vt, boolean vacation_disc_va_vr,
            boolean vacation_disc_vt, boolean afast_disc_vt_inss, boolean afast_disc_va_vr_inss,
            boolean vt_disc_min_salary, int value_alim_day, int limit_desc_vale_folha, int limit_desc_va_vr_perc,
            int limit_desc_va_vr_folha, int desc_vt_perc) {
        this.idVale = idVale;
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

    public CreateSindicateEntity(int idBreakfest, boolean atest_disc, boolean atest_disc_prop, boolean falta_disc,
            boolean falta_disc_prop, boolean vacation_disc, boolean vacation_disc_prop, boolean afast_disc,
            boolean afast_disc_prop, boolean break_nature, int limit_desc_percent, int value_day, int value_month,
            int limit_desc) {
        this.idBreakfest = idBreakfest;
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

    public CreateSindicateEntity(int idAutho, boolean normal_hour, boolean salary_advance, boolean bank_hours,
            boolean shift_work, boolean sind_pays_beneith_emplo, boolean mobile_point_app_approval) {
        this.idAutho = idAutho;
        this.normal_hour = normal_hour;
        this.salary_advance = salary_advance;
        this.bank_hours = bank_hours;
        this.shift_work = shift_work;
        this.sind_pays_beneith_emplo = sind_pays_beneith_emplo;
        this.mobile_point_app_approval = mobile_point_app_approval;
    }
    
    public CreateSindicateEntity(int idValues, int attendance, int base_salary, int health_insurance, int christmas_bonus,
            int associative_contribution, int childcare_assistance, int education_aid, int unhealthness,
            int dangerousness, int nightime_supplement) {
        this.idValues = idValues;
        this.attendance = attendance;
        this.base_salary = base_salary;
        this.health_insurance = health_insurance;
        this.christmas_bonus = christmas_bonus;
        this.associative_contribution = associative_contribution;
        this.childcare_assistance = childcare_assistance;
        this.education_aid = education_aid;
        this.unhealthness = unhealthness;
        this.dangerousness = dangerousness;
        this.nightime_supplement = nightime_supplement;
    }

    public CreateSindicateEntity(int idPercents, int extra_hour_week, int extra_hour_saturday, int extra_hour_sunday_holidays,
            int sindicate_contr, int seconci, int salary_advance_percents, int incentive_qualify,
            int complem_retirement, int night_time) {
        this.idPercents = idPercents;
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

    public int getIdSindicate() {
        return idSindicate;
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

    public int getFk_sindicate_percents() {
        return fk_sindicate_percents;
    }

    public int getFk_sindicate_values() {
        return fk_sindicate_values;
    }

    public int getFk_sindicate_authorization() {
        return fk_sindicate_authorization;
    }

    public int getFk_sindicate_breakfest() {
        return fk_sindicate_breakfest;
    }

    public int getFk_sindicate_cesta_basica() {
        return fk_sindicate_cesta_basica;
    }

    public int getFk_sindicate_vale() {
        return fk_sindicate_vale;
    }

    public int getIdCB() {
        return idCB;
    }

    public int getIdentificationCB() {
        return identificationCB;
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

    public int getIdVale() {
        return idVale;
    }

    public int getIdentificationVale() {
        return identificationVale;
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

    public int getIdBreakfest() {
        return idBreakfest;
    }

    public int getIdentificationBreakfest() {
        return identificationBreakfest;
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

    public int getIdAutho() {
        return idAutho;
    }

    public int getIdentificationAuth() {
        return identificationAuth;
    }

    public boolean isNormal_hour() {
        return normal_hour;
    }

    public boolean isSalary_advance() {
        return salary_advance;
    }

    public boolean isBank_hours() {
        return bank_hours;
    }

    public boolean isShift_work() {
        return shift_work;
    }

    public boolean isSind_pays_beneith_emplo() {
        return sind_pays_beneith_emplo;
    }

    public boolean isMobile_point_app_approval() {
        return mobile_point_app_approval;
    }

    public int getIdValues() {
        return idValues;
    }

    public int getIdentificationValues() {
        return identificationValues;
    }

    public int getAttendance() {
        return attendance;
    }

    public int getBase_salary() {
        return base_salary;
    }

    public int getHealth_insurance() {
        return health_insurance;
    }

    public int getChristmas_bonus() {
        return christmas_bonus;
    }

    public int getAssociative_contribution() {
        return associative_contribution;
    }

    public int getChildcare_assistance() {
        return childcare_assistance;
    }

    public int getEducation_aid() {
        return education_aid;
    }

    public int getUnhealthness() {
        return unhealthness;
    }

    public int getDangerousness() {
        return dangerousness;
    }

    public int getNightime_supplement() {
        return nightime_supplement;
    }

    public int getIdPercents() {
        return idPercents;
    }

    public int getIdentificationPercents() {
        return identificationPercents;
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