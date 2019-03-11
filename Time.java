public class Time {
      private int hours;
      private int minutes;

       public void setTime(int hours, int minutes){
            this.hours=hours;
            this.minutes=minutes;
            }
       public void showTime(){
            System.out.println(hours+ " Hours And " +minutes+ " Minutes");
            }
       public Time addtime(Time t){
            Time time = new Time();
            time.hours = this.hours + t.hours;
            time.minutes = this.minutes + t.minutes;
            return time;
            }


     }