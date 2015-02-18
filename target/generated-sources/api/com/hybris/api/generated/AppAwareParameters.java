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

/**
 * Generated parameter dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Wed Feb 18 22:15:41 CET 2015")
public class AppAwareParameters
{
	@javax.validation.constraints.Pattern(regexp="[a-zA-Z0-9_-]*$")
	@javax.validation.constraints.Size(min=1,max=36)
	@javax.validation.constraints.NotNull
	@javax.ws.rs.HeaderParam("hybris-app")
	private java.lang.String hybrisApp;

	@javax.validation.constraints.Pattern(regexp="[a-zA-Z0-9_-]*$")
	@javax.validation.constraints.Size(min=1,max=36)
	@javax.validation.constraints.NotNull
	@javax.ws.rs.HeaderParam("hybris-tenant")
	private java.lang.String hybrisTenant;

	@javax.ws.rs.HeaderParam("hybris-roles")
	private java.lang.String hybrisRoles;

	@javax.ws.rs.HeaderParam("hybris-user")
	private java.lang.String hybrisUser;

	public java.lang.String getHybrisApp()
	{
		return hybrisApp;
	}

	public java.lang.String getHybrisTenant()
	{
		return hybrisTenant;
	}

	public java.lang.String getHybrisRoles()
	{
		return hybrisRoles;
	}

	public java.lang.String getHybrisUser()
	{
		return hybrisUser;
	}

	public void setHybrisApp(final java.lang.String hybrisApp)
	{
		this.hybrisApp = hybrisApp;
	}

	public void setHybrisTenant(final java.lang.String hybrisTenant)
	{
		this.hybrisTenant = hybrisTenant;
	}

	public void setHybrisRoles(final java.lang.String hybrisRoles)
	{
		this.hybrisRoles = hybrisRoles;
	}

	public void setHybrisUser(final java.lang.String hybrisUser)
	{
		this.hybrisUser = hybrisUser;
	}

}
