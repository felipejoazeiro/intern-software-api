package br.com.tekno.features.contracts.domain.entity;

import java.sql.Date;

public class ContractEntity {

    private int idContract;
    private String code_contract;
    private String name_contract;
    private String acronymEmployee;
    private boolean research;
    private boolean active;
    private boolean uses_cpf;
    private int fk_contract_contact;
    private int fk_contract_info;
    private int fk_contract_dates;
    private int fk_contract_values;
    private int fk_contract_discount;
    private int fk_contract_rh;
    private int idInfos;
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
    private int idValues;
    private int value_identifier;
    private String acronymValues;
    private int bdi_service;
    private int bdi_material;
    private int bdi_labor;
    private boolean entry_table;
    private boolean send_email;
    private int idDates;
    private int date_identifier;
    private Date date_initial;
    private Date date_limit;
    private Date date_guarantee;
    private Date date_proposal;
    private Date date_budget;
    private Date date_tables;
    private int idDiscount;
    private int disc_identifier;
    private int disc_service;
    private int disc_transport;
    private int disc_tranp_employee;
    private int disc_labor;
    private int disc_material;
    private int disc_field;
    private int idRh;
    private int rh_identifier;
    private Date hour_limit;
    private Date minutes_limit;
    private int days_first_exp;
    private int days_second_exp;
    private Date data_init;
    private boolean pay_extra_hour;
    private boolean bank_hours_compens;
    private boolean manual_stitch;
    private boolean pays_breakfast;

    public ContractEntity(int idContract, String code_contract, String name_contract, String acronymEmployee,
            boolean research, boolean active, boolean uses_cpf, int fk_contract_contact, int fk_contract_info,
            int fk_contract_dates, int fk_contract_values, int fk_contract_discount, int fk_contract_rh, int idInfos,
            String construction, String cap, String process, String info_pmoc, int max_employee, int idContact,
            String address, int nro, String complement, int phone, String state, String city, int cep, String email,
            String contact, int idValues, int value_identifier, String acronymValues, int bdi_service, int bdi_material,
            int bdi_labor, boolean entry_table, boolean send_email, int idDates, int date_identifier, Date date_initial,
            Date date_limit, Date date_guarantee, Date date_proposal, Date date_budget, Date date_tables,
            int idDiscount, int disc_identifier, int disc_service, int disc_transport, int disc_tranp_employee,
            int disc_labor, int disc_material, int disc_field, int idRh, int rh_identifier, Date hour_limit,
            Date minutes_limit, int days_first_exp, int days_second_exp, Date data_init, boolean pay_extra_hour,
            boolean bank_hours_compens, boolean manual_stitch, boolean pays_breakfast) {
        this.idContract = idContract;
        this.code_contract = code_contract;
        this.name_contract = name_contract;
        this.acronymEmployee = acronymEmployee;
        this.research = research;
        this.active = active;
        this.uses_cpf = uses_cpf;
        this.fk_contract_contact = fk_contract_contact;
        this.fk_contract_info = fk_contract_info;
        this.fk_contract_dates = fk_contract_dates;
        this.fk_contract_values = fk_contract_values;
        this.fk_contract_discount = fk_contract_discount;
        this.fk_contract_rh = fk_contract_rh;
        this.idInfos = idInfos;
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
        this.idValues = idValues;
        this.value_identifier = value_identifier;
        this.acronymValues = acronymValues;
        this.bdi_service = bdi_service;
        this.bdi_material = bdi_material;
        this.bdi_labor = bdi_labor;
        this.entry_table = entry_table;
        this.send_email = send_email;
        this.idDates = idDates;
        this.date_identifier = date_identifier;
        this.date_initial = date_initial;
        this.date_limit = date_limit;
        this.date_guarantee = date_guarantee;
        this.date_proposal = date_proposal;
        this.date_budget = date_budget;
        this.date_tables = date_tables;
        this.idDiscount = idDiscount;
        this.disc_identifier = disc_identifier;
        this.disc_service = disc_service;
        this.disc_transport = disc_transport;
        this.disc_tranp_employee = disc_tranp_employee;
        this.disc_labor = disc_labor;
        this.disc_material = disc_material;
        this.disc_field = disc_field;
        this.idRh = idRh;
        this.rh_identifier = rh_identifier;
        this.hour_limit = hour_limit;
        this.minutes_limit = minutes_limit;
        this.days_first_exp = days_first_exp;
        this.days_second_exp = days_second_exp;
        this.data_init = data_init;
        this.pay_extra_hour = pay_extra_hour;
        this.bank_hours_compens = bank_hours_compens;
        this.manual_stitch = manual_stitch;
        this.pays_breakfast = pays_breakfast;
    }

