public class ComplexMain{
   public static void main(String[] args){

   Complex c1 = new Complex();
   Complex c2 = new Complex();
   c1.setComplexNumbers(4,5);
   c2.setComplexNumbers(6,9);
   c1.displayComplexNumbers();
   c2.displayComplexNumbers();
   
   Complex c;
   c=c1.sum(c2);
   c.displayComplexNumbers();
}



}