
/*
Class to handle set comparing
Author: Dara Marshall-Crowe
Student no.: C14517457
Date: 02/04/2016
*/


public String SetComparing(HashSet<String> doc_1_words, HashSet<String> doc_2_words) extends FileHandling
{
	String retString = "default";
	
	/* if doc_1_words is identical to doc_2_words */
	if(doc_1_words.equals(doc_2_words)
	{
		retString = "Document 1 contains 100% of the words in Document 2, in the same order (excluding stop words)";
	}
	
	else
	{	
		/* if doc_1_words is bigger than doc_2_words */
		if((doc_1_words.size()) > (doc_2_words.size())
		{
			/* if all the words in doc_2_words are in doc_1_words */
			if(!doc_1_words.containsAll(doc_2_words))
			{
				retString = "Document 2 contains 100% of the words in document 1 (excluding stop words)";
			}
			else
			{
				HashSet<String> set1 = doc_1_words;
				set1.removeAll(doc_2_words);
				/* dividing the size of set1 by the size of doc_2_words and multiplying by 100 to find a percentage */
				String percent = (set1.size()) / (doc_2_words.size()) * 100;
				retString = "Document 1 contains" + percent + "of the words in document 2 (excluding stop words)"
			}
		}
		
		/* if doc_1_words is smaller than doc_2_words */
		else
		{
			/* if all the words in doc_1_words are in doc_2_words */
			if(!doc_2_words.containsAll(doc_1_words))
			{
				retString = "Document 1 contains 100% of the words in document 2 (excluding stop words)";
			}
			else
			{
				HashSet<String> set1 = doc_2_words;
				set1.removeAll(doc_1_words);
				/* dividing the size of set1 by the size of doc_1_words and multiplying by 100 to find a percentage */
				String percent = (set1.size()) / (doc_1_words.size()) * 100;
				retString = "Document 2 contains" + percent + "of the words in document 1 (excluding stop words)"
			}
		}
	}
	return(retString);
}