package org.SimpleDropWizardService.resources;

import com.fasterxml.jackson.databind.ObjectMapper;


import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.Map;

@Path("/welcome")
public class HelloWorldResource {

    public HelloWorldResource(){}

    @GET
    @Path("/{name}")
    public String getWelcome(@PathParam("name") String name) {
        return "Hello " + name + ". Welcome to my WebService!";
        /*Client client = ClientBuilder.newClient();
        String result = client.target("http://api.covidtracking.com/v1/states/info.json").request().get(String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.convertValue(result, Map.class);
        return map.get("state").toString();*/
    }

    @GET
    @Path("/api2/{name}")
    public String getWelcome2(@PathParam("name") String name) {
        return "Hello " + name + ". This is api 2!";
    }
}
