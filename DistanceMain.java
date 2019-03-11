public class DistanceMain{
      public static void main(String[] args){

      Distance distance = new Distance();
      Distance distance1 = new Distance();

      distance.setDistance(4,5);
      distance1.setDistance(3,4);
      distance.displayDistance();
      distance1.displayDistance();

      Distance distance3;
      distance3 = distance.sum(distance1);
      distance3.displayDistance();



}




}