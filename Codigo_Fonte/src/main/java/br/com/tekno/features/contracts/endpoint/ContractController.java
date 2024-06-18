package br.com.tekno.features.contracts.endpoint;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.sql.ResultSet;

import br.com.tekno.features.contracts.domain.entity.ContractDatesEntity;
import br.com.tekno.features.contracts.domain.entity.ContractDiscountEntity;
import br.com.tekno.features.contracts.domain.entity.ContractEntity;
import br.com.tekno.features.contracts.domain.entity.ContractInfosEntity;
import br.com.tekno.features.contracts.domain.entity.ContractRhEntity;
import br.com.tekno.features.contracts.domain.entity.ContractValuesEntity;
import br.com.tekno.features.contracts.domain.entity.CreateContractEntity;
import br.com.tekno.features.contracts.domain.errors.ContractErrors;
import br.com.tekno.features.contracts.domain.use_case.ContractUsecase;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Route;

public class ContractController {

    @Route(path = "newContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet newContract(@Body CreateContractEntity dados) throws ContractErrors {
        return new ContractUsecase().newContract(dados);
    }

    @Route(path = "alterContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet alterContract(@Body ContractEntity dados) throws ContractErrors {
        return new ContractUsecase().alterContract(dados);
    }

    @Route(path = "alterRhContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet alterRhContract(@Body ContractRhEntity dados) throws ContractErrors {
        return new ContractUsecase().alterContractRh(dados);
    }

    @Route(path = "alterDiscountContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet alterDiscountContract(@Body ContractDiscountEntity dados) throws ContractErrors {
        return new ContractUsecase().alterContractDiscount(dados);
    }

    @Route(path = "alterDatesContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet alterDatesContract(@Body ContractDatesEntity dados) throws ContractErrors {
        return new ContractUsecase().alterContractDates(dados);
    }

    @Route(path = "alterValuesContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet alterValuesContract(@Body ContractValuesEntity dados) throws ContractErrors {
        return new ContractUsecase().alterContractValues(dados);
    }

    @Route(path = "alterContactContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet alterContactContract(@Body CreateContractEntity dados) throws ContractErrors {
        return new ContractUsecase().alterContractContact(dados);
    }

    @Route(path = "alterInfosContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet alterInfosContract(@Body ContractInfosEntity dados) throws ContractErrors {
        return new ContractUsecase().alterContractInfos(dados);
    }

    @Route(path = "deactiveContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet deactiveContract(@Body int id) throws ContractErrors {
        return new ContractUsecase().deactiveContract(id);
    }

    @Route(path = "activeContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet activeContract(@Body int id) throws ContractErrors {
        return new ContractUsecase().activeContract(id);
    }


}
