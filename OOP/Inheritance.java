package OOP;

//I use the class Student class like a base class
class University_Student extends Student_class{
   int pendient_credits;
   String teacher;

   public University_Student(int pendient_credits, String teacher){
         this.pendient_credits = pendient_credits;
         this.teacher = teacher;
      }
   public void paycredits(int credit){
      this.pendient_credits += credit;
   }

   public void setteacher(String teacher){
      this.teacher = teacher;
   }

   public String getteacher(){
      return this.teacher;
   }

   public int getcredits(){
      return this.pendient_credits;
   }
}

public class Inheritance{
   public static void main(String[] args) {
      University_Student student = new University_Student(10, "Robert");
      System.out.println(student.getcredits());
   }
}