package br.com.tekno.features.employees.domain.entity;

import java.sql.Date;

public class EmployeeEntity {
    
    private int id_employee;
    private String registration;
    private String name_employee;
    private String email;
    private Date entry_date;
    private Date contract_date;
    private String date;
    private String photo;
    private int fk_documents;
    private int fk_employee_contact;
    private int fk_ticket;
    private int fk_access;
    private int fk_cargo;
    private int id_documents;
    private String nro_title;
    private String electoral_zone;
    private String electoral_section;
    private int nro_rg;
    private String state_rg;
    private int nro_work_card;
    private String series_work_card;
    private int cpf;
    private int id_contact;
    private int phone;
    private String address;
    private String district;
    private String city;
    private String states;
    private String uf;
    private int cep;
    private int id_ticket;
    private int identification;
    private String code_operator;
    private String code_line;
    private int card_number;
    private int qtt_daily_ticker;
    private int ticket_value;
    private int fk_ticket_type;
    private int id_access;
    private String login;
    private String password;

    // Get infos for new Employee
    public EmployeeEntity(String registration, String name_employee, String email, Date entry_date, Date contract_date, String photo,
    String date, int fk_cargo, String nro_title, String electoral_zone, String electoral_section, int nro_rg, String state_rg,
    int nro_work_card, String series_work_card, int cpf, int phone, String address, String district,
    String city, String states, String uf, int cep, int identification,String code_operator, String code_line, int card_number,
    int qtt_daily_ticker, int ticket_value, int fk_ticket_type) {
        this.registration = registration;
        this.name_employee = name_employee;
        this.email = email;
        this.entry_date = entry_date;
        this.contract_date = contract_date;
        this.date = date;
        this.fk_cargo = fk_cargo;
        this.nro_title = nro_title;
        this.electoral_zone = electoral_zone;
        this.electoral_section = electoral_section;
        this.nro_rg = nro_rg;
        this.state_rg = state_rg;
        this.nro_work_card = nro_work_card;
        this.series_work_card = series_work_card;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
        this.district = district;
        this.city = city;
        this.states = states;
        this.uf = uf;
        this.cep = cep;
        this.identification = identification;
        this.code_operator = code_operator;
        this.code_line = code_line;
        this.card_number = card_number;
        this.qtt_daily_ticker = qtt_daily_ticker;
        this.ticket_value = ticket_value;
        this.fk_ticket_type = fk_ticket_type;
    }

    // Get infos to edit Employee data
    public EmployeeEntity(int id_employee, String registration, String name_employee, String email, Date entry_date,
            Date contract_date, String date, String photo) {
        this.id_employee = id_employee;
        this.registration = registration;
        this.name_employee = name_employee;
        this.email = email;
        this.entry_date = entry_date;
        this.contract_date = contract_date;
        this.date = date;
        this.photo = photo;
    }

    //Get infos to edit Docouments data
    public EmployeeEntity(int id_documents, String nro_title, String electoral_zone, String electoral_section,
    int nro_rg, String state_rg, int nro_work_card, String series_work_card, int cpf) {
        this.id_documents = id_documents;
        this.nro_title = nro_title;
        this.electoral_zone = electoral_zone;
        this.electoral_section = electoral_section;
        this.nro_rg = nro_rg;
        this.state_rg = state_rg;
        this.nro_work_card = nro_work_card;
        this.series_work_card = series_work_card;
        this.cpf = cpf;
    }

    //Get infos to edit Contacts data
    public EmployeeEntity(int id_contact, int phone, String address, String district, String city, String states,
    String uf, int cep) {
        this.id_contact = id_contact;
        this.phone = phone;
        this.address = address;
        this.district = district;
        this.city = city;
        this.states = states;
        this.uf = uf;
        this.cep = cep;
    }

    //Get infos to edit Ticket data
    public EmployeeEntity(int id_ticket, int identification, String code_operator, String code_line, int card_number,
    int qtt_daily_ticker, int ticket_value, int fk_ticket_type) {
        this.id_ticket = id_ticket;
        this.identification = identification;
        this.code_operator = code_operator;
        this.code_line = code_line;
        this.card_number = card_number;
        this.qtt_daily_ticker = qtt_daily_ticker;
        this.ticket_value = ticket_value;
        this.fk_ticket_type = fk_ticket_type;
    }

    //Get infos to edit Login data
    public EmployeeEntity(int id_access, String login, String password) {
        this.id_access = id_access;
        this.login = login;
        this.password = password;
    }

    public int getId_employee() {
        return id_employee;
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
    public int getFk_documents() {
        return fk_documents;
    }
    public int getFk_employee_contact() {
        return fk_employee_contact;
    }
    public int getFk_ticket() {
        return fk_ticket;
    }
    public int getFk_access() {
        return fk_access;
    }
    public int getFk_cargo() {
        return fk_cargo;
    }
    public int getId_documents() {
        return id_documents;
    }
    public String getNro_title() {
        return nro_title;
    }
    public String getElectoral_zone() {
        return electoral_zone;
    }
    public String getElectoral_section() {
        return electoral_section;
    }
    public int getNro_rg() {
        return nro_rg;
    }
    public String getState_rg() {
        return state_rg;
    }
    public int getNro_work_card() {
        return nro_work_card;
    }
    public String getSeries_work_card() {
        return series_work_card;
    }
    public int getCpf() {
        return cpf;
    }
    public int getId_contact() {
        return id_contact;
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
    public int getId_ticket() {
        return id_ticket;
    }
    public int getIdentification() {
        return identification;
    }
    public String getCode_operator() {
        return code_operator;
    }
    public String getCode_line() {
        return code_line;
    }
    public int getCard_number() {
        return card_number;
    }
    public int getQtt_daily_ticker() {
        return qtt_daily_ticker;
    }
    public int getTicket_value() {
        return ticket_value;
    }
    public int getFk_ticket_type() {
        return fk_ticket_type;
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
