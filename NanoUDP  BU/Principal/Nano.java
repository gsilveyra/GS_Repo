package Principal;
import Ventana.jFrame;



class Nano{

public static void main(String args[])  {
	jFrame.ventana();
	new Thread(new conex()).start();
}
}




 