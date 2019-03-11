
public class Telivision {   

    boolean state;  
    int channel; 
    int volume; 
    int newchannel;

            public Telivision(boolean state, int channel, int volume){

               this.state=state;
               this.channel=channel;
               this.volume=volume;
           }

              public void stateOn(){ 
                 state = true;   
           }
             
             public void stateOff(){
                  state = false; 
           }

             public void printStatus(){ 

                  System.out.println("The TV staus is On: " + "Channel: " + channel + " Volume: " + volume); 
           }

             public void increaseVolume(){

                   volume = volume + 3;
                   System.out.println("Increased Volume by 3 points:"+volume);
           }

              public void decreaseVolume(){

                    volume= volume - 2;
                    System.out.println("decreased Volume by 2 points:"+volume);
            }

              public void changeChannel(){
       
                     channel = channel + 1;
                     System.out.println("Next Channel:"+channel);                  
             }

}

