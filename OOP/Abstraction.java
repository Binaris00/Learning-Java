package OOP;

abstract class Student_class{

   abstract String[] getstudents();
   abstract String getteacher();
   abstract void setteacher(String teacher);
}



class Class_91 extends Student_class{

   String[] students = {"Javier", "John", "Mateo", "Juan"};
   String teacher = "Robert";

   String[] getstudents(){return students;}

   String getteacher(){return teacher;}

   void setteacher(String teacher){this.teacher = teacher;}


}


public class Abstraction {
   
}
