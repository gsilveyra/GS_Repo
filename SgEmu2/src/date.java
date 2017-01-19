import java.text.SimpleDateFormat;
import java.util.Date;
public class date{

public static String dateinf() {
	Date date = new Date();
	SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyy_HHmm");
	String formattedDate2 = sdf2.format(date);
	return  formattedDate2;  //Date en formato nombre archivo
}
public static String dateinf2() {
	Date date = new Date();
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	String formattedDate2 = sdf2.format(date);
	return  formattedDate2;  //Date en formato log 
}
}