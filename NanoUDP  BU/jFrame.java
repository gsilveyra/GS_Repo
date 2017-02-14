import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
public class jFrame extends JFrame {
private static final long serialVersionUID = 1L;
private JPanel contentPane;
public JTextArea textArea;
public static void ventana() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jFrame frame = new jFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public jFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(49, 62, 327, 153);
		contentPane.add(textArea);
	}
}
