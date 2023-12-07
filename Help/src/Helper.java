import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class Help {
    public static void main(String[] args) {
        String apiKey = "your-api-key";
        String endpoint = "https://api.openai.com/v1/engines/davinci/completions";  // Update the endpoint if needed

        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost request = new HttpPost(endpoint);

            // Set the API key in the Authorization header
            request.setHeader("Authorization", "Bearer " + apiKey);

            // Set the request body with the prompt
            StringEntity params = new StringEntity("{\"prompt\": \"Translate the following English text to French:\"}");
            request.setEntity(params);

            // Execute the request and get the response
            HttpResponse response = httpClient.execute(request);

            // Print the response
            System.out.println(response.getEntity().getContent().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}