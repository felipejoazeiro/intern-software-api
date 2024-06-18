package br.com.tekno.features.contracts.domain.entity;

public class ContractValuesEntity {
    private int id;
        private String acronymValues;
    private int bdi_service;
    private int bdi_material;
    private int bdi_labor;
    private boolean entry_table;
    private boolean send_email;

    public ContractValuesEntity(int id, String acronymValues, int bdi_service, int bdi_material,
            int bdi_labor, boolean entry_table, boolean send_email) {
        this.id = id;
        this.acronymValues = acronymValues;
        this.bdi_service = bdi_service;
        this.bdi_material = bdi_material;
        this.bdi_labor = bdi_labor;
        this.entry_table = entry_table;
        this.send_email = send_email;
    }

    public int getId() {
        return id;
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

}
