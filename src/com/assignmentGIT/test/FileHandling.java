
/*
Class to handle file reading
Author: Dara Marshall-Crowe
Student no.: C14517457
Date: 05/04/2016
*/

import java.io.FileReader;
import java.io.BufferedReader;

public class FileHandling
{
	String word = "default";
	
	
	/* reading the stop words from stop_words.txt into the hashed set */
	BufferedReader reader = new BufferedReader(stop_words.txt);
	while(reader.hasNext())
	{
		word = reader.next();
		stop_words.add(word);
	}
	
	/* reading the words in document 1 into the hashed set (excluding stop words) */
	BufferedReader reader = new BufferedReader(file1);
	while(reader.hasNext())
	{
		word = reader.next();
		
		/* excluding stop words */
		if(stop_words.contains(word.toLowerCase())
		{
			
		}
		else
		{
			doc_1_words.add(reader.next());
		}
	}
	
	/* reading the words in document 2 into the hashed set (excluding stop words) */
	BufferedReader reader = new BufferedReader(file2);
	while(reader.hasNext())
	{
		word = reader.next();
		
		/* excluding stop words */
		if(stop_words.contains(word.toLowerCase())
		{
			
		}
		else
		{
			doc_2_words.add(reader.next());
		}
	}
}