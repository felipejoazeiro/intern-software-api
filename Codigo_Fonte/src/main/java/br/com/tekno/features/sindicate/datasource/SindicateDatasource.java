package br.com.tekno.features.sindicate.datasource;

import java.sql.SQLException;

import br.com.tekno.features.sindicate.domain.entity.CreateSindicateEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateAuthorizationEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateBreakfestEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateCbEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicatePercentsEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateValeEntity;
import br.com.tekno.features.sindicate.domain.entity.SindicateValuesEntity;
import br.com.tekno.features.sindicate.domain.errors.SindicateError;
import java.sql.ResultSet;
import br.com.tekno.services.connection.PostgresConnection;

public class SindicateDatasource {

    public ResultSet newSindicate(CreateSindicateEntity dados) throws SindicateError {
        try {
            int cbId = newSindicateCB(dados);
            int valeId = newSindicateVale(dados);
            int bfId = newSindicateBF(dados);
            int authId = newSindicateAuth(dados);
            int valuesId = newSindicateValues(dados);
            int percentsId = newSindicatePercents(dados);

            if (cbId > 0 && valeId > 0 && bfId > 0 && authId > 0 && valuesId > 0 && percentsId > 0) {
                var query = "INTERT INTO sindicate(nro_register_cct, date_start_cct, date_finish_cct, fk_sindicate_percents, fk_sindicate_values, fk_sindicate_authorization, fk_sindicate_breakfest, fk_sindicate_cesta_basica, fk_sindicate_value) VALUES (?,?,?,?,?,?,?,?,?);";
                var prepareStatment = PostgresConnection.getConnection().prepareStatement(query);

                prepareStatment.setString(1, dados.getNro_register_cct());
                prepareStatment.setDate(2, dados.getDate_start_cct());
                prepareStatment.setDate(3, dados.getDate_finish_cct());
                prepareStatment.setInt(4, percentsId);
                prepareStatment.setInt(5, valuesId);
                prepareStatment.setInt(6, authId);
                prepareStatment.setInt(7, bfId);
                prepareStatment.setInt(8, cbId);
                prepareStatment.setInt(9, valeId);

                return prepareStatment.executeQuery();
            }
            throw new SindicateError("Erro na configuração");

        } catch (SQLException e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public int newSindicateCB(CreateSindicateEntity dados) throws SindicateError {
        try {
            var queryInsert = "INSERT INTO sindicate_cesta_basica(identificationCB, discount_basic, value_basic, limit_discount_basic, falta_discount_basic, afastamento_disc_porp, ferias_disc, get_basic_with_one_day, magnetic_card, misses_day_prop_disc, afast_prop_disc, atestado_disc, atestado_prop_disc, ferias_prop_disc, basic_nature) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            var prepareStatementInsert = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsert.setInt(1, dados.getDiscount_basic());
            prepareStatementInsert.setInt(2, dados.getValue_basic());
            prepareStatementInsert.setInt(3, dados.getLimit_disc_basic());
            prepareStatementInsert.setBoolean(4, dados.isFalta_disc_basic());
            prepareStatementInsert.setBoolean(5, dados.isAfast_disc_porp());
            prepareStatementInsert.setBoolean(6, dados.isFerias_disc());
            prepareStatementInsert.setBoolean(7, dados.isGet_basic_with_one_day());
            prepareStatementInsert.setBoolean(8, dados.isMagnetic_card());
            prepareStatementInsert.setBoolean(9, dados.isMisses_day_prop_disc());
            prepareStatementInsert.setBoolean(10, dados.isAfast_prop_disc());
            prepareStatementInsert.setBoolean(11, dados.isAtestado_disc());
            prepareStatementInsert.setBoolean(12, dados.isAtestado_prop_disc());
            prepareStatementInsert.setBoolean(13, dados.isFerias_prop_disc());
            prepareStatementInsert.setBoolean(14, dados.isBasic_nature());

            var querySelect = "SELECT id from sindicate_cesta_basica scb where scb.identificationCB = ?; ";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setInt(1, dados.getIdentificationCB());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }
            return 0;
        } catch (Exception e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public int newSindicateVale(CreateSindicateEntity dados) throws SindicateError {
        try {
            var queryInsert = "INSERT INTO sindicate_vale(identificationVale, falta_disc_va_vr, falta_disc_vr, atestado_disc_va_vr, atestado_disc_vt, vacation_disc_va_vr, vacation_disc_vt, afast_disc_vt_inss, afast_disc_va_vr_inss, vt_disc_min_salary, value_alim_day, limit_desc_vale_folha, limit_desc_va_vr_perc, limit_desc_va_vr_folha, desc_vt_perc) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            var prepareStatementInsert = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsert.setInt(1, dados.getIdentificationVale());
            prepareStatementInsert.setBoolean(2, dados.isFalta_disc_va_vr());
            prepareStatementInsert.setBoolean(3, dados.isFalta_disc_vr());
            prepareStatementInsert.setBoolean(4, dados.isAtestado_disc_va_vr());
            prepareStatementInsert.setBoolean(5, dados.isAtestado_disc_vt());
            prepareStatementInsert.setBoolean(6, dados.isVacation_disc_va_vr());
            prepareStatementInsert.setBoolean(7, dados.isVacation_disc_vt());
            prepareStatementInsert.setBoolean(8, dados.isAfast_disc_vt_inss());
            prepareStatementInsert.setBoolean(9, dados.isAfast_disc_va_vr_inss());
            prepareStatementInsert.setBoolean(10, dados.isVt_disc_min_salary());
            prepareStatementInsert.setInt(11, dados.getValue_alim_day());
            prepareStatementInsert.setInt(12, dados.getLimit_desc_vale_folha());
            prepareStatementInsert.setInt(13, dados.getLimit_desc_va_vr_perc());
            prepareStatementInsert.setInt(14, dados.getLimit_desc_va_vr_folha());
            prepareStatementInsert.setInt(15, dados.getDesc_vt_perc());

            prepareStatementInsert.executeUpdate();

            var querySelect = "SELECT id from sindicate_vale sv WHERE sv.identificationVale = ?;";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setInt(1, dados.getIdentificationVale());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }
            return 0;
        } catch (Exception e) {
            throw new SindicateError(e.getMessage());
        }

    }

    public int newSindicateBF(CreateSindicateEntity dados) throws SindicateError {
        try {
            var queryInsert = "INSERT INTO sindicate_breakfest(identificationBreakfest, atestado_disc, atestado_disc_prop, falta_disc, falta_disc_prop, vacation_disc, vacation_disc_prop, afast_disc, afast_disc_prop, breakfest_nature, limit_desc_percent, value_day, value_month, limit_desc) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            var prepareStatementInsert = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsert.setInt(1, dados.getIdentificationBreakfest());
            prepareStatementInsert.setBoolean(2, dados.isAtest_disc());
            prepareStatementInsert.setBoolean(3, dados.isAtest_disc());
            prepareStatementInsert.setBoolean(4, dados.isAtest_disc_prop());
            prepareStatementInsert.setBoolean(5, dados.isFalta_disc());
            prepareStatementInsert.setBoolean(6, dados.isFalta_disc_prop());
            prepareStatementInsert.setBoolean(7, dados.isVacation_disc());
            prepareStatementInsert.setBoolean(8, dados.isVacation_disc_prop());
            prepareStatementInsert.setBoolean(9, dados.isAfast_disc());
            prepareStatementInsert.setBoolean(10, dados.isAfast_disc_prop());
            prepareStatementInsert.setInt(11, dados.getLimit_desc_percent());
            prepareStatementInsert.setInt(12, dados.getValue_day());
            prepareStatementInsert.setInt(13, dados.getValue_month());
            prepareStatementInsert.setInt(14, dados.getLimit_desc());

            var querySelect = "SELECT id FROM sindicate_breakfest sb WHERE sb.identificationBreakfest = ?;";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setInt(1, dados.getIdentificationBreakfest());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }

            return 0;
        } catch (Exception e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public int newSindicateAuth(CreateSindicateEntity dados) throws SindicateError {
        try {
            var queryInsert = "INSERT INTO sindicate_authorizations(identificationAuth, normal_hour, salary_advance, bank_hours, shift_work, sind_pays_beneith_emplo, mobile_point_applies_approval) VALUES (?,?,?,?,?,?,?);";
            var prepareStatementInsert = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsert.setInt(1, dados.getIdentificationAuth());
            prepareStatementInsert.setBoolean(2, dados.isNormal_hour());
            prepareStatementInsert.setBoolean(3, dados.isSalary_advance());
            prepareStatementInsert.setBoolean(4, dados.isBank_hours());
            prepareStatementInsert.setBoolean(5, dados.isShift_work());
            prepareStatementInsert.setBoolean(6, dados.isSind_pays_beneith_emplo());
            prepareStatementInsert.setBoolean(7, dados.isMobile_point_app_approval());

            prepareStatementInsert.executeUpdate();

            var querySelect = "SELECT id FROM sindicate_authorizarion sa WHERE sa.identificationAuth = ?;";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setInt(1, dados.getIdentificationAuth());

            var res = prepareStatementSelect.executeQuery();
            while (res.next()) {
                return res.getInt("id");
            }
            return 0;
        } catch (Exception e) {
            throw new SindicateError(e.getMessage());
        }

    }

    public int newSindicateValues(CreateSindicateEntity dados) throws SindicateError {
        try {
            var queryInsert = "INSERT INTO sindicate_values(identificationValues, attendance, base_salary, health_insurance, christmas_bonus, associative_contribution, childcare_assistance, education_aid, unhealthness, dangerousness, nightime_supplement) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
            var prepareStatementInsert = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsert.setInt(1, dados.getIdentificationValues());
            prepareStatementInsert.setInt(2, dados.getAttendance());
            prepareStatementInsert.setInt(3, dados.getBase_salary());
            prepareStatementInsert.setInt(4, dados.getHealth_insurance());
            prepareStatementInsert.setInt(5, dados.getChristmas_bonus());
            prepareStatementInsert.setInt(6, dados.getAssociative_contribution());
            prepareStatementInsert.setInt(7, dados.getChildcare_assistance());
            prepareStatementInsert.setInt(8, dados.getEducation_aid());
            prepareStatementInsert.setInt(9, dados.getUnhealthness());
            prepareStatementInsert.setInt(10, dados.getDangerousness());
            prepareStatementInsert.setInt(11, dados.getNightime_supplement());

            prepareStatementInsert.executeUpdate();

            var querySelect = "SELECT id FROM sindicate_values sv WHERE sv.identifactionValues = ?;";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setInt(1, dados.getIdentificationValues());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }
            return 0;
        } catch (Exception e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public int newSindicatePercents(CreateSindicateEntity dados) throws SindicateError {
        try {
            var queryInsert = "INSERT INTO sindicate_percents(identificationPercents, extra_hour_week, extra_hour_saturday, extra_hour_sunday_holidays, sindicate_contribuition, seconci, salary_advance, incentive_qualify, complem_retirement, night_time) VALUES (?,?,?,?,?,?,?,?,?,?);";
            var prepareStatementInsert = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsert.setInt(1, dados.getIdentificationPercents());
            prepareStatementInsert.setInt(2, dados.getExtra_hour_week());
            prepareStatementInsert.setInt(3, dados.getExtra_hour_saturday());
            prepareStatementInsert.setInt(4, dados.getExtra_hour_sunday_holidays());
            prepareStatementInsert.setInt(5, dados.getSindicate_contr());
            prepareStatementInsert.setInt(6, dados.getSeconci());
            prepareStatementInsert.setInt(7, dados.getSalary_advance_percents());
            prepareStatementInsert.setInt(8, dados.getIncentive_qualify());
            prepareStatementInsert.setInt(9, dados.getComplem_retirement());
            prepareStatementInsert.setInt(10, dados.getNight_time());

            prepareStatementInsert.executeUpdate();

            var querySelect = "SELECT id FROM sindicate_percents sp WHERE sp.identificationPercents = ?;";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setInt(1, dados.getIdentificationPercents());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }
            return 0;
        } catch (Exception e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public ResultSet changeSind(SindicateEntity dados) throws SindicateError {
        try {
            var query = "UPDATE sindicate SET nro_register_cct = ?, date_start_cct = ?, date_finish_cct = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getNro_register_cct());
            prepareStatement.setDate(2, dados.getDate_start_cct());
            prepareStatement.setDate(3, dados.getDate_finish_cct());
            prepareStatement.setInt(4, dados.getId());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public ResultSet changeSindCB(SindicateCbEntity dados) throws SindicateError {
        try {
            var query = "UPDATE sindicate_cesta_basica SET discount_basic = ?, value_basic = ?, limit_discount_basic = ?, falta_discount_basic = ?, afastamento_disc_porp = ?, ferias_disc = ?, get_basic_with_one_day = ?, magnetic_card = ?, misses_day_prop_disc = ?, afast_prop_disc = ?, atestado_disc = ?, atestado_prop_disc = ?, ferias_prop_disc = ?, basic_nature = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setInt(1, dados.getDiscount_basic());
            prepareStatement.setInt(2, dados.getValue_basic());
            prepareStatement.setInt(3, dados.getLimit_disc_basic());
            prepareStatement.setBoolean(4, dados.isFalta_disc_basic());
            prepareStatement.setBoolean(5, dados.isAfast_disc_porp());
            prepareStatement.setBoolean(6, dados.isFerias_disc());
            prepareStatement.setBoolean(7, dados.isGet_basic_with_one_day());
            prepareStatement.setBoolean(8, dados.isMagnetic_card());
            prepareStatement.setBoolean(9, dados.isMisses_day_prop_disc());
            prepareStatement.setBoolean(10, dados.isAfast_prop_disc());
            prepareStatement.setBoolean(11, dados.isAtestado_disc());
            prepareStatement.setBoolean(12, dados.isAtestado_prop_disc());
            prepareStatement.setBoolean(13, dados.isFerias_prop_disc());
            prepareStatement.setBoolean(14, dados.isBasic_nature());
            prepareStatement.setInt(15, dados.getId());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public ResultSet changeSindVale(SindicateValeEntity dados) throws SindicateError {
        try {
            var query = "UPDATE sindicate_vale SET falta_disc_va_vr = ?, falta_disc_vr = ?, atestado_disc_va_vr = ?, atestado_disc_vt = ?, vacation_disc_va_vr = ?, vacation_disc_vt = ?, afast_disc_vt_inss = ?, afast_disc_va_vr_inss = ?, vt_disc_min_salary = ?, value_alim_day = ?, limit_desc_vale_folha = ?, limit_desc_va_vr_perc = ?, limit_desc_va_vr_folha = ?, desc_vt_perc = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setBoolean(1, dados.isFalta_disc_va_vr());
            prepareStatement.setBoolean(2, dados.isFalta_disc_vr());
            prepareStatement.setBoolean(3, dados.isAtestado_disc_va_vr());
            prepareStatement.setBoolean(4, dados.isAtestado_disc_vt());
            prepareStatement.setBoolean(5, dados.isVacation_disc_va_vr());
            prepareStatement.setBoolean(6, dados.isVacation_disc_vt());
            prepareStatement.setBoolean(7, dados.isAfast_disc_vt_inss());
            prepareStatement.setBoolean(8, dados.isAfast_disc_va_vr_inss());
            prepareStatement.setBoolean(9, dados.isVt_disc_min_salary());
            prepareStatement.setInt(10, dados.getValue_alim_day());
            prepareStatement.setInt(11, dados.getLimit_desc_vale_folha());
            prepareStatement.setInt(12, dados.getLimit_desc_va_vr_perc());
            prepareStatement.setInt(13, dados.getLimit_desc_va_vr_folha());
            prepareStatement.setInt(14, dados.getDesc_vt_perc());
            prepareStatement.setInt(15, dados.getId());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public ResultSet changeSindBF(SindicateBreakfestEntity dados) throws SindicateError {
        try {
            var query = "UPDATE sindicate_breakfest SET atestado_disc = ?, atestado_disc_prop = ?, falta_disc = ?, falta_disc_prop = ?, vacation_disc = ?, vacation_disc_prop = ?, afast_disc = ?, afast_disc_prop = ?, breakfest_nature = ?, limit_desc_percent = ?, value_day = ?, value_month = ?, limit_desc = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setBoolean(1, dados.isAtest_disc());
            prepareStatement.setBoolean(2, dados.isAtest_disc());
            prepareStatement.setBoolean(3, dados.isAtest_disc_prop());
            prepareStatement.setBoolean(4, dados.isFalta_disc());
            prepareStatement.setBoolean(5, dados.isFalta_disc_prop());
            prepareStatement.setBoolean(6, dados.isVacation_disc());
            prepareStatement.setBoolean(7, dados.isVacation_disc_prop());
            prepareStatement.setBoolean(8, dados.isAfast_disc());
            prepareStatement.setBoolean(9, dados.isAfast_disc_prop());
            prepareStatement.setInt(10, dados.getLimit_desc_percent());
            prepareStatement.setInt(11, dados.getValue_day());
            prepareStatement.setInt(12, dados.getValue_month());
            prepareStatement.setInt(13, dados.getLimit_desc());
            prepareStatement.setInt(14, dados.getId());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public ResultSet changeSindAuth(SindicateAuthorizationEntity dados) throws SindicateError {
        try {
            var query = "UPDATE sindicate_authorizations SET normal_hour = ?, salary_advance = ?, bank_hours = ?, shift_work = ?, sind_pays_beneith_emplo = ?, mobile_point_applies_approval = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setBoolean(1, dados.isNormal_hour());
            prepareStatement.setBoolean(2, dados.isSalary_advance());
            prepareStatement.setBoolean(3, dados.isBank_hours());
            prepareStatement.setBoolean(4, dados.isShift_work());
            prepareStatement.setBoolean(5, dados.isSind_pays_beneith_emplo());
            prepareStatement.setBoolean(6, dados.isMobile_point_app_approval());
            prepareStatement.setInt(7, dados.getId());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public ResultSet changeSindValues(SindicateValuesEntity dados) throws SindicateError {
        try {
            var query = "UPDATE sindicate_values SET attendance = ?, base_salary = ?, health_insurance = ?, christmas_bonus = ?, associative_contribution = ?, childcare_assistance = ?, education_aid = ?, unhealthness = ?, dangerousness = ?, nightime_supplement = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setInt(1, dados.getAttendance());
            prepareStatement.setInt(2, dados.getBase_salary());
            prepareStatement.setInt(3, dados.getHealth_insurance());
            prepareStatement.setInt(4, dados.getChristmas_bonus());
            prepareStatement.setInt(5, dados.getAssociative_contribution());
            prepareStatement.setInt(6, dados.getChildcare_assistance());
            prepareStatement.setInt(7, dados.getEducation_aid());
            prepareStatement.setInt(8, dados.getUnhealthness());
            prepareStatement.setInt(9, dados.getDangerousness());
            prepareStatement.setInt(10, dados.getNightime_supplement());
            prepareStatement.setInt(11, dados.getId());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new SindicateError(e.getMessage());
        }
    }

    public ResultSet changeSindPerc(SindicatePercentsEntity dados) throws SindicateError {
        try {
            var query = "UPDATE sindicate_percents SET extra_hour_week = ?, extra_hour_saturday = ?, extra_hour_sunday_holidays = ?, sindicate_contribuition = ?, seconci = ?, salary_advance = ?, incentive_qualify = ?, complem_retirement = ?, night_time = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setInt(1, dados.getExtra_hour_week());
            prepareStatement.setInt(2, dados.getExtra_hour_saturday());
            prepareStatement.setInt(3, dados.getExtra_hour_sunday_holidays());
            prepareStatement.setInt(4, dados.getSindicate_contr());
            prepareStatement.setInt(5, dados.getSeconci());
            prepareStatement.setInt(6, dados.getSalary_advance_percents());
            prepareStatement.setInt(7, dados.getIncentive_qualify());
            prepareStatement.setInt(8, dados.getComplem_retirement());
            prepareStatement.setInt(9, dados.getNight_time());
            prepareStatement.setInt(10, dados.getId());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new SindicateError(e.getMessage());
        }
    }

}
