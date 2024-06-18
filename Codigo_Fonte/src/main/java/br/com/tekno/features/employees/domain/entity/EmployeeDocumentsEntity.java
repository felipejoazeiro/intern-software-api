package br.com.tekno.features.employees.domain.entity;

public class EmployeeDocumentsEntity {
    private int id;
    private String nro_title;
    private String electoral_zone;
    private String electoral_section;
    private int nro_rg;
    private String state_rg;
    private int nro_work_card;
    private String series_work_card;
    private int cpf;

    public EmployeeDocumentsEntity(int id, String nro_title, String electoral_zone, String electoral_section,
            int nro_rg, String state_rg, int nro_work_card, String series_work_card, int cpf) {
        this.id = id;
        this.nro_title = nro_title;
        this.electoral_zone = electoral_zone;
        this.electoral_section = electoral_section;
        this.nro_rg = nro_rg;
        this.state_rg = state_rg;
        this.nro_work_card = nro_work_card;
        this.series_work_card = series_work_card;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
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

}
