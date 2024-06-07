package br.com.tekno.features.contracts.domain.use_case;

import br.com.tekno.features.contracts.datasource.ContractsDatasource;
import br.com.tekno.features.contracts.domain.entity.ContractEntity;
import br.com.tekno.features.contracts.domain.errors.ContractErrors;

import java.sql.ResultSet;

public class ContractUsecase {
    
    public ResultSet newContract(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().newContract(dados);
    }

    public ResultSet alterContract(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContract(dados);
    }

    public ResultSet alterContractRh(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterRhContract(dados);
    }

    public ResultSet alterContractDiscount(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractDiscount(dados);
    }

    public ResultSet alterContractDates(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractDates(dados);
    }

    public ResultSet alterContractValues(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractValues(dados);
    }

    public ResultSet alterContractContact(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractContacts(dados);
    }

    public ResultSet alterContractInfos(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractInfos(dados);
    }

}
