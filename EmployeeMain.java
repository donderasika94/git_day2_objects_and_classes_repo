public class EmployeeMain{
      public static void main(String[] args){
      
      Employee employee = new Employee(1748,"Aditi", 15000);
      employee.displayEmployeeDetails();
      System.out.println("Annual Basic Salary:"+employee.getAnnualBasicSalary());
      System.out.println("Monthly Gross Salary:"+employee.getMonthlyGrossSalary());
       System.out.println("Annual Gross Salary:"+employee.getAnnualGrossSalary());

     }



}