package net.codejava;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest.BodyPublishers;

public class myAPI {
	
	private HttpClient client = HttpClient.newBuilder().version(Version.HTTP_1_1).build();
	
	private String myUrl = "https://anypoint.mulesoft.com/mocking/api/v1/links/53b06fc0-0c6f-4e17-9569-f91f9e1d2e0f/contacts";


	public static void main(String args[]) throws IOException, InterruptedException {
		myAPI HttpClient = new myAPI();

        HttpClient.doPOST();
        //HttpClient.doGET();

    }
	
	//get method
	private void doGET() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(myUrl))
                .setHeader("Accept", "application/json") // add request header
                .setHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
	
	//post method
	private void doPOST() throws IOException, InterruptedException {
		// generation of the body String
        String json = new StringBuilder().append("{").append("\"student_id\":3,").append("\"firstname\":\"Anesu\",")
                .append("\"surname\":\"Mahachi\",").append("\"date_of_birth\":\"18/08/1997\" ,").append("}").toString();

        // creation of the Http Request
        HttpRequest request = HttpRequest.newBuilder().POST(BodyPublishers.ofString(json))
                .uri(URI.create(myUrl))
                .setHeader("Accept", "application/json")
                .setHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        
        // capturing the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("post success");
        System.out.println(response.statusCode());
        
	    }
}