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

import javax.ws.rs.core.Response;

@javax.ws.rs.Path("/accounts")
public interface AccountsResource
{
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response get(@javax.ws.rs.BeanParam @javax.validation.Valid final AppAwareParameters appAware, @javax.ws.rs.BeanParam @javax.validation.Valid final PagedParameters paged, @javax.ws.rs.BeanParam @javax.validation.Valid final QueryableParameters queryable);

	@javax.ws.rs.POST
	@javax.ws.rs.Consumes({"application/json"})
	Response post(@javax.ws.rs.BeanParam @javax.validation.Valid final AppAwareParameters appAware, @javax.validation.Valid final Account account);

	@javax.ws.rs.Path("/{email}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByEmail(@javax.ws.rs.BeanParam @javax.validation.Valid final AppAwareParameters appAware, @javax.ws.rs.PathParam("email") final java.lang.String email);

	@javax.ws.rs.Path("/{email}")
	@javax.ws.rs.PUT
	@javax.ws.rs.Consumes({"application/json"})
	Response putByEmail(@javax.ws.rs.BeanParam @javax.validation.Valid final AppAwareParameters appAware, @javax.ws.rs.PathParam("email") final java.lang.String email, @javax.validation.Valid final Account account);

	@javax.ws.rs.Path("/{email}")
	@javax.ws.rs.DELETE
	Response deleteByEmail(@javax.ws.rs.BeanParam @javax.validation.Valid final AppAwareParameters appAware, @javax.ws.rs.PathParam("email") final java.lang.String email);

}
