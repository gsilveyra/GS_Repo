import java.util.Scanner;


public class InitMenu {
public static String csid = "";
public static  int demora;
public static  int formato;
public static String port;
public static int portfin;
public static void menu() {
	
    ///// FORMATO SURGARD  _  NANO
	String in = "";
	System.out.println("Selecciones formato: \n 1 - Surgard \n 2 - RV Nano");
	System.out.print("==>");
	@SuppressWarnings("resource")
	Scanner entradaEscaner = new Scanner (System.in); 
	in = entradaEscaner.nextLine ();
	formato = Integer.parseInt(in);
	/////
	
	//// INGRESO DELAY ENTRE EVENTOS
	String de = "";
	System.out.print("Ingrese Delay  [segs] =>");
	@SuppressWarnings("resource")
	Scanner entradaDelay = new Scanner (System.in); 
	de = entradaDelay.nextLine ();
	demora = (Integer.parseInt(de)*1000);
	////
	
	////  INGRESO CSID	
	System.out.print("Ingrese  CSID =>");
	@SuppressWarnings("resource")
	Scanner entradaCsid = new Scanner (System.in); 
	csid = entradaCsid.nextLine ();
	////
	
    ////INGRESO PUERTO	
	
	System.out.print("Ingrese  Puerto =>");
	@SuppressWarnings("resource")
	Scanner puerto1 = new Scanner (System.in); 
	port = puerto1.nextLine ();
	portfin = Integer.parseInt(port);
	////
}
}
