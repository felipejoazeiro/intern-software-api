package br.com.tekno.features.employees.domain.use_case;

import java.sql.ResultSet;

import br.com.tekno.features.employees.datasource.EmployeeDatasource;
import br.com.tekno.features.employees.domain.entity.EmployeeContactEntity;
import br.com.tekno.features.employees.domain.entity.EmployeeDocumentsEntity;
import br.com.tekno.features.employees.domain.entity.EmployeeEntity;
import br.com.tekno.features.employees.domain.entity.CreateEmployeeEntity;
import br.com.tekno.features.employees.domain.entity.EmployeeTicketEntity;
import br.com.tekno.features.employees.domain.errors.EmployeeErrorMissingData;
import br.com.tekno.features.employees.domain.errors.EmployeeErrors;

public class EmployeeUsecase {
    public boolean newEmployee(CreateEmployeeEntity dados) throws EmployeeErrors{

        if(dados.getRegistration() == ""){
            throw new EmployeeErrorMissingData("Matrícula não enviada");
        }else if(dados.getName_employee() == ""){
            throw new EmployeeErrorMissingData("Nome de funcionário não enviado");
        }
        return new EmployeeDatasource().newEmployee(dados);
    }

    public ResultSet editEmployee(EmployeeEntity dados) throws EmployeeErrors{
        if(dados.getId_employee() <= 0 || dados.getRegistration() == "" ){
            throw new EmployeeErrorMissingData("Dados faltantes");
        }
        return new EmployeeDatasource().editEmployee(dados);
    }

    public ResultSet editDocuments(EmployeeDocumentsEntity dados) throws EmployeeErrors {
        if(dados.getId() <= 0 || dados.getNro_title() == ""){
            throw new EmployeeErrorMissingData("Dados faltantes");
        }
        
        return new EmployeeDatasource().editDocuments(dados);
    }

    public ResultSet editContacts(EmployeeContactEntity dados) throws EmployeeErrors{
        if(dados.getId() <= 0){
            throw new EmployeeErrorMissingData("Dados faltantes.");       
        }

        return new EmployeeDatasource().editContacts(dados);
    }

    public ResultSet editTicket(EmployeeTicketEntity dados) throws EmployeeErrors{
        if(dados.getId() <= 0){
            throw new EmployeeErrorMissingData("Dados faltantes");
        }
        return new EmployeeDatasource().editTicket(dados);
    }

    public ResultSet editLogin(CreateEmployeeEntity dados) throws EmployeeErrors{
        if(dados.getId_access() <= 0 || dados.getLogin() == "" || dados.getPassword() == ""){
            throw new EmployeeErrorMissingData("Dados faltantes");
        }
        return new EmployeeDatasource().editAccess(dados);
    }

    public ResultSet deactiveLogin(int id) throws EmployeeErrors{
        if(id <= 0){
            throw new EmployeeErrorMissingData("Dados faltantes");
        }
        return new EmployeeDatasource().deactiveEmployee(id);
    }

    public ResultSet activeLogin(int id) throws EmployeeErrors {
        if(id <= 0){
            throw new EmployeeErrorMissingData("Dados faltantes");
        }
        return new EmployeeDatasource().activeEmployee(id);
    }
}
