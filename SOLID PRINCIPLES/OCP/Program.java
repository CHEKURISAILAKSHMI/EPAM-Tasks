
abstract class Employee
 {
     public int ID;
     public String Name;
    
     public Employee()
     {
     }
     public Employee(int id, String name )
     {
         this.ID = id; 
         this.Name = name; 
     }
     public void display(){
         System.out.println("Employee ID: "+ID+"Name :"+ Name);
     }
     abstract void CalculateBonus(float salary);
 }

  class PermanentEmployee extends  Employee
 {
     public PermanentEmployee()
     { }

     public PermanentEmployee(int id, String name)
     {
         this.ID = id;
         this.Name = name;

      }
     public void  CalculateBonus(float salary)
     {
         super.display();
         System.out.println(salary * 0.08);
     }
 }

 class TemporaryEmployee extends Employee
 {
     public TemporaryEmployee()
     { }

     public TemporaryEmployee(int id, String name) 
     { 
         this.ID= id;
         this.Name = name; 
      }
     @Override
     public void  CalculateBonus(float salary)
     {
        super.display();
         System.out.println(salary * 0.06);
     }
}
 public class Program
 {
     public static void main(String[] args)
     {
         Employee empJohn = new PermanentEmployee(1, "John"  );
         empJohn.CalculateBonus(20000);
         Employee empJason = new TemporaryEmployee(2, "Jason" );
         empJason.CalculateBonus(20000);
     }

    
 }