import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Connect extends Thread{
public static int rxpack;
public ServerSocket serversocket;
public Socket server;
public boolean snd=false;
public boolean rcv=false;

public void run() {
		openSocket();
		while(true){
			try {
				Thread.sleep(InitMenu.demora);
				enviaPaq();
				recibePaq();
				
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
	}	
}
private void openSocket(){
	try {
		serversocket = new ServerSocket(InitMenu.portfin);
		System.out.println("Esperando por cliente.....");
		server = serversocket.accept();
	} catch (IOException e) {
		e.printStackTrace();
	}
}	
private void enviaPaq(){
	PrintWriter toClient;
	try {
		toClient = new PrintWriter(server.getOutputStream(),true);
		toClient.write(Packet.ev());  
		toClient.flush();
		snd=true;
		System.out.println(date.dateinf2()+"   TX:  "+Packet.ev());  
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}

private void recibePaq(){
	BufferedReader fromClient;
	try {
		fromClient = new BufferedReader(new InputStreamReader(server.getInputStream()));
		rxpack = fromClient.read();
		rcv=true;
		System.out.println(date.dateinf2()+"   RX:  "+"0"+rxpack);  
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}

}


	
