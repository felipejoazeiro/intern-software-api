package br.com.tekno.features.sindicate.endpoint;

import java.sql.ResultSet;

import br.com.tekno.features.sindicate.domain.entity.CreateSindicateEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateAuthorizationEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateBreakfestEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateCbEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicatePercentsEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateValeEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateValuesEntity;
import br.com.tekno.features.sindicate.domain.errors.SindicateError;
import br.com.tekno.features.sindicate.domain.use_case.SindicateUsecase;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Route;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class SindicateController {
    
    @Route(path = "newSindicate", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet newSindicate(@Body CreateSindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().newSindicate(dados);
    }

    @Route(path = "changeSindc", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindcate(@Body SindicateEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindicate(dados);
    }

    @Route(path = "changeSindCB", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateCB(@Body SindicateCbEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSinCB(dados);
    }
    
    @Route(path = "changeSindVale", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateVale(@Body SindicateValeEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindVale(dados);
    }

    @Route(path = "changeSindBF", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateBF(@Body SindicateBreakfestEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindBF(dados);
    }

    @Route(path = "changeSindAuth", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateAuth(@Body SindicateAuthorizationEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindAuth(dados);
    }

    @Route(path = "changeSindValues", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicateValues(@Body SindicateValuesEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindValues(dados);
    }
    
    @Route(path = "changeSindPercents", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet changeSindicatePercents(@Body SindicatePercentsEntity dados) throws SindicateError{
        return new SindicateUsecase().changeSindPercents(dados);
    }
}
