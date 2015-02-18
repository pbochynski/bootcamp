/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package com.hybris.api.generated;

import javax.inject.Singleton;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.hybris.clients.Authenticator;
import com.hybris.clients.DocumentClient;
import org.glassfish.jersey.internal.util.collection.MultivaluedStringMap;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

/**
* Resource class containing the custom logic. Place put your logic here!
*/
@Component("apiAccountsResource")
@Singleton
public class DefaultAccountsResource implements com.hybris.api.generated.AccountsResource
{
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	/* GET / */
	@Override
	public Response get(final AppAwareParameters appAware, final PagedParameters paged, final QueryableParameters queryable)
	{
        Response account = DocumentClient.getAll(appAware.getHybrisTenant(), appAware.getHybrisApp(), "account");
        return account; /*Response.ok()
			.entity(new java.util.ArrayList<>()).build();*/
	}

	/* POST / */
	@Override
	public Response post(final AppAwareParameters appAware, final Account account)
	{
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath())
			.build();
	}

	/* GET //{email} */
	@Override
	public Response getByEmail(final AppAwareParameters appAware, final java.lang.String email)
	{
		// place some logic here
		return Response.ok()
			.entity(new Account()).build();
	}

	/* PUT //{email} */
	@Override
	public Response putByEmail(final AppAwareParameters appAware, final java.lang.String email, final Account account)
	{
		// place some logic here
		return Response.ok()
			.build();
	}

	/* DELETE //{email} */
	@Override
	public Response deleteByEmail(final AppAwareParameters appAware, final java.lang.String email)
	{
		// place some logic here
		return Response.noContent()
			.build();
	}

    // REST call helpers
    private boolean isSuccess(Response r) {
        return r.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL;
    }

}
