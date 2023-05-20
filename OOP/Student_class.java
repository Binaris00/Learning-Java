package OOP;

public class Student_class {
   
   String name;
   int age;
   int id;
   String description;
   String email;

   public void setInfo(String name, int age, int id, String description, String email) {
      this.name = name;
      this.age = age;
      this.id = id;
      this.description = description;
      this.email = email;
   }
   
   public String getStudentInfo(){
      return "Name: " + name + "\nAge: " + age + "\nID: " + id;
   }

   public String set_email(String email){
      return this.email = email;
   }

   public static void main(String[] args) {
      Student_class victor = new Student_class();
      victor.setInfo("Victor", 20, 1, "Student", "tzirw@example.com");
      System.out.println(victor.getStudentInfo());
   }
   
}