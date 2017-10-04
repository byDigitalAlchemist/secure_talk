package org.dc.projects.stalki.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Digital Alchemist
 */
public class StalkiServer {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");

		try {
			Socket socket 	= new Socket("localhost", 9806);
			
			
			/**
			 * reads data from userinput
			 */
			BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
			
			/**
			 * reads data from socket
			 */
			BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			
			PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);
			
			
			PrintWriter outWriter = new PrintWriter(socket.getOutputStream(),true);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
