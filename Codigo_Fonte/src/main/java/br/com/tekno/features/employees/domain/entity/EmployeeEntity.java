package br.com.tekno.features.employees.domain.entity;

import java.sql.Date;

public class EmployeeEntity {
    private int id_employee;
    private boolean active_employee;
    private String registration;
    private String name_employee;
    private String email;
    private Date entry_date;
    private Date contract_date;
    private String date;
    private String photo;
    private int fk_cargo;

    public EmployeeEntity(int id_employee, boolean active_employee, String registration, String name_employee,
            String email, Date entry_date, Date contract_date, String date, String photo, int fk_cargo) {
        this.id_employee = id_employee;
        this.active_employee = active_employee;
        this.registration = registration;
        this.name_employee = name_employee;
        this.email = email;
        this.entry_date = entry_date;
        this.contract_date = contract_date;
        this.date = date;
        this.photo = photo;
        this.fk_cargo = fk_cargo;
    }

    public int getId_employee() {
        return id_employee;
    }

    public boolean isActive_employee() {
        return active_employee;
    }

    public String getRegistration() {
        return registration;
    }

    public String getName_employee() {
        return name_employee;
    }

    public String getEmail() {
        return email;
    }

    public Date getEntry_date() {
        return entry_date;
    }

    public Date getContract_date() {
        return contract_date;
    }

    public String getDate() {
        return date;
    }

    public String getPhoto() {
        return photo;
    }

    public int getFk_cargo() {
        return fk_cargo;
    }

}