    //Create new Contract
    public ContractEntity(String code_contract, String name_contract, String acronymEmployee, boolean research,
            boolean active, boolean uses_cpf, String construction, String cap, String process, String info_pmoc,
            int max_employee, int idContact, String address, int nro, String complement, int phone, String state,
            String city, int cep, String email, String contact, int value_identifier, String acronymValues,
            int bdi_service, int bdi_material, int bdi_labor, boolean entry_table, boolean send_email,
            int date_identifier, Date date_initial, Date date_limit, Date date_guarantee, Date date_proposal,
            Date date_budget, Date date_tables, int disc_identifier, int disc_service, int disc_transport,
            int disc_tranp_employee, int disc_labor, int disc_material, int disc_field, int rh_identifier,
            Date hour_limit, Date minutes_limit, int days_first_exp, int days_second_exp, Date data_init,
            boolean pay_extra_hour, boolean bank_hours_compens, boolean manual_stitch, boolean pays_breakfast) {
        this.code_contract = code_contract;
        this.name_contract = name_contract;
        this.acronymEmployee = acronymEmployee;
        this.research = research;
        this.active = active;
        this.uses_cpf = uses_cpf;
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
        this.value_identifier = value_identifier;
        this.acronymValues = acronymValues;
        this.bdi_service = bdi_service;
        this.bdi_material = bdi_material;
        this.bdi_labor = bdi_labor;
        this.entry_table = entry_table;
        this.send_email = send_email;
        this.date_identifier = date_identifier;
        this.date_initial = date_initial;
        this.date_limit = date_limit;
        this.date_guarantee = date_guarantee;
        this.date_proposal = date_proposal;
        this.date_budget = date_budget;
        this.date_tables = date_tables;
        this.disc_identifier = disc_identifier;
        this.disc_service = disc_service;
        this.disc_transport = disc_transport;
        this.disc_tranp_employee = disc_tranp_employee;
        this.disc_labor = disc_labor;
        this.disc_material = disc_material;
        this.disc_field = disc_field;
        this.rh_identifier = rh_identifier;
        this.hour_limit = hour_limit;
        this.minutes_limit = minutes_limit;
        this.days_first_exp = days_first_exp;
        this.days_second_exp = days_second_exp;
        this.data_init = data_init;
        this.pay_extra_hour = pay_extra_hour;
        this.bank_hours_compens = bank_hours_compens;
        this.manual_stitch = manual_stitch;
        this.pays_breakfast = pays_breakfast;
    }

    public ContractEntity(int idContract, String code_contract, String name_contract, String acronymEmployee,
            boolean research, boolean active, boolean uses_cpf, int fk_contract_contact, int fk_contract_info,
            int fk_contract_dates, int fk_contract_values, int fk_contract_discount) {
        this.idContract = idContract;
        this.code_contract = code_contract;
        this.name_contract = name_contract;
        this.acronymEmployee = acronymEmployee;
        this.research = research;
        this.active = active;
        this.uses_cpf = uses_cpf;
        this.fk_contract_contact = fk_contract_contact;
        this.fk_contract_info = fk_contract_info;
        this.fk_contract_dates = fk_contract_dates;
        this.fk_contract_values = fk_contract_values;
        this.fk_contract_discount = fk_contract_discount;
    }

    public ContractEntity(int idInfos, String construction, String cap, String process, String info_pmoc,
            int max_employee) {
        this.idInfos = idInfos;
        this.construction = construction;
        this.cap = cap;
        this.process = process;
        this.info_pmoc = info_pmoc;
        this.max_employee = max_employee;
    }

