package ma.amarghad.bankws;

import jakarta.xml.ws.Endpoint;
import ma.amarghad.bankws.service.MicroBank;

public class BankWSApp {
    public static void main(String[] args) {
        String adress = "http://0.0.0.0:9090/";
        Endpoint.publish(adress, new MicroBank());
        System.out.printf("Micro bank soap service is deployed successfully sur l'adresse : %s",
                adress);
    }
}