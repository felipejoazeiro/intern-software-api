package br.com.tekno.features.contracts.datasource;

import java.sql.SQLException;
import java.sql.ResultSet;

import br.com.tekno.features.contracts.domain.entity.ContractEntity;
import br.com.tekno.features.contracts.domain.errors.ContractErrors;
import br.com.tekno.features.employees.domain.entity.EmployeeEntity;
import br.com.tekno.services.connection.PostgresConnection;

public class ContractsDatasource {

    public ResultSet newContract(ContractEntity dados) throws ContractErrors {
        try {
            int infoId = newContractInfos(dados);
            int contactId = newContractContacts(dados);
            int valuesId = newContractValues(dados);
            int datesId = newContractDates(dados);
            int discountId = newContractDiscount(dados);
            int rhId = newContractRh(dados);

            if (infoId > 0 && contactId > 0 && valuesId > 0 && datesId > 0 && discountId > 0 && rhId > 0) {
                var query = "INSERT INTO contract(code_contract, name_contract, acronym, research, active, uses_cpf, fk_contract_contact, fk_contract_info, fk_contract_dates, fk_contract_values, fk_contract_discount, fk_contract_rh) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";
                var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

                prepareStatement.setString(1, dados.getCode_contract());
                prepareStatement.setString(2, dados.getName_contract());
                prepareStatement.setString(3, dados.getAcronymEmployee());
                prepareStatement.setBoolean(4, dados.isResearch());
                prepareStatement.setBoolean(5, true);
                prepareStatement.setBoolean(6, dados.isUses_cpf());
                prepareStatement.setInt(7, contactId);
                prepareStatement.setInt(8, infoId);
                prepareStatement.setInt(9, datesId);
                prepareStatement.setInt(10, valuesId);
                prepareStatement.setInt(11, discountId);
                prepareStatement.setInt(12, rhId);

                return prepareStatement.executeQuery();
            }
            throw new ContractErrors("Falha ao procurar foreing key");
        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public int newContractInfos(ContractEntity dados) throws ContractErrors {
        try {
            var query = "INSERT INTO contract_infos(construction, cap, process, info_pmoc, max_employee) VALUES(?,?,?,?,?);";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getConstruction());
            prepareStatement.setString(2, dados.getCap());
            prepareStatement.setString(3, dados.getProcess());
            prepareStatement.setString(4, dados.getInfo_pmoc());
            prepareStatement.setInt(5, dados.getMax_employee());

            prepareStatement.executeUpdate();

            var querySelect = "SELECT id FROM contract_infos ci WHERE ci.contruction = ? AND ci.cap = ? AND ci.process = ? AND ci.info_pmoc = ? AND max_employee = ?;";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setString(1, dados.getConstruction());
            prepareStatementSelect.setString(2, dados.getCap());
            prepareStatementSelect.setString(3, dados.getProcess());
            prepareStatementSelect.setString(4, dados.getInfo_pmoc());
            prepareStatementSelect.setInt(5, dados.getMax_employee());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }

            return 0;

        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public int newContractContacts(ContractEntity dados) throws ContractErrors {
        try {
            var queryInsert = "INSERT INTO contract_contact(address, nro, complement, phone, state, city, cep, email, contact) VALUES (?,?,?,?,?,?,?,?,?);";
            var prepareStatementNewContact = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementNewContact.setString(1, dados.getAddress());
            prepareStatementNewContact.setInt(2, dados.getNro());
            prepareStatementNewContact.setString(3, dados.getComplement());
            prepareStatementNewContact.setInt(4, dados.getPhone());
            prepareStatementNewContact.setString(5, dados.getState());
            prepareStatementNewContact.setString(6, dados.getCity());
            prepareStatementNewContact.setInt(7, dados.getCep());
            prepareStatementNewContact.setString(8, dados.getEmail());
            prepareStatementNewContact.setString(9, dados.getContact());

            prepareStatementNewContact.executeQuery();

            var querySelect = "SELECT cc.id FROM contract_contact cc WHERE cc.address = ? AND cc.nro = ? AND cc.complement = ? AND cc.phone = ? AND cc.state = ? AND cc.city = ? AND cc.cep = ? AND cc.email = ? AND cc.contact = ?;";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setString(1, dados.getAddress());
            prepareStatementSelect.setInt(2, dados.getNro());
            prepareStatementSelect.setString(3, dados.getComplement());
            prepareStatementSelect.setInt(4, dados.getPhone());
            prepareStatementSelect.setString(5, dados.getState());
            prepareStatementSelect.setString(6, dados.getCity());
            prepareStatementSelect.setInt(7, dados.getCep());
            prepareStatementSelect.setString(8, dados.getEmail());
            prepareStatementSelect.setString(9, dados.getContact());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }

            return 0;
        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public int newContractValues(ContractEntity dados) throws ContractErrors {
        try {
            var queryInsert = "INSERT INTO contract_values(value_identifier ,acronym, bdi_service, bdi_material, bdi_labor, entry_table, send_email) VALUES (?,?,?,?,?,?);";
            var prepareStatementInsertValues = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsertValues.setInt(1, dados.getValue_identifier());
            prepareStatementInsertValues.setString(2, dados.getAcronymValues());
            prepareStatementInsertValues.setInt(3, dados.getBdi_service());
            prepareStatementInsertValues.setInt(4, dados.getBdi_material());
            prepareStatementInsertValues.setInt(5, dados.getBdi_labor());
            prepareStatementInsertValues.setBoolean(6, dados.isEntry_table());
            prepareStatementInsertValues.setBoolean(7, dados.isSend_email());

            prepareStatementInsertValues.executeUpdate();

            var querySelect = "SELECT cv.id FROM contract_values cv WHERE cv.value_identifier = ?;";
            var prepareStatementSelectValues = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelectValues.setInt(1, dados.getValue_identifier());

            var res = prepareStatementSelectValues.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }
            return 0;

        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public int newContractDates(ContractEntity dados) throws ContractErrors {
        try {
            var queryInsert = "INSERT INTO contract_dates(date_identifier ,date_initial, date_limit, date_guarantee, date_proposal, date_budget, date_tables) VALUES (?,?,?,?,?,?);";
            var prepareStatementInsertDates = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsertDates.setInt(1, dados.getDate_identifier());
            prepareStatementInsertDates.setDate(2, dados.getDate_initial());
            prepareStatementInsertDates.setDate(3, dados.getDate_limit());
            prepareStatementInsertDates.setDate(4, dados.getDate_guarantee());
            prepareStatementInsertDates.setDate(5, dados.getDate_proposal());
            prepareStatementInsertDates.setDate(6, dados.getDate_budget());
            prepareStatementInsertDates.setDate(7, dados.getDate_tables());

            prepareStatementInsertDates.executeUpdate();

            var querySelect = "SELECT cd.id FROM contract_dates cd WHERE cd.identifier;";
            var prepareStatementSelectDates = PostgresConnection.getConnection().prepareStatement(querySelect);
            prepareStatementSelectDates.setInt(1, dados.getDate_identifier());

            var res = prepareStatementSelectDates.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }
            return 0;
        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public int newContractDiscount(ContractEntity dados) throws ContractErrors {
        try {
            var queryInsert = "INSERT INTO contract_discount(disc_identifier, disc_service, disc_transport, disc_transp_employee, disc_labor, disc_material, disc_field) VALUES (?,?,?,?,?,?,?)";
            var prepareStatementInsertDiscount = PostgresConnection.getConnection().prepareStatement(queryInsert);

            prepareStatementInsertDiscount.setInt(1, dados.getDisc_identifier());
            prepareStatementInsertDiscount.setInt(2, dados.getDisc_service());
            prepareStatementInsertDiscount.setInt(3, dados.getDisc_transport());
            prepareStatementInsertDiscount.setInt(4, dados.getDisc_tranp_employee());
            prepareStatementInsertDiscount.setInt(5, dados.getDisc_labor());
            prepareStatementInsertDiscount.setInt(6, dados.getDisc_material());
            prepareStatementInsertDiscount.setInt(7, dados.getDisc_field());

            prepareStatementInsertDiscount.executeUpdate();

            var querySelect = "SELECT cd.id FROM contract_discount cd WHERE cd.identifier = ?";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);
            prepareStatementSelect.setInt(1, dados.getDisc_service());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }

            return 0;

        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public int newContractRh(ContractEntity dados) throws ContractErrors {
        try {
            var query = "";
            var prepareStatementInsert = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatementInsert.setInt(1, dados.getRh_identifier());
            prepareStatementInsert.setDate(2, dados.getHour_limit());
            prepareStatementInsert.setDate(3, dados.getMinutes_limit());
            prepareStatementInsert.setInt(4, dados.getDays_first_exp());
            prepareStatementInsert.setInt(5, dados.getDays_second_exp());
            prepareStatementInsert.setDate(6, dados.getData_init());
            prepareStatementInsert.setBoolean(7, dados.isPay_extra_hour());
            prepareStatementInsert.setBoolean(8, dados.isBank_hours_compens());
            prepareStatementInsert.setBoolean(9, dados.isManual_stitch());
            prepareStatementInsert.setBoolean(10, dados.isPays_breakfast());

            prepareStatementInsert.executeUpdate();

            var querySelect = "SELECT cr.id FROM contract_rh cr WHERE cr.rh_identifier = ?";
            var prepareStatementSelect = PostgresConnection.getConnection().prepareStatement(querySelect);

            prepareStatementSelect.setInt(1, dados.getRh_identifier());

            var res = prepareStatementSelect.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }

            return 0;
        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public ResultSet alterContract(ContractEntity dados) throws ContractErrors {
        try {
            var query = "UPDATE contract SET code_contract = ?, name_contract = ?, acronym = ?, research = ?, uses_cpf = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getCode_contract());
            prepareStatement.setString(2, dados.getName_contract());
            prepareStatement.setString(3, dados.getAcronymEmployee());
            prepareStatement.setBoolean(4, dados.isResearch());
            prepareStatement.setBoolean(5, dados.isUses_cpf());
            prepareStatement.setInt(6, dados.getIdContract());

            return prepareStatement.executeQuery();

        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public ResultSet alterRhContract(ContractEntity dados) throws ContractErrors {
        try {
            var query = "UPDATE contract_rh SET hour_limit = ?, minutes_limit = ?, days_first_exp = ?, days_second_exp = ?, data_init = ?, pay_extra_hour = ?, bank_hours_compens = ?, manual_stitch = ?, pays_breakfast = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setDate(1, dados.getHour_limit());
            prepareStatement.setDate(2, dados.getMinutes_limit());
            prepareStatement.setInt(3, dados.getDays_first_exp());
            prepareStatement.setInt(4, dados.getDays_second_exp());
            prepareStatement.setDate(5, dados.getData_init());
            prepareStatement.setBoolean(6, dados.isPay_extra_hour());
            prepareStatement.setBoolean(7, dados.isBank_hours_compens());
            prepareStatement.setBoolean(8, dados.isManual_stitch());
            prepareStatement.setBoolean(9, dados.isPays_breakfast());
            prepareStatement.setInt(10, dados.getIdRh());

            return prepareStatement.executeQuery();

        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public ResultSet alterContractDiscount(ContractEntity dados) throws ContractErrors{
        try {
            var query = "UPDATE contract_discount SET disc_service = ?, disc_transport = ? , disc_transp_employee = ?, disc_labor = ?, disc_material = ?, disc_field = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setInt(1, dados.getDisc_identifier());
            prepareStatement.setInt(2, dados.getDisc_service());
            prepareStatement.setInt(3, dados.getDisc_transport());
            prepareStatement.setInt(4, dados.getDisc_tranp_employee());
            prepareStatement.setInt(5, dados.getDisc_labor());
            prepareStatement.setInt(6, dados.getDisc_material());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public ResultSet alterContractDates(ContractEntity dados) throws ContractErrors{
        try {
            var query = "UPDATE contract_dates SET date_initial = ?, date_limit = ?, date_guarantee = ?, date_proposal = ?, date_budget = ?, date_tables = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setDate(1, dados.getDate_initial());
            prepareStatement.setDate(2, dados.getDate_limit());
            prepareStatement.setDate(3, dados.getDate_guarantee());
            prepareStatement.setDate(4, dados.getDate_proposal());
            prepareStatement.setDate(5, dados.getDate_budget());
            prepareStatement.setDate(6, dados.getDate_tables());

            return prepareStatement.executeQuery();

        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public ResultSet alterContractValues(ContractEntity dados) throws ContractErrors{
        try {
            var query = "UPDATE contract_values SET acronym = ?, bdi_service = ?, bdi_material = ?, bdi_labor = ?, entry_table = ?, send_email = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getAcronymValues());
            prepareStatement.setInt(2, dados.getBdi_service());
            prepareStatement.setInt(3, dados.getBdi_material());
            prepareStatement.setInt(4, dados.getBdi_labor());
            prepareStatement.setBoolean(5, dados.isEntry_table());
            prepareStatement.setBoolean(6, dados.isSend_email());
            prepareStatement.setInt(7, dados.getIdValues());

            return prepareStatement.executeQuery();
        } catch (Exception e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public ResultSet alterContractContacts(ContractEntity dados) throws ContractErrors{
        try {
            var query = "UPDATE contract_contact SET address = ?, nro = ?, complement = ?, phone = ?, state = ?, city = ?, cep = ?, email = ?, contact = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getAddress());
            prepareStatement.setInt(2, dados.getNro());
            prepareStatement.setString(3, dados.getComplement());
            prepareStatement.setInt(4, dados.getPhone());
            prepareStatement.setString(5, dados.getState());
            prepareStatement.setString(6, dados.getCity());
            prepareStatement.setInt(7, dados.getCep());
            prepareStatement.setString(8, dados.getEmail());
            prepareStatement.setString(9, dados.getContact());
            prepareStatement.setInt(10, dados.getIdContact());

            return prepareStatement.executeQuery();

        } catch (SQLException e) {
            throw new ContractErrors(e.getMessage());
        }
    }

    public ResultSet alterContractInfos(ContractEntity dados) throws ContractErrors{
        try {
            var query = "UPDATE contract_infos SET construction = ?, cap = ?, process = ?, info_pmoc = ?, max_employee = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getConstruction());
            prepareStatement.setString(2, dados.getCap());
            prepareStatement.setString(3, dados.getProcess());
            prepareStatement.setString(4, dados.getInfo_pmoc());
            prepareStatement.setInt(5, dados.getMax_employee());
            prepareStatement.setInt(6, dados.getIdInfos());

            return prepareStatement.executeQuery();

        } catch (Exception e) {
            throw new ContractErrors(e.getMessage());
        }
    }
}
