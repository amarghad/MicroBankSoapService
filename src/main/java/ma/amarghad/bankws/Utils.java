package ma.amarghad.bankws;

import ma.amarghad.bankws.entities.Account;

import java.util.Date;
import java.util.Random;

public class Utils {

    public static double randomAmount(double min, double max, int nOfZeros) {

        double initialBalance = Math.random() * (max - min) + min;
        double x = Math.pow(10, nOfZeros);
        return Math.round(initialBalance * x) / x;

    }

    public static double randomAmount(double min, double max) {
        return randomAmount(min, max, 2);
    }

    public static double randomAmount(double max) {
        return randomAmount(0, max);
    }

    public static double randomAmount() {
        return randomAmount(0, Double.MAX_VALUE);
    }

    public static int randomCode() {
        return new Random().nextInt(Integer.MAX_VALUE);
    }

    public static Account randomAccount() {
        return new Account(
            Utils.randomCode(),
            Utils.randomAmount(50_000),
            new Date()
        );
    }

}
