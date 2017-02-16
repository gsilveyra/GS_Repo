package Ventana;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Font;
public class jFrame extends JFrame {
private static final long serialVersionUID = 1L;
private JPanel contentPane;

public static JTextArea textArea;

public jFrame() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
	    textArea.setFont(new Font("Monospaced", Font.PLAIN, 11));
	    textArea.setEditable(false);
	    textArea.setLineWrap(true); 
	    textArea.setWrapStyleWord(true);
		textArea.setBounds(37, 11, 597, 240);
		contentPane.add(textArea);
		
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);   
}
}
