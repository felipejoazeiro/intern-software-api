package br.com.tekno.features.sindicate.endpoint;

import br.com.tekno.features.employees.domain.errors.EmployeeErrors;
import br.com.tekno.features.employees.domain.use_case.EmployeeUsecase;
import br.com.tekno.features.sindicate.domain.errors.SindicateError;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Route;
import jakarta.resource.cci.ResultSet;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class SindicateController {
    
    @Route(path = "newSindicate", methods = Route.HttpMethod.POST)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultSet newSindicate(@Body int id) throws SindicateError{
        throw new SindicateError("algo");
    }
}
