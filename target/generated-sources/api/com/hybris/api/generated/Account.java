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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Wed Feb 18 22:15:41 CET 2015")
@XmlRootElement
public class Account
{

	@org.hibernate.validator.constraints.Email
	@javax.validation.constraints.NotNull
	private java.lang.String _crowd;

	@org.hibernate.validator.constraints.Email
	private java.lang.String _github;

	private java.lang.String _groupname;

	private java.lang.Boolean _deploys;

	private java.util.Date _modifiedAt;

	private java.net.URI _modifiedBy;

	private com.hybris.api.generated.Status _status;
	
	public java.lang.String getCrowd()
	{
		return _crowd;
	}
	
	public java.lang.String getGithub()
	{
		return _github;
	}
	
	public java.lang.String getGroupname()
	{
		return _groupname;
	}
	
	public java.lang.Boolean isDeploys()
	{
		return _deploys;
	}
	
	public java.util.Date getModifiedAt()
	{
		return _modifiedAt;
	}
	
	public java.net.URI getModifiedBy()
	{
		return _modifiedBy;
	}
	
	public com.hybris.api.generated.Status getStatus()
	{
		return _status;
	}



	public void setCrowd(final java.lang.String _crowd)
	{
		this._crowd = _crowd;
	}

	public void setGithub(final java.lang.String _github)
	{
		this._github = _github;
	}

	public void setGroupname(final java.lang.String _groupname)
	{
		this._groupname = _groupname;
	}

	public void setDeploys(final java.lang.Boolean _deploys)
	{
		this._deploys = _deploys;
	}

	public void setModifiedAt(final java.util.Date _modifiedAt)
	{
		this._modifiedAt = _modifiedAt;
	}

	public void setModifiedBy(final java.net.URI _modifiedBy)
	{
		this._modifiedBy = _modifiedBy;
	}

	public void setStatus(final com.hybris.api.generated.Status _status)
	{
		this._status = _status;
	}





}
