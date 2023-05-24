package OOP;

//Simple example about polymorphism with shapes


class Shape{
   public double findArea(int x, int y){
      return 1;
   }
}

class Triangle extends Shape{
   public double findArea(int base, int height){
      return 1.0/2.0 * height * base;
   }

}

class Circle extends Shape{
   public double findArea(int radius){
         return (3.14 * radius * radius);
      }
}

class Rectangle extends Shape{
   public double findArea(int base, int height){
      return (base * height);
   }
}

class Square extends Rectangle{
   public double findArea(int side){
      return (side * side);
   }
}


public class Polymorphism {
   public static void main(String[] args) {
      Triangle triangles = new Triangle();
      System.out.println(triangles.findArea(12, 19));  

      Circle circles = new Circle();
      System.out.println(circles.findArea(5));

      Rectangle rectangles = new Rectangle();
      System.out.println(rectangles.findArea(12, 19));

      Square squares = new Square();
      System.out.println(squares.findArea(5));
   }
}
