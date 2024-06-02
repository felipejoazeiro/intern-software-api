package br.com.tekno.features.employees.domain.use_case;

import java.sql.ResultSet;

import br.com.tekno.features.employees.datasource.EmployeeDatasource;
import br.com.tekno.features.employees.domain.entity.EmployeeEntity;
import br.com.tekno.features.employees.domain.errors.EmployeeErrorMissingData;
import br.com.tekno.features.employees.domain.errors.EmployeeErrors;

public class EmployeeUsecase {
    public ResultSet newEmployee(EmployeeEntity dados) throws EmployeeErrors{

        if(dados.getRegistration() == ""){
            throw new EmployeeErrorMissingData("Matrícula não enviada");
        }else if(dados.getName_employee() == ""){
            throw new EmployeeErrorMissingData("Nome de funcionário não enviado");
        }
        return new EmployeeDatasource().newEmployee(dados);
    }
}
