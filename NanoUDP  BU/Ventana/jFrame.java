package Ventana;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class jFrame extends JFrame {
private static final long serialVersionUID = 1L;
private JPanel contentPane;

public static JTextArea textArea;
public static JTextField txtPort;
public static JButton Button;

public jFrame() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(-23, 9, 602, 216);
	    textArea.setFont(new Font("Monospaced", Font.PLAIN, 11));
	    textArea.setEditable(false);
	    textArea.setLineWrap(true); 
	    textArea.setWrapStyleWord(true);
		contentPane.add(textArea);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(5, 35, 731, 222);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(scrollPane,BorderLayout.CENTER);  
		
				
		Button = new JButton("Connect");
		
		Button.setBounds(25, 8, 118, 23);
		contentPane.add(Button);
		
		txtPort = new JTextField();
		txtPort.setToolTipText("Port");
		txtPort.setBounds(172, 9, 130, 20);
		contentPane.add(txtPort);
		txtPort.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Puerto escucha");
		lblNewLabel.setBounds(317, 12, 94, 14);
		contentPane.add(lblNewLabel);
}
}
