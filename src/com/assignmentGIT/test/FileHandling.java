package com.assignmentGIT.test;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;

/*
Class to handle file reading
Author: Dara Marshall-Crowe
Student no.: C14517457
Date: 05/04/2016
*/

import java.util.Scanner;

public class FileHandling
{

	public static HashSet<String> doc_1_words = SetComparing.doc_2_words;
	public static HashSet<String> doc_2_words = SetComparing.doc_1_words;
	public static HashSet<String> stop_words = SetComparing.stop_words;
	
	public void FileHandler() throws FileNotFoundException
	{
		String word = "default";
		
		
		/* reading the stop words from stop_words.txt into the hashed set */
		
		Scanner sc = new Scanner(new File("stop_words.txt"));
		while(sc.hasNext())
		{
			word = sc.next();
			stop_words.add(word);
		}
		
		/* reading the words in document 1 into the set (excluding stop words) */
	    
		sc = new Scanner(new File("New Text Document.txt"));
		while(sc.hasNext())
		{
			word = sc.next();
			/* excluding stop words */
			if(stop_words.contains(word.toLowerCase()))
			{
				
			}
			else
			{
				doc_1_words.add(word);
			}
		}
		
		/* reading the words in document 2 into the set (excluding stop words) */
		sc = new Scanner(new File("New Text Document (3).txt"));
		while(sc.hasNext())
		{
			word = sc.next();
			
			/* excluding stop words from being added to the set*/
			if(stop_words.contains(word.toLowerCase()))
			{
				
			}
			else
			{
				doc_2_words.add(word);
			}
		}
		sc.close();
		System.out.println(doc_1_words);
		System.out.println(doc_2_words);
		System.out.println(stop_words);
	}
}