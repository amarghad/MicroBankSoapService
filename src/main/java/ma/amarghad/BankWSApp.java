package ma.amarghad;

import jakarta.xml.ws.Endpoint;
import ma.amarghad.service.BankService;

public class BankWSApp {
    public static void main(String[] args) {
        String adress = "http://0.0.0.0:9090/";
        Endpoint.publish(adress, new BankService());
        System.out.printf("Micro bank soap service is deployed successfully sur l'adresse : %s",
                adress);
    }
}