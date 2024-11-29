package com.xdevsoftware;

public class Demo
{
	
	public static void main(final String[] args) throws Exception
	{
		Account account = new Account("DE89370400440532013000");
		System.out.println("Account created with IBAN: " + account.getIBAN());

	}
	
}
