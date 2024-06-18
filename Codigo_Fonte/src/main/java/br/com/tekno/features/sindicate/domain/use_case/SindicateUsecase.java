package br.com.tekno.features.sindicate.domain.use_case;

import java.sql.ResultSet;

import br.com.tekno.features.sindicate.datasource.SindicateDatasource;
import br.com.tekno.features.sindicate.domain.entity.CreateSindicateEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateAuthorizationEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateBreakfestEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateCbEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicatePercentsEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateValeEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateValuesEntity;
import br.com.tekno.features.sindicate.domain.errors.SindicateError;

public class SindicateUsecase {

    public ResultSet newSindicate(CreateSindicateEntity dados) throws SindicateError {
        return new SindicateDatasource().newSindicate(dados);
    }

    public ResultSet changeSindicate(SindicateEntity daods) throws SindicateError{
        return new SindicateDatasource().changeSind(daods);
    }

    public ResultSet changeSinCB(SindicateCbEntity dados) throws SindicateError {
        return new SindicateDatasource().changeSindCB(dados);
    }

    public ResultSet changeSindVale(SindicateValeEntity dados) throws SindicateError{
        return new SindicateDatasource().changeSindVale(dados);
    }

    public ResultSet changeSindBF(SindicateBreakfestEntity dados) throws SindicateError{
        return new SindicateDatasource().changeSindBF(dados);
    }

    public ResultSet changeSindAuth(SindicateAuthorizationEntity dados) throws SindicateError{
        return new SindicateDatasource().changeSindAuth(dados);
    }

    public ResultSet changeSindValues(SindicateValuesEntity dados) throws SindicateError{
        return new SindicateDatasource().changeSindValues(dados);
    }

    public ResultSet changeSindPercents(SindicatePercentsEntity daods) throws SindicateError{
        return new SindicateDatasource().changeSindPerc(daods);
    }
}
