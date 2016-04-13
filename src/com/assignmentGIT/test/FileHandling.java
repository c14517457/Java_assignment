package com.assignmentGIT.test;
/*
Class for opening, scanning and closing files, and writing to the sets
Author: Dara Marshall-Crowe
Student no.: C14517457
Date: 03/04/2016
*/

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
	// taken from SetComparing
	public static HashSet<String> doc_1_words = SetComparing.doc_2_words;
	public static HashSet<String> doc_2_words = SetComparing.doc_1_words;
	public static HashSet<String> stop_words = SetComparing.stop_words;
	// taken from the GUI
	String file1 = GUI.file1TextField.getText();
	String file2 = GUI.file2TextField.getText();
	public void FileHandler() throws FileNotFoundException
	{
		String word;
		
		
		// reading the stop words from stop_words.txt into the hashed set
		
		Scanner sc = new Scanner(new File("stop_words.txt"));
		while(sc.hasNext())
		{
			word = sc.next();
			word = word.toLowerCase();
			stop_words.add(word);
		}
		
		// reading the words in document 1 into the set (excluding stop words)
	    
		sc = new Scanner(new File(file1));
		while(sc.hasNext())
		{
			word = sc.next();
			word = word.toLowerCase();
			// excluding stop words
			if(stop_words.contains(word))
			{
				
			}
			else
			{
				doc_1_words.add(word);
			}
		}
		
		// reading the words in document 2 into the set (excluding stop words)
		sc = new Scanner(new File(file2));
		while(sc.hasNext())
		{
			word = sc.next();
			word = word.toLowerCase();
			// excluding stop words from being added to the set
			if(stop_words.contains(word))
			{
				
			}
			else
			{
				doc_2_words.add(word);
			}
		}
		sc.close();
	}
}