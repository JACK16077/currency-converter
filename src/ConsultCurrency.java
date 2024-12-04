import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultCurrency {

public ExchangeRate searchCurrency (String baseCurrency, String targetCurrency){
    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e21c08b4dce54c249b16d1ac/pair/"+
            baseCurrency + "/" + targetCurrency);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();

    try{
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), ExchangeRate.class);
    } catch (Exception e) {
        throw new RuntimeException("No se pudo realizar la conversion");
    }
}


}
