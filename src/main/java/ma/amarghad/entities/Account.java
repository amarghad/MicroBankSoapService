package ma.amarghad.entities;

import java.util.Date;

public class Account {

    private int code;
    private double balance;
    private Date date;

    public Account() {
    }

    public Account(int code, double balance, Date date) {
        this.code = code;
        this.balance = balance;
        this.date = date;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getBalance() {
        return balance;
    }
    public Date getDate() {
        return date;
    }
}
