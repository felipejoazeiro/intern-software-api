package br.com.tekno.features.contracts.domain.entity;

public class ContractDiscountEntity {
    private int idDiscount;
    private int disc_service;
    private int disc_transport;
    private int disc_tranp_employee;
    private int disc_labor;
    private int disc_material;
    private int disc_field;

    public ContractDiscountEntity(int idDiscount, int disc_service, int disc_transport, int disc_tranp_employee,
            int disc_labor, int disc_material, int disc_field) {
        this.idDiscount = idDiscount;
        this.disc_service = disc_service;
        this.disc_transport = disc_transport;
        this.disc_tranp_employee = disc_tranp_employee;
        this.disc_labor = disc_labor;
        this.disc_material = disc_material;
        this.disc_field = disc_field;
    }

    public int getIdDiscount() {
        return idDiscount;
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

}
