import java.io.File;

public class Princ {
public static void main(String[] args) throws InterruptedException {
		
File file = new File("C:\\sg3_emu");
    if (!file.exists()) {
	    if (file.mkdir()) {
			System.out.println("Log en c:\\sg3_emu");
		} else {
			System.out.println("Failed to create directory!");
		}
    }		  	 
	
InitMenu.menu();   

new Thread(new Connect()).start();



}
}
