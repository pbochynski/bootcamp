package com.hybris.clients;

import org.glassfish.jersey.internal.util.collection.MultivaluedStringMap;
import org.json.JSONObject;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

public class Authenticator {

    public static String getAccessToken(final String tenant, final String id, final String secret) {
        final MultivaluedMap<String, String> formData = new MultivaluedStringMap();
        formData.add("grant_type", "client_credentials");
        formData.add("scope", "FULL_ACCESS");
        formData.add("hybris-tenant", tenant);
        formData.add("client_id", id);
        formData.add("client_secret", secret);

        final Response response = ClientBuilder.newClient().target("https://api.yaas.io/oauth2/v1").path("token")
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .post(Entity.form(formData));
        final JSONObject obj = new JSONObject(response.readEntity(String.class));
        return obj.getString("access_token");
    }
}
