package br.com.tekno.features.contracts.domain.entity;

public class ContractEntity {
    private int id;
    private String code_contract;
    private String name_contract;
    private String acronymEmployee;
    private boolean research;
    private boolean active;
    private boolean uses_cpf;

    public ContractEntity(int id, String code_contract, String name_contract, String acronymEmployee, boolean research,
            boolean active, boolean uses_cpf) {
        this.id = id;
        this.code_contract = code_contract;
        this.name_contract = name_contract;
        this.acronymEmployee = acronymEmployee;
        this.research = research;
        this.active = active;
        this.uses_cpf = uses_cpf;
    }

    public int getId() {
        return id;
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

}
