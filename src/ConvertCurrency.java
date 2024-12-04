import java.util.Scanner;

public class ConvertCurrency {

    public static void convert(String baseCurrency, String targetCurrency, ConsultCurrency consult, Scanner read){
        double amount;
        double convertedAmount;

        ExchangeRate exchangeRate = consult.searchCurrency(baseCurrency, targetCurrency);
        System.out.println("Tasa de cambio para el dia de hoy:\n1 " + baseCurrency +
                " = " + exchangeRate.conversion_rate() + " " + targetCurrency);
        System.out.println("Ingrese el monto a convertir:");
        amount = Double.parseDouble(read.nextLine());
        convertedAmount = amount * exchangeRate.conversion_rate();
        System.out.println(amount + " " + baseCurrency + " = " +
                convertedAmount + " " + targetCurrency);
    }

    public static void convertOtherCurrency (ConsultCurrency consult, Scanner read){
        System.out.println("Seleccione el código de la moneda de origen:");
        String baseCurrency = read.nextLine().toUpperCase();
        System.out.println("Seleccione el código de la moneda de destino:");
        String targetCurrency = read.nextLine().toUpperCase();
        convert(baseCurrency,targetCurrency,consult,read);
    }

}
