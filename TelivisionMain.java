
import java.util.*;
public class TelivisionMain{
public static void main(String[] args) {
    Telivision tv = new Telivision (true,107,8);
    
    tv.stateOn();
    tv.stateOff();
    tv.printStatus();
    tv.increaseVolume();
    tv.decreaseVolume();
    tv.changeChannel();
    
   
    System.out.println("I will change the status of the television");
    tv.stateOff();
    System.out.println("The television is now Turned Off");
}
}
