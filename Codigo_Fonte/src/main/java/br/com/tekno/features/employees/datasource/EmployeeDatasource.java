package br.com.tekno.features.employees.datasource;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.tekno.features.employees.domain.entity.EmployeeEntity;
import br.com.tekno.features.employees.domain.errors.EmployeeErrors;
import br.com.tekno.services.connection.PostgresConnection;

public class EmployeeDatasource {
    public Boolean newEmployee(EmployeeEntity dados) throws EmployeeErrors {

        try {
            int contactId = newEmployeeContact(dados);
            int documentId = newEmployeeDocuments(dados);
            int ticketId = newEmployeeTicket(dados);
            int accessId = newEmployeeAccess(dados);

            if (contactId != 0 && documentId != 0 && ticketId != 0 && accessId != 0) {
                var query = "INSERT INTO employee(registration, name_employee, email, entry_data, contract_data, photo, fk_documents, fk_employee_contact, fk_ticket, fk_access, fk_cargo, active_employee) values(?,?,?,?,?,?,?,?,?,?,?, true);";
                var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);
                prepareStatement.setString(1, dados.getRegistration());
                prepareStatement.setString(2, dados.getName_employee());
                prepareStatement.setString(3, dados.getEmail());
                prepareStatement.setDate(4, dados.getEntry_date());
                prepareStatement.setDate(5, dados.getContract_date());
                prepareStatement.setString(6, dados.getPhoto());
                prepareStatement.setInt(7, documentId);
                prepareStatement.setInt(8, contactId);
                prepareStatement.setInt(9, ticketId);
                prepareStatement.setInt(10, accessId);
                prepareStatement.setInt(11, dados.getFk_cargo());

                prepareStatement.executeQuery();

                return true;
            }
            throw new EmployeeErrors("Erro ao inserir algum valor");
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }

    }

    public int newEmployeeContact(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var queryInsertContact = "INSERT INTO employee_contact(phone, adress, district, city, states, uf, cep) values(?,?,?,?,?,?,?);";
            var prepareStatmentInsertContact = PostgresConnection.getConnection().prepareStatement(queryInsertContact);
            prepareStatmentInsertContact.setInt(1, dados.getPhone());
            prepareStatmentInsertContact.setString(2, dados.getAddress());
            prepareStatmentInsertContact.setString(3, dados.getDistrict());
            prepareStatmentInsertContact.setString(4, dados.getCity());
            prepareStatmentInsertContact.setString(5, dados.getStates());
            prepareStatmentInsertContact.setString(6, dados.getUf());
            prepareStatmentInsertContact.setInt(7, dados.getCep());
            prepareStatmentInsertContact.executeUpdate();

            var querySelectId = "SELECT id FROM employee_contact ec WHERE ec.phone = ? AND ec.adress = ? AND ec.district = ? AND ec.city = ? AND ec.states = ? AND ec.uf = ? AND ec.cep = ?; ";
            var prepareStatementSelectId = PostgresConnection.getConnection().prepareStatement(querySelectId);
            prepareStatementSelectId.setInt(1, dados.getPhone());
            prepareStatementSelectId.setString(2, dados.getAddress());
            prepareStatementSelectId.setString(3, dados.getDistrict());
            prepareStatementSelectId.setString(4, dados.getCity());
            prepareStatementSelectId.setString(5, dados.getStates());
            prepareStatementSelectId.setString(6, dados.getUf());
            prepareStatementSelectId.setInt(7, dados.getCep());

            var res = prepareStatementSelectId.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }
            return 0;
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public int newEmployeeDocuments(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var queryInsertDocuments = "INSERT INTO documents(nro_title, electoral_zone, electoral_section, nro_rg, state_rg, nro_work_card, series_work_card, cpf) values(?,?,?,?,?,?,?,?);";
            var prepareStatementInsertDocuments = PostgresConnection.getConnection()
                    .prepareStatement(queryInsertDocuments);
            prepareStatementInsertDocuments.setString(1, dados.getNro_title());
            prepareStatementInsertDocuments.setString(2, dados.getElectoral_zone());
            prepareStatementInsertDocuments.setString(3, dados.getElectoral_section());
            prepareStatementInsertDocuments.setInt(4, dados.getNro_rg());
            prepareStatementInsertDocuments.setString(5, dados.getState_rg());
            prepareStatementInsertDocuments.setInt(6, dados.getNro_work_card());
            prepareStatementInsertDocuments.setString(7, dados.getSeries_work_card());
            prepareStatementInsertDocuments.setInt(8, dados.getCpf());
            prepareStatementInsertDocuments.executeUpdate();

            var querySelectDocumentId = "SELECT id FROM documents d WHERE d.nro_title =? AND d.electoral_zone = ? AND d.electoral_section = ? AND nro_rg = ? AND state_rg = ? AND nro_work_card = ? AND series_work_card = ? AND cpf = ?;";
            var prepareStatementSelectDocumentId = PostgresConnection.getConnection()
                    .prepareStatement(querySelectDocumentId);
            prepareStatementSelectDocumentId.setString(1, dados.getNro_title());
            prepareStatementSelectDocumentId.setString(2, dados.getElectoral_zone());
            prepareStatementSelectDocumentId.setString(3, dados.getElectoral_section());
            prepareStatementSelectDocumentId.setInt(4, dados.getNro_rg());
            prepareStatementSelectDocumentId.setString(5, dados.getState_rg());
            prepareStatementSelectDocumentId.setInt(6, dados.getNro_work_card());
            prepareStatementSelectDocumentId.setString(7, dados.getSeries_work_card());
            prepareStatementSelectDocumentId.setInt(8, dados.getCpf());
            var res = prepareStatementSelectDocumentId.executeQuery();

            while (res.next()) {
                return res.getInt("id");
            }

            return 0;
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public int newEmployeeTicket(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var queryInsertTicket = "INSERT INTO ticket(identification, code_operator, code_line, card_number, qtt_daily_ticket, ticket_value, fk_ticket_type) values(?,?,?,?,?,?,?)";
            var prepareStatementInsertTicket = PostgresConnection.getConnection().prepareStatement(queryInsertTicket);
            prepareStatementInsertTicket.setInt(1, dados.getIdentification());
            prepareStatementInsertTicket.setString(2, dados.getCode_operator());
            prepareStatementInsertTicket.setString(3, dados.getCode_line());
            prepareStatementInsertTicket.setInt(4, dados.getCard_number());
            prepareStatementInsertTicket.setInt(5, dados.getQtt_daily_ticker());
            prepareStatementInsertTicket.setInt(6, dados.getTicket_value());
            prepareStatementInsertTicket.setInt(7, dados.getFk_ticket_type());
            prepareStatementInsertTicket.executeUpdate();

            var querySelectTicketId = "SELECT id FROM ticket t where t.identification = ? ;";
            var prepareStatementSelectId = PostgresConnection.getConnection().prepareStatement(querySelectTicketId);
            prepareStatementSelectId.setInt(1, dados.getIdentification());
            var res = prepareStatementSelectId.executeQuery();
            while (res.next()) {
                return res.getInt("id");
            }
            return 0;
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public int newEmployeeAccess(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var listName = dados.getName_employee().split(" ");
            var login = ("" + listName[0] + "_" + listName[listName.length - 1] + "").toLowerCase();
            var password = dados.getRegistration();

            if (!checkLogin(login)) {
                var query = "INSERT INTO access(login, password) values(?,?)";
                var prepareStatment = PostgresConnection.getConnection().prepareStatement(query);
                prepareStatment.setString(1, login);
                prepareStatment.setString(2, password);
                prepareStatment.executeUpdate();

                var querySelectId = "select id from access a where a.login = ?";
                var prepareStatementSelectId = PostgresConnection.getConnection().prepareStatement(querySelectId);
                prepareStatementSelectId.setString(1, login);
                var res = prepareStatementSelectId.executeQuery();

                while (res.next()) {
                    return res.getInt("id");
                }
                return 0;
            }

            // TODO Criar lógica de um novo login diferente do padrão;

            return 0;

        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public boolean checkLogin(String login) throws EmployeeErrors {
        try {
            var query = "select id from access a where a.login = ?";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);
            prepareStatement.setString(1, login);
            var res = prepareStatement.executeQuery();

            while (res.next()) {
                return true;
            }

            return false;
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public ResultSet editEmployee(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var query = "UPDATE employee SET registration = ?, name_employee = ?, email = ?, entry_date = ?, contract_date = ?, date = ?, photo = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getRegistration());
            prepareStatement.setString(2, dados.getName_employee());
            prepareStatement.setString(3, dados.getEmail());
            prepareStatement.setDate(4, dados.getEntry_date());
            prepareStatement.setDate(5, dados.getContract_date());
            prepareStatement.setString(6, dados.getDate());
            prepareStatement.setString(7, dados.getPhoto());
            prepareStatement.setInt(8, dados.getId_employee());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public ResultSet editDocuments(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var query = "UPDATE documents SET nro_title = ?, electoral_zone = ?, electoral_section = ?, nro_rg = ?, state_rg = ?, nro_work_card = ?, series_work_card = ?, cpf = ?";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getNro_title());
            prepareStatement.setString(2, dados.getElectoral_zone());
            prepareStatement.setString(3, dados.getElectoral_section());
            prepareStatement.setInt(4, dados.getNro_rg());
            prepareStatement.setString(5, dados.getState_rg());
            prepareStatement.setInt(6, dados.getNro_work_card());
            prepareStatement.setString(7, dados.getSeries_work_card());
            prepareStatement.setInt(8, dados.getCpf());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public ResultSet editContacts(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var query = "UPDATE employee_contact SET phone = ?, address = ?, district = ?, city = ?, states = ?, uf = ?, cep = ? WHERE id = ?";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setInt(1, dados.getPhone());
            prepareStatement.setString(2, dados.getAddress());
            prepareStatement.setString(3, dados.getDistrict());
            prepareStatement.setString(4, dados.getCity());
            prepareStatement.setString(5, dados.getStates());
            prepareStatement.setString(6, dados.getUf());
            prepareStatement.setInt(7, dados.getCep());
            prepareStatement.setInt(8, dados.getId_contact());

            return prepareStatement.executeQuery();

        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public ResultSet editTicket(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var query = "UPDATE ticket SET identification = ?, code_operator = ?, code_line = ?, card_number = ?, qtt_daily_ticket = ?, ticket_value = ?, fk_ticket_type = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setInt(1, dados.getIdentification());
            prepareStatement.setString(2, dados.getCode_operator());
            prepareStatement.setString(3, dados.getCode_line());
            prepareStatement.setInt(4, dados.getCard_number());
            prepareStatement.setInt(5, dados.getQtt_daily_ticker());
            prepareStatement.setInt(6, dados.getTicket_value());
            prepareStatement.setInt(7, dados.getFk_ticket_type());
            prepareStatement.setInt(8, dados.getId_ticket());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public ResultSet editAccess(EmployeeEntity dados) throws EmployeeErrors {
        try {
            var query = "UPDATE access SET login = ?, password = ? WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setString(1, dados.getLogin());
            prepareStatement.setString(2, dados.getPassword());
            prepareStatement.setInt(3, dados.getId_access());

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public ResultSet deactiveEmployee(int id) throws EmployeeErrors {
        try {
            var query = "UPDATE employee SET active_employee = false WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setInt(1, id);

            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }

    public ResultSet activeEmployee(int id) throws EmployeeErrors {
        try {
            var query = "UPDATE employee SET active_employee = true WHERE id = ?;";
            var prepareStatement = PostgresConnection.getConnection().prepareStatement(query);

            prepareStatement.setInt(1, id);
            return prepareStatement.executeQuery();
        } catch (SQLException e) {
            throw new EmployeeErrors(e.getMessage());
        }
    }
}
