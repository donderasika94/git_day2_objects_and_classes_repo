public class Distance{

      private int feet;
      private double inches;

public void setDistance(int feet, double inches){

      this.feet=feet;
      this.inches=inches;
     } 
public void displayDistance(){
      System.out.println(feet+ " Feet + " +inches + " Inches");
    } 
public Distance sum(Distance d){
       Distance dsum = new Distance();
       dsum.feet = this.feet + d.feet;
       dsum.inches = this.inches + d.inches;
       return dsum;

}


}