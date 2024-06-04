package br.com.tekno.features.employees.endpoint;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.sql.ResultSet;

import br.com.tekno.features.employees.domain.entity.EmployeeEntity;
import br.com.tekno.features.employees.domain.errors.EmployeeErrors;
import br.com.tekno.features.employees.domain.use_case.EmployeeUsecase;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Route;

public class EmployeeController {
    
    @Route(path = "newEmployee", methods=Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet newEmployee(@Body EmployeeEntity dados) throws EmployeeErrors{
        return new EmployeeUsecase().newEmployee(dados);
    }

    @Route(path = "editEmployee", methods=Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet editEmployee(@Body EmployeeEntity dados) throws EmployeeErrors{
        throw new EmployeeErrors("Algo");
    }

    @Route(path = "editContact", methods=Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet editContact(@Body EmployeeEntity dados) throws EmployeeErrors{
        throw new EmployeeErrors("Algo");
    }

    @Route(path = "editDocuments", methods=Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet editDocuments(@Body EmployeeEntity dados) throws EmployeeErrors{
        throw new EmployeeErrors("Algo");
    }

    @Route(path = "editTicket", methods=Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet editTicket(@Body EmployeeEntity dados) throws EmployeeErrors{
        throw new EmployeeErrors("Algo");

    }

    @Route(path = "editAccess", methods=Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet editAccess(@Body EmployeeEntity dados) throws EmployeeErrors{
        throw new EmployeeErrors("Algo");
    }

}
