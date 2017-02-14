
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class conex extends Thread{
public String zaraza;
public static String sendit;

@SuppressWarnings("resource")
public void run(){
	try
    {
    DatagramSocket serverSocket = new DatagramSocket(4098);
    byte[] receiveData = new byte[150];
    byte[] sendData = new byte[30];
    System.out.println("Waiting for ....");  
    while(true)
       {
       Thread.sleep(500);
       //RECEIVE    DATA
       DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
       serverSocket.receive(receivePacket);
       serverSocket.setReceiveBufferSize(1024);
       String sendit = new String( receivePacket.getData());
       System.out.println(fecha.dateinf2()+ " RX :  "+sendit.trim());   
       
       InetAddress IPAddress = receivePacket.getAddress();
       int port = receivePacket.getPort();
       //SEND    ACK    DATA
       DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
       String num = sendit.substring(8, 10);   //#packet
       String code = sendit.substring(3,7);    //#codigo
       Thread.sleep(500);
       zaraza = "$B,"+code+",ACK="+num+",$E";
       sendData = zaraza.getBytes();
	   serverSocket.send(sendPacket);   
       }
    } catch (IOException | InterruptedException e) {
		
		e.printStackTrace();
	}
	finally{
	}
	}

}
