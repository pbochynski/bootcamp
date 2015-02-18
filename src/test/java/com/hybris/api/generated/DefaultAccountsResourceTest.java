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

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;


public final class DefaultAccountsResourceTest extends com.hybris.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /accounts,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/accounts";

	/* get() /accounts/ */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /accounts/ */
	@Test
	public void testPostWithAccount()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final com.hybris.api.generated.Account entityBody =
		new com.hybris.api.generated.Account();
		final javax.ws.rs.client.Entity<com.hybris.api.generated.Account> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /accounts//email */
	@Test
	public void testGetByEmail()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/email");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /accounts//email */
	@Test
	public void testPutByEmailWithAccount()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/email");
		final com.hybris.api.generated.Account entityBody =
		new com.hybris.api.generated.Account();
		final javax.ws.rs.client.Entity<com.hybris.api.generated.Account> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /accounts//email */
	@Test
	public void testDeleteByEmail()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/email");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultAccountsResource.class);
		return application;
	}
}
