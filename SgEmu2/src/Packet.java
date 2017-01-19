import java.util.Random;
public class Packet {
public static String ev;

public static String ev() {   
while(true){	
	String end = Character.toString ((char) 20);
	int r1 = 1 + (int)(Math.random()*4);        //Receptora
	int r2=1 + (int)(Math.random()*12);         //Linea   
	String r22 = String.format("%02d", r2);     //Linea
	String [] arr = {"E60201000", "E13001021", "E13001003", "R13002002", "R13004010", "R40101022", "E30101000"};
	Random random = new Random();
	int select = random.nextInt(arr.length); 
		if(InitMenu.formato == 2){
			ev = "5"+r1+r22+" 18"+InitMenu.csid+arr[select]+end;
		    
		}
		else{
			ev = "50"+r1+"0"+r22+" 18"+InitMenu.csid+arr[select]+end;
		}	
		return ev;
}
}
}

					