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

    @Route(path = "changeSindc", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindcate(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().newSindicate(dados);
    }

    @Route(path = "changeSindCB", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateCB(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSinCB(dados);
    }
    
    @Route(path = "changeSindVale", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateVale(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindVale(dados);
    }

    @Route(path = "changeSindBF", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateBF(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindBF(dados);
    }

    @Route(path = "changeSindAuth", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateAuth(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindAuth(dados);
    }

    @Route(path = "changeSindValues", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateValues(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindValues(dados);
    }
    
    @Route(path = "changeSindPercents", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicatePercents(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindPercents(dados);
    }
}
