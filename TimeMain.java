public class TimeMain{
 
      public static void main(String[] args){

      Time time1 = new Time();
      Time time2 = new Time();
      time1.setTime(24,5);
      time1.showTime();
      time2.setTime(21,7);
      time2.showTime();

      Time time3;
      time3=time1.addtime(time2);
      time3.showTime();

}




}