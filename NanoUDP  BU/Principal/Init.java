package Principal;
import javax.swing.SwingUtilities;

import Ventana.jFrame;
public class Init {
	public static void main(String args[]) throws InterruptedException  {
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			jFrame frame = new jFrame();
			frame.setVisible(true);			
			new Thread(new conex()).start();
		
		}
	  });
}
}
