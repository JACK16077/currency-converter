import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        var consult = new ConsultCurrency();
        String menu = """
                ***************************************************
                Sea bienvenido/a al Conversor de Moneda =]
                
                1) Dólar Australiano =>> Dólar Americano
                2) Dólar Americano =>> Dólar Australiano 
                3) Dólar Americano =>> Peso Colombiano
                4) Peso Colombiano =>> Dólar Americano
                5) Euros =>> Peso Colombiano
                6) Peso Colombiano =>> Euros
                7) Covertir otra moneda
                8) Salir
                Elija una opción válida:
                ****************************************************  
                """;
        int userSelection = 0;
        while (userSelection != 8){
            System.out.println(menu);
            userSelection = read.nextInt();
            read.nextLine();

            switch (userSelection){
                case 1:
                    ConvertCurrency.convert("AUD", "USD",consult,read);
                    break;
                case 2:
                    ConvertCurrency.convert("USD", "AUD",consult,read);
                    break;
                case 3:
                    ConvertCurrency.convert("USD", "COP",consult,read);
                    break;
                case 4:
                    ConvertCurrency.convert("COP", "USD",consult,read);
                    break;
                case 5:
                    ConvertCurrency.convert("EUR", "COP",consult,read);
                    break;
                case 6:
                    ConvertCurrency.convert("COP", "EUR",consult,read);
                    break;
                case 7:
                    ConvertCurrency.convertOtherCurrency(consult, read);
                case 8:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }



        }
    }
}
