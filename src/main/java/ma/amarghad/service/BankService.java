package ma.amarghad.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.amarghad.Utils;
import ma.amarghad.entities.Account;

import java.util.*;

@WebService(name = "BankWS")
public class BankService {

    @WebMethod
    public double toMAD(@WebParam(name="euroAmount") double amountInEuro) {
        return amountInEuro * 15;
    }

    @WebMethod
    public Account getAccount(int code) {
        return new Account(code, Utils.randomAmount(), new Date());
    }

    @WebMethod
    public List<Account> getAccounts() {

        int count = new Random().nextInt(20) + 5;

        List<Account> accounts = new LinkedList<>();
        while (count-- > 0) {
            int code = (int) (Math.random() * 2000);
            Account account = new Account(code, Utils.randomAmount(), new Date());
            accounts.add(account);
        }

        return accounts;
    }

}
