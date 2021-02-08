package de.deanomus.lok_restapi.examples;

import de.deanomus.lok_restapi.LOK_RestApi;
import de.deanomus.lok_restapi.util.Data;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class LoginExample {

    String
            name,
            password,
            token;

    public LoginExample() {

    }

    public void run() {
        System.out.print("Name: ");
        name = LOK_RestApi.scan.next();
        System.out.print("Passwort: ");
        password = LOK_RestApi.scan.next();

        HttpResponse<JsonNode> response = Unirest.post(Data.SERVERURL + "api/v1_0/login")
                .header("accept", "application/json")
                .field("name", name)
                .field("password", password)
                .asJson();

        System.out.println(response.getBody().toString());

    }

}
