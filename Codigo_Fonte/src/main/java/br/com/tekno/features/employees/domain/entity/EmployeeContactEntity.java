package br.com.tekno.features.employees.domain.entity;

public class EmployeeContactEntity {
    private int id;
    private int phone;
    private String address;
    private String district;
    private String city;
    private String states;
    private String uf;
    private int cep;
    public EmployeeContactEntity(int id, int phone, String address, String district, String city, String states,
            String uf, int cep) {
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.district = district;
        this.city = city;
        this.states = states;
        this.uf = uf;
        this.cep = cep;
    }
    public int getId() {
        return id;
    }
    public int getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public String getDistrict() {
        return district;
    }
    public String getCity() {
        return city;
    }
    public String getStates() {
        return states;
    }
    public String getUf() {
        return uf;
    }
    public int getCep() {
        return cep;
    }

    
}
