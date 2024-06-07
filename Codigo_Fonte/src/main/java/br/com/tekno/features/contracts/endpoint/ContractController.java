package br.com.tekno.features.contracts.endpoint;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.sql.ResultSet;
import br.com.tekno.features.contracts.domain.entity.ContractEntity;
import br.com.tekno.features.contracts.domain.errors.ContractErrors;
import br.com.tekno.features.contracts.domain.use_case.ContractUsecase;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Route;

public class ContractController {

    @Route(path = "newContract", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet newContract(@Body ContractEntity dados) throws ContractErrors {
        return new ContractUsecase().newEmployee(dados);
    }

}
