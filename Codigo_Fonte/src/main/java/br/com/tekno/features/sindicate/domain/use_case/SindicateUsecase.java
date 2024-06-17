package br.com.tekno.features.sindicate.domain.use_case;

import java.sql.ResultSet;

import br.com.tekno.features.sindicate.datasource.SindicateDatasource;
import br.com.tekno.features.sindicate.domain.entity.SindicateEntity;
import br.com.tekno.features.sindicate.domain.errors.SindicateError;

public class SindicateUsecase {

    public ResultSet newSindicate(SindicateEntity dados) throws SindicateError {
        return new SindicateDatasource().newSindicate(dados);
    }

    public ResultSet changeSindicate(SindicateEntity daods) throws SindicateError{
        return new SindicateDatasource().changeSind(daods);
    }

    public ResultSet changeSinCB(SindicateEntity dados) throws SindicateError {
        return new SindicateDatasource().changeSindCB(dados);
    }

    public ResultSet changeSindVale(SindicateEntity dados) throws SindicateError{
        return new SindicateDatasource().changeSindVale(dados);
    }

    public ResultSet changeSindBF(SindicateEntity dados) throws SindicateError{
        return new SindicateDatasource().changeSindBF(dados);
    }

    public ResultSet changeSindAuth(SindicateEntity dados) throws SindicateError{
        return new SindicateDatasource().changeSindAuth(dados);
    }

    public ResultSet changeSindValues(SindicateEntity dados) throws SindicateError{
        return new SindicateDatasource().changeSindValues(dados);
    }

    public ResultSet changeSindPercents(SindicateEntity daods) throws SindicateError{
        return new SindicateDatasource().changeSindPerc(daods);
    }
}
