public class Employee{
    
      private int employeeId;
      private String employeeName;
      private double monthlyBasicSalary;
     double hra = 0.5 * monthlyBasicSalary;
     double medicalAllownce = 1250;
     double conveyanceAllownce = 800;
     
public Employee(){
         }
public Employee(int employeeId, String employeeName, double monthlyBasicSalary){
 
             this.employeeId = employeeId;
             this.employeeName = employeeName;
             this.monthlyBasicSalary = monthlyBasicSalary;
         }
public void displayEmployeeDetails(){
             System.out.println("Employee Id:"+employeeId);
             System.out.println("Employee Name:"+employeeName);
             System.out.println("Monthly Basic Salary:"+monthlyBasicSalary);
         }
public double getAnnualBasicSalary(){
       
         return 12 * monthlyBasicSalary; 
         }
public double getMonthlyGrossSalary(){

        
         return monthlyBasicSalary + hra + medicalAllownce + conveyanceAllownce;
         }
public double getAnnualGrossSalary(){

         return 12 * getMonthlyGrossSalary();
        }
public double getMonthlyDeductions(){


        }






}