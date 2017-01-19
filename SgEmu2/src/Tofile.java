import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tofile {
    public static void log(String message)  { 
      PrintWriter out = null;
      File namefile = new File("c://sg3_emu/LOG.txt");
     
	try {
		out = new PrintWriter(new FileWriter(namefile, true), true);
	} catch (IOException e) {
		System.out.println("void");
		e.printStackTrace();
	}
      out.write(message);
      out.close();
    }
}

//hola mundsaas//