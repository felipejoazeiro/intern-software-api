package br.com.tekno.features.sindicate.domain.use_case;

import java.sql.ResultSet;

import br.com.tekno.features.sindicate.datasource.SindicateDatasource;
import br.com.tekno.features.sindicate.domain.entity.SindicateEntity;
import br.com.tekno.features.sindicate.domain.errors.SindicateError;

public class SindicateUsecase {

    public ResultSet newSindicate(SindicateEntity dados) throws SindicateError {
        return new SindicateDatasource().newSindicate(dados);
    }

}