    public ContractEntity(int idContact, String address, int nro, String complement, int phone, String state,
            String city, int cep, String email, String contact) {
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

    public ContractEntity(int idValues, int value_identifier, String acronymValues, int bdi_service, int bdi_material,
            int bdi_labor, boolean entry_table, boolean send_email) {
        this.idValues = idValues;
        this.value_identifier = value_identifier;
        this.acronymValues = acronymValues;
        this.bdi_service = bdi_service;
        this.bdi_material = bdi_material;
        this.bdi_labor = bdi_labor;
        this.entry_table = entry_table;
        this.send_email = send_email;
    }

    public ContractEntity(int idDates, int date_identifier, Date date_initial, Date date_limit, Date date_guarantee,
            Date date_proposal, Date date_budget, Date date_tables) {
        this.idDates = idDates;
        this.date_identifier = date_identifier;
        this.date_initial = date_initial;
        this.date_limit = date_limit;
        this.date_guarantee = date_guarantee;
        this.date_proposal = date_proposal;
        this.date_budget = date_budget;
        this.date_tables = date_tables;
    }

    public ContractEntity(int idDiscount, int disc_identifier, int disc_service, int disc_transport,
            int disc_tranp_employee, int disc_labor, int disc_material, int disc_field) {
        this.idDiscount = idDiscount;
        this.disc_identifier = disc_identifier;
        this.disc_service = disc_service;
        this.disc_transport = disc_transport;
        this.disc_tranp_employee = disc_tranp_employee;
        this.disc_labor = disc_labor;
        this.disc_material = disc_material;
        this.disc_field = disc_field;
    }

    public ContractEntity(int idRh, int rh_identifier, Date hour_limit, Date minutes_limit, int days_first_exp,
            int days_second_exp, Date data_init, boolean pay_extra_hour, boolean bank_hours_compens,
            boolean manual_stitch, boolean pays_breakfast) {
        this.idRh = idRh;
        this.rh_identifier = rh_identifier;
        this.hour_limit = hour_limit;
        this.minutes_limit = minutes_limit;
        this.days_first_exp = days_first_exp;
        this.days_second_exp = days_second_exp;
        this.data_init = data_init;
        this.pay_extra_hour = pay_extra_hour;
        this.bank_hours_compens = bank_hours_compens;
        this.manual_stitch = manual_stitch;
        this.pays_breakfast = pays_breakfast;
    }

    public int getIdContract() {
        return idContract;
    }

    public String getCode_contract() {
        return code_contract;
    }

    public String getName_contract() {
        return name_contract;
    }

    public String getAcronymEmployee() {
        return acronymEmployee;
    }

    public boolean isResearch() {
        return research;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isUses_cpf() {
        return uses_cpf;
    }

    public int getFk_contract_contact() {
        return fk_contract_contact;
    }

    public int getFk_contract_info() {
        return fk_contract_info;
    }

    public int getFk_contract_dates() {
        return fk_contract_dates;
    }

    public int getFk_contract_values() {
        return fk_contract_values;
    }

    public int getFk_contract_discount() {
        return fk_contract_discount;
    }

    public int getFk_contract_rh() {
        return fk_contract_rh;
    }

    public int getIdInfos() {
        return idInfos;
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

    public int getIdValues() {
        return idValues;
    }

    public int getValue_identifier() {
        return value_identifier;
    }

    public String getAcronymValues() {
        return acronymValues;
    }

    public int getBdi_service() {
        return bdi_service;
    }

    public int getBdi_material() {
        return bdi_material;
    }

    public int getBdi_labor() {
        return bdi_labor;
    }

    public boolean isEntry_table() {
        return entry_table;
    }

    public boolean isSend_email() {
        return send_email;
    }

    public int getIdDates() {
        return idDates;
    }

    public int getDate_identifier() {
        return date_identifier;
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

    public int getIdDiscount() {
        return idDiscount;
    }

    public int getDisc_identifier() {
        return disc_identifier;
    }

    public int getDisc_service() {
        return disc_service;
    }

    public int getDisc_transport() {
        return disc_transport;
    }

    public int getDisc_tranp_employee() {
        return disc_tranp_employee;
    }

    public int getDisc_labor() {
        return disc_labor;
    }

    public int getDisc_material() {
        return disc_material;
    }

    public int getDisc_field() {
        return disc_field;
    }

    public int getIdRh() {
        return idRh;
    }

    public int getRh_identifier() {
        return rh_identifier;
    }

    public Date getHour_limit() {
        return hour_limit;
    }

    public Date getMinutes_limit() {
        return minutes_limit;
    }

    public int getDays_first_exp() {
        return days_first_exp;
    }

    public int getDays_second_exp() {
        return days_second_exp;
    }

    public Date getData_init() {
        return data_init;
    }

    public boolean isPay_extra_hour() {
        return pay_extra_hour;
    }

    public boolean isBank_hours_compens() {
        return bank_hours_compens;
    }

    public boolean isManual_stitch() {
        return manual_stitch;
    }

    public boolean isPays_breakfast() {
        return pays_breakfast;
    }


}
    