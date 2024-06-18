package br.com.tekno.features.contracts.domain.entity;

import java.sql.Date;

public class ContractDatesEntity {
    private int id;
    private Date date_initial;
    private Date date_limit;
    private Date date_guarantee;
    private Date date_proposal;
    private Date date_budget;
    private Date date_tables;

    public ContractDatesEntity(int id , Date date_initial, Date date_limit, Date date_guarantee,
            Date date_proposal, Date date_budget, Date date_tables) {
        this.id = id;
        this.date_initial = date_initial;
        this.date_limit = date_limit;
        this.date_guarantee = date_guarantee;
        this.date_proposal = date_proposal;
        this.date_budget = date_budget;
        this.date_tables = date_tables;
    }

    public int getId() {
        return id;
    }

    public Date getDate_initial() {
        return date_initial;
    }

    public Date getDate_limit() {
        return date_limit;
    }

    public Date getDate_guarantee() {
        return date_guarantee;
    }

    public Date getDate_proposal() {
        return date_proposal;
    }

    public Date getDate_budget() {
        return date_budget;
    }

    public Date getDate_tables() {
        return date_tables;
    }

}
