package br.com.tekno.features.contracts.domain.entity;

public class ContractInfosEntity {
    private int id;
    private String construction;
    private String cap;
    private String process;
    private String info_pmoc;
    private int max_employee;
    private int idContact;
    private String address;
    private int nro;
    private String complement;
    private int phone;
    private String state;
    private String city;
    private int cep;
    private String email;
    private String contact;

    public ContractInfosEntity(int id, String construction, String cap, String process, String info_pmoc,
            int max_employee, int idContact, String address, int nro, String complement, int phone, String state,
            String city, int cep, String email, String contact) {
        this.id = id;
        this.construction = construction;
        this.cap = cap;
        this.process = process;
        this.info_pmoc = info_pmoc;
        this.max_employee = max_employee;
        this.idContact = idContact;
        this.address = address;
        this.nro = nro;
        this.complement = complement;
        this.phone = phone;
        this.state = state;
        this.city = city;
        this.cep = cep;
        this.email = email;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public String getConstruction() {
        return construction;
    }

    public String getCap() {
        return cap;
    }

    public String getProcess() {
        return process;
    }

    public String getInfo_pmoc() {
        return info_pmoc;
    }

    public int getMax_employee() {
        return max_employee;
    }

    public int getIdContact() {
        return idContact;
    }

    public String getAddress() {
        return address;
    }

    public int getNro() {
        return nro;
    }

    public String getComplement() {
        return complement;
    }

    public int getPhone() {
        return phone;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

}
