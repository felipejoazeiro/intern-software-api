package br.com.tekno.features.employees.domain.entity;

public class EmployeeAccessEntity {
    private int id_access;
    private String login;
    private String password;

    public EmployeeAccessEntity(int id_access, String login, String password) {
        this.id_access = id_access;
        this.login = login;
        this.password = password;
    }

    public int getId_access() {
        return id_access;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
