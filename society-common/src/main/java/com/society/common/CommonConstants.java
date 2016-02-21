package com.society.common;

public final class CommonConstants
{

	public static final String NUMERIC_DATE_FORMAT = "dd-MMM-yyyy";
	
	public static class RequestMapping
	{
		public static final String EXPENSE = "/expense";

		public static final String INCOME = "/income";

		public static final String SUMMARY = "/summary";

		public static final String CREATE_EXPENSE = "/createExpense";

		public static final String CREATE_INCOME = "/createIncome";

		public static final String INCOME_EXPENSE_SUMMARY = "/incomeExpenseSummary";
		
		public static final String GET_BANK_LIST = "/getbanklist";
		
		public static final String BANK_DETAILS = "/bankdetails";
		
		public static final String VIEW_ADD_BANK_DETAILS = "/viewbankdetails";
		
		public static final String SUBMIT_BANK_DETAILS = "/submitbankdetails";
		

	}
	
	public static class RequestMesageMapKeyConstant
	{
		public static final String INCOME_EXPENSE_REQUEST_KEY = "IncomeExpenseRequest";
		
		public static final String INCOME_EXPENSE_RESPONSE_KEY = "IncomeExpenseResponse";
		
		public static final String SUBMIT_BANK_DETAILS_REQUEST_KEY = "SubmitBankDetailsRequest";
	}

}
