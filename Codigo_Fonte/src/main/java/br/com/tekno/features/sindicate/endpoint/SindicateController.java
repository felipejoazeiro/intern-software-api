package br.com.tekno.features.sindicate.endpoint;

import java.sql.ResultSet;

import br.com.tekno.features.sindicate.domain.entity.SindicateEntity;
import br.com.tekno.features.sindicate.domain.errors.SindicateError;
import br.com.tekno.features.sindicate.domain.use_case.SindicateUsecase;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Route;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class SindicateController {
    
    @Route(path = "newSindicate", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet newSindicate(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().newSindicate(dados);
    }
}
