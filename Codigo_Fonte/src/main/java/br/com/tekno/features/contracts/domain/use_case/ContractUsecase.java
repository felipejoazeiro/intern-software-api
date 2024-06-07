package br.com.tekno.features.contracts.domain.use_case;

import br.com.tekno.features.contracts.datasource.ContractsDatasource;
import br.com.tekno.features.contracts.domain.entity.ContractEntity;
import br.com.tekno.features.contracts.domain.errors.ContractErrors;

import java.sql.ResultSet;

public class ContractUsecase {
    
    public ResultSet newEmployee(ContractEntity dados) throws ContractErrors{
        return new ContractsDatasource().newContract(dados);
    }

}
