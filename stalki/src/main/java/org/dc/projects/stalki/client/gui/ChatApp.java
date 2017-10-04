package org.dc.projects.stalki.client.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatApp {
	static JFrame chatWindow = new JFrame("Secure Messaging (Stalki)");
	static JTextArea chatArea = new JTextArea(22,40);
	static JTextField textField = new JTextField(40);
	static JLabel blankLabel = new JLabel("            ");
	static JButton sendButton = new JButton("Send");
	
	public ChatApp() {
		
		chatWindow.setLayout(new FlowLayout());
		chatWindow.add(new JScrollPane(chatArea));
		chatWindow.add(blankLabel);
		chatWindow.add(textField);
		chatWindow.add(sendButton);
		chatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		chatWindow.setSize(475,500);
		chatWindow.setVisible(true);
		
		textField.setEditable(false);
		chatArea.setEditable(false);
		
		
	}



}
