package Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import Ventana.jFrame;
public class Init {
	public static void main(String args[]) throws InterruptedException  {
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			jFrame frame = new jFrame();
			frame.setVisible(true);	
					
			
		
			jFrame.Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Thread(new conex()).start();
				}
			});
			
			
		}
	  });
}
	
}
