package br.com.tekno.features.sindicate.domain.entity;

public class SindicateAuthorizationEntity {
    private int id;
    private boolean normal_hour;
    private boolean salary_advance;
    private boolean bank_hours;
    private boolean shift_work;
    private boolean sind_pays_beneith_emplo;
    private boolean mobile_point_app_approval;

    public SindicateAuthorizationEntity(int id, boolean normal_hour, boolean salary_advance, boolean bank_hours,
            boolean shift_work, boolean sind_pays_beneith_emplo, boolean mobile_point_app_approval) {
        this.id = id;
        this.normal_hour = normal_hour;
        this.salary_advance = salary_advance;
        this.bank_hours = bank_hours;
        this.shift_work = shift_work;
        this.sind_pays_beneith_emplo = sind_pays_beneith_emplo;
        this.mobile_point_app_approval = mobile_point_app_approval;
    }

    public int getId() {
        return id;
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

}
