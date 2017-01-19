import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Nano{

public static void main(String args[]) throws Exception {

	try
    {
    @SuppressWarnings("resource")
	DatagramSocket serverSocket = new DatagramSocket(4093);
    byte[] receiveData = new byte[150];
    byte[] sendData = new byte[12];
    
    while(true)
       {
    	//RECEIVE    DATA
       DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
       serverSocket.receive(receivePacket);
       serverSocket.setReceiveBufferSize(1024);
       String sendit = new String( receivePacket.getData());
       System.out.println("RX :  "+sendit);               //imprimo recibido
       InetAddress IPAddress = receivePacket.getAddress();
       int port = receivePacket.getPort();
       //SEND    ACK    DATA
       String num = sendit.substring(8, 10);   //#packet
       String code = sendit.substring(3,7);    //#codigo
       String zaraza = "$B,"+code+",ACK="+num+",$E";
       sendData = zaraza.getBytes();
       DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
       serverSocket.send(sendPacket);
       //   System.out.println(" "+IPAddress+":"+port); 
       String s = new String(sendData);
       System.out.println("TX :  "+s); 
       }
    }
	finally{
	}
	}
}



 