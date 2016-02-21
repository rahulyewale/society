package com.society.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonIgnoreType;

@JsonIgnoreType
@JsonIgnoreProperties
public class Income implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer incomeTypeId;

	private String incomeType;

	private String incomeDescription;

	private double incomeAmount;

	private String incomeDate;
	
	private Integer applicationUserId;

	public Income()
	{
	}

	public Income(String incomeType, String incomeDescription, double incomeAmount, String incomeDate)
	{
		this.incomeType = incomeType;
		this.incomeDescription = incomeDescription;
		this.incomeAmount = incomeAmount;
		this.incomeDate = incomeDate;
	}

	public String getIncomeType()
	{
		return incomeType;
	}

	public void setIncomeType(String incomeType)
	{
		this.incomeType = incomeType;
	}

	public double getIncomeAmount()
	{
		return incomeAmount;
	}

	public void setIncomeAmount(double incomeAmount)
	{
		this.incomeAmount = incomeAmount;
	}

	public String getIncomeDate()
	{
		return incomeDate;
	}

	public void setIncomeDate(String incomeDate)
	{
		this.incomeDate = incomeDate;
	}

	public String getIncomeDescription()
	{
		return incomeDescription;
	}

	public void setIncomeDescription(String incomeDescription)
	{
		this.incomeDescription = incomeDescription;
	}

	public Integer getIncomeTypeId()
	{
		return incomeTypeId;
	}

	public void setIncomeTypeId(Integer incomeTypeId)
	{
		this.incomeTypeId = incomeTypeId;
	}

	public Integer getApplicationUserId()
	{
		return applicationUserId;
	}

	public void setApplicationUserId(Integer applicationUserId)
	{
		this.applicationUserId = applicationUserId;
	}
	

}