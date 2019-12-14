package projet.JavaCollection;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Reseau {
	private int port;
	Socket socketClient;
	ServerSocket socketServer;
	
	//Server
	public void server() {
		try{
			socketServer = new ServerSocket(port);
			System.out.println("Server start");
			
			socketClient = socketServer.accept();			
			}
		catch (Exception e) {
				e.printStackTrace();
			}
		}	
	//Client
	public void Client(String host){
		
		try{
			InetAddress server = InetAddress.getByName(host);
			socketClient = new Socket(server, port);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
}
