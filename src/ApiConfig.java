import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConfig {

    public static String callApi() throws IOException, InterruptedException {
        String url = "https://latest.currency-api.pages.dev/v1/currencies/gbp.json";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();

        String response = httpClient.send(request, HttpResponse.BodyHandlers.ofString()).body();

        return response;
    }
}
