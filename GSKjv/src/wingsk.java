import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class wingsk extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;	
	private JButton btnExit;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wingsk frame = new wingsk();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public wingsk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(42, 32, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.CENTER);
		txt2.setBounds(138, 32, 43, 20);
		contentPane.add(txt2);
		txt2.setColumns(2);
		//txt2.setDocument(new JTextFieldLimit(2)); //2 = maximo caracteres
		
		txt3 = new JTextField();
		txt3.setEditable(false);
		txt3.setBounds(65, 120, 94, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		JButton btn1 = new JButton("OK");
		  //Add action listener to button
        btn1.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	String str = "";
            	String key1 ="";
            	str = txt1.getText();                    //Palabra a descifrar
            	key1 = txt2.getText();                   //semilla campo texto1
            	
            	String n1 = key1.substring(0,1);        //primer digito de key
                int num1 = 0;
            	num1 = Integer.parseInt(n1);
            
            	int key = Integer.parseInt(key1);        //paso semilla a numero
            	int len =str.length();
            	int sum = 0;
            	String str3 = "";
                for ( int i=0; i < len; ++i ) {
                	   char c = str.charAt( i );
                	   int j = (int) c;
                	   if (j > 109) j=j-num1;
                	   else j=j+num1;
                	   String str2 = String.valueOf(Character.toChars(j));
                	   str3 += str2.toString();
                	   sum=j+sum*key; 
                	   }
                String endnum = Integer.toString(sum);
                txt3.setText((str3.substring(0,4)).toUpperCase()+endnum.substring(1,5));
            }
      });
		btn1.setBounds(42, 76, 138, 23);
		contentPane.add(btn1);
		
		JLabel lblObject = new JLabel("Object");
		lblObject.setBounds(44, 11, 46, 14);
		contentPane.add(lblObject);
		JLabel lblKey = new JLabel("Key");
		lblKey.setBounds(138, 11, 46, 14);
		contentPane.add(lblKey);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setIcon(null);
		btnExit.setBounds(165, 156, 60, 23);
		contentPane.add(btnExit);
		}

	protected int abs(int num3) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
}
