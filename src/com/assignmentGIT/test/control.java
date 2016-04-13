package com.assignmentGIT.test;

import java.io.FileNotFoundException;

/*
Main class for 
Author: Dara Marshall-Crowe
Student no.: C14517457
Date: 03/04/2016
*/

public class control
{
	public static void main(String[] args)
	{
		String retString;
		try {
			retString = SetComparing.SetCompare();
			System.out.println(retString);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}