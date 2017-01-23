import java.util.Timer;
import java.util.TimerTask;

public class Tempo extends Thread {
public Timer timerAck;	
public void ack(){
	timerAck =new Timer();
	timerAck.schedule(new TimerTask(){
	    public void run() {
            //ejecuta
    }
}
, 1000);  
}
}
