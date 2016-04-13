package com.assignmentGIT.test;
/*
GUI class
Author: Dara Marshall-Crowe
Student no.: C14517457
Date: 10/04/2016
*/
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.*;

	@SuppressWarnings("serial")
	public class GUI extends JFrame implements ActionListener
	{	
		public static Object file1textfield;
		JButton compareButton, exitButton; 
	    JLabel notice, notice2, fileLabel1, fileLabel2;	
		static JTextField file1TextField, file2TextField;
	    
	    public void GUImethod()
	    {
	    	setLayout(new FlowLayout());
	    	setTitle("DocoSim Demo");
	    	
	    	//notice label, to notify users of the format of writing files
	    	notice = new JLabel("Type the names of the files to be\r\n "
	    					  + "compared in the file 1 and file 2\r\n "
	    					  + "text fields, eg. \"MyTextFile.txt\"");
	    	add(notice);
	    	
	    	//additional notice label to notify users where to store the files
	    	notice2 = new JLabel("Remember to place the files\r\n "
					  		   + "in the same folder as the src folder\r\n "
					  		   + "and ensure all files are .txt format");
	    	add(notice2);
	
	    	// TextField and label 1
	    	
	    	
	    	fileLabel1 = new JLabel("File 1");
	    	add(fileLabel1);
	    	
	    	file1TextField = new JTextField("",20);
	       	add(file1TextField);
	       	fileLabel1.setLabelFor(file1TextField);
	       	
	       	
	       	//TextField and label 2
	       	
	       	
	    	fileLabel2 = new JLabel("File 2");
	    	add(fileLabel2);
	    	
	       	file2TextField = new JTextField("",20);
	       	add(file2TextField);
	       	fileLabel2.setLabelFor(file2TextField);
	       	
	       	// Buttons
	       	
	       	compareButton = new JButton("Compare files");
	       	add(compareButton);
	       	exitButton = new JButton("Exit");
	       	add(exitButton);
	       	
	       	// Listeners
	       	
	       	compareButton.addActionListener(this);
	       	exitButton.addActionListener(this);
	       	
	       	setVisible(true);
	       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       	setSize(575,150);
	    }

		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == compareButton)
			{
				try
				{
					String retString = SetComparing.SetCompare();
					JOptionPane.showMessageDialog(this, retString);
				}
				catch (FileNotFoundException ex) 
				{
					JOptionPane.showMessageDialog(this, "Error: One or more of the files could not be found or do not exist");
				}
			}
			
			else if(e.getSource() == exitButton)
			{
				System.exit(0);
			}
		}

	}


