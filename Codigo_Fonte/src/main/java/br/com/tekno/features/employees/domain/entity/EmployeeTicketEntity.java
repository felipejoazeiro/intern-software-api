package br.com.tekno.features.employees.domain.entity;

public class EmployeeTicketEntity {
    private int id;
    private int identification;
    private String code_operator;
    private String code_line;
    private int card_number;
    private int qtt_daily_ticker;
    private int ticket_value;
    private int fk_ticket_type;

    public EmployeeTicketEntity(int id, int identification, String code_operator, String code_line, int card_number,
            int qtt_daily_ticker, int ticket_value, int fk_ticket_type) {
        this.id = id;
        this.identification = identification;
        this.code_operator = code_operator;
        this.code_line = code_line;
        this.card_number = card_number;
        this.qtt_daily_ticker = qtt_daily_ticker;
        this.ticket_value = ticket_value;
        this.fk_ticket_type = fk_ticket_type;
    }

    public int getId() {
        return id;
    }

    public int getIdentification() {
        return identification;
    }

    public String getCode_operator() {
        return code_operator;
    }

    public String getCode_line() {
        return code_line;
    }

    public int getCard_number() {
        return card_number;
    }

    public int getQtt_daily_ticker() {
        return qtt_daily_ticker;
    }

    public int getTicket_value() {
        return ticket_value;
    }

    public int getFk_ticket_type() {
        return fk_ticket_type;
    }

}
