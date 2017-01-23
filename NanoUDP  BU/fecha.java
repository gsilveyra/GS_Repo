import java.text.SimpleDateFormat;
import java.util.Date;
public class fecha{

public static String dateinf() {
	Date date = new Date();
	SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
	String formattedDate2 = sdf2.format(date);
	return  formattedDate2; 
}

public static String dateinf2() {
	Date date = new Date();
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy-hh:mm:ss");
	String formattedDate2 = sdf2.format(date);
	return  formattedDate2; 
}

}