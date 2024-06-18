package br.com.tekno.features.sindicate.domain.entity;

public class SindicateValuesEntity {
    private int id;
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

    public SindicateValuesEntity(int id, int attendance, int base_salary, int health_insurance, int christmas_bonus,
            int associative_contribution, int childcare_assistance, int education_aid, int unhealthness,
            int dangerousness, int nightime_supplement) {
        this.id = id;
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

    public int getId() {
        return id;
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

}
