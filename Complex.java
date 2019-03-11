public class Complex{

        private double real;
        private double imaginary;

public void setComplexNumbers(double real, double imaginary){

        this.real=real;
        this.imaginary=imaginary;
      }
public void displayComplexNumbers(){

        System.out.println(real+ "+ i" +imaginary);

      }
public Complex sum(Complex c3){
       
       Complex csum = new Complex();
       csum.real = this.real + c3.real;
       csum.imaginary = this.imaginary + c3.imaginary;
       return csum;
         

      }


  }