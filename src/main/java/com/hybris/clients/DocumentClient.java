package com.hybris.clients;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class DocumentClient {
    public static Response getAll(final String tenant, final String app, final String type) {
        return client(tenant, app).path(type)
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .header("hybris-tenant", tenant)
                .header("hybris-roles", "FULL_ACCESS")
                .header("Authorization", "Bearer " + token(tenant))
                .get();
    }

    public static Response getById(final String tenant, final String app, final String type, String id) {
        return client(tenant, app).path(type).path(id)
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .header("hybris-tenant", tenant)
                .header("hybris-roles", "FULL_ACCESS")
                .header("Authorization", "Bearer " + token(tenant))
                .get();
    }

    private static WebTarget client(String tenant, String app) {
        return ClientBuilder.newClient().target("https://api.yaas.io/repository/v2").path("2vGtARVpAL4BiTTZRufpnmIaFaE1EYwC").path(tenant).path("data");
    }

    private static String token(String tenant) {
        return Authenticator.getAccessToken(tenant, "2vGtARVpAL4BiTTZRufpnmIaFaE1EYwC", "vXh4R5E9dMYadLq7");
    }

}
