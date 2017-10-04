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
		
		ServerSocket ss = null;
		Socket socket = null;
		SecureMessageHandler handler = null;
		
		try {
		
			ss = new ServerSocket(9806);
			
			while(true){
				socket 	= new Socket("localhost", 9806);
				handler = new SecureMessageHandler(socket);
				handler.start();
			}

		} catch (IOException e) {
			
			System.out.println(" Exception Catch :: " + e);
		
		}
		finally{
		
			try {
				
				if(ss != null)
					ss.close();
				
				if(socket != null)
					socket.close();
			
			} catch (IOException e1) {
			
				System.out.println(" Exception Catch :: " + e1);
			
			}
		
		}

	}

}


class SecureMessageHandler extends Thread{
	Socket socket;
	BufferedReader reader;
	PrintWriter outputWriter;
	
	public SecureMessageHandler(Socket socket){
		this.socket = socket;
		
	}
	
	public void run(){
		
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outputWriter = new PrintWriter(socket.getOutputStream(), true);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
}