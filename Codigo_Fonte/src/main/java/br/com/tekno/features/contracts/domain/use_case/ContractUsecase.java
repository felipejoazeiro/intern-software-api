package br.com.tekno.features.contracts.domain.use_case;

import br.com.tekno.features.contracts.datasource.ContractsDatasource;
import br.com.tekno.features.contracts.domain.entity.ContractDatesEntity;
import br.com.tekno.features.contracts.domain.entity.ContractDiscountEntity;
import br.com.tekno.features.contracts.domain.entity.ContractEntity;
import br.com.tekno.features.contracts.domain.entity.ContractInfosEntity;
import br.com.tekno.features.contracts.domain.entity.ContractRhEntity;
import br.com.tekno.features.contracts.domain.entity.ContractValuesEntity;
import br.com.tekno.features.contracts.domain.entity.CreateContractEntity;
import br.com.tekno.features.contracts.domain.errors.ContractErrors;

import java.sql.ResultSet;

public class ContractUsecase {
    
    public ResultSet newContract(CreateContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().newContract(dados);
    }

    public ResultSet alterContract(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContract(dados);
    }

    public ResultSet alterContractRh(ContractRhEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterRhContract(dados);
    }

    public ResultSet alterContractDiscount(ContractDiscountEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractDiscount(dados);
    }

    public ResultSet alterContractDates(ContractDatesEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractDates(dados);
    }

    public ResultSet alterContractValues(ContractValuesEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractValues(dados);
    }

    public ResultSet alterContractContact(CreateContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractContacts(dados);
    }

    public ResultSet alterContractInfos(ContractInfosEntity dados) throws ContractErrors{
        return new ContractsDatasource().alterContractInfos(dados);
    }

    public ResultSet deactiveContract(int id) throws ContractErrors{
        return new ContractsDatasource().deactiveContract(id);
    }

    public ResultSet activeContract(int id) throws ContractErrors{
        return new ContractsDatasource().activeContract(id);
    }

}
