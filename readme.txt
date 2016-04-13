		--DocoSim Program Readme--

DocoSim is a tool for detecting the similarity between two
text documents. The program takes 2 documents, removes stop words
from both, and compares them for similar words. It then sends the
user a message stating what percentage of similarity there is
between them.


The classes break down as follows:


Control - Used to instantiate the GUI

GUI - Class used to manage the GUI and, if the compare button is
      clicked and the file names are valid, instantiates SetComparing.

SetComparing - Creates HashSets to contain the words in document 1,
	       document 2 and stop words, then instantiates FileHandling
	       to populate the HashSets with values from the text files.
	       After FileHandling concludes, SetComparing compares the
	       contents of the words in document 1 and document 2 and 
	       calculates the similarity between them.

FileHandling - reads in the values of stop_words.txt, document 1 and
	       document 2 into their respective HashSets. Before adding
	       the value into document 1 or 2, FileHandling checks whether
	       or not the word is in the stop words HashSet. If they are 
	       not in stop_words, they are added. Thus the stop words are removed
	       from the comparing algorithm.