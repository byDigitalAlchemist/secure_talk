package org.dc.projects.stalki.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Digital Alchemist
 */
public class StalkiClient {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");

		try {
			ServerSocket ss = new ServerSocket(9806);
			Socket socket 	= ss.accept();
			
			BufferedReader inReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter outWriter = new PrintWriter(socket.getOutputStream(),true);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
