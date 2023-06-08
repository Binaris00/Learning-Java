public class Ternary {
   public static void main(String[] args) {
      
      // I use a simple example about student exams

      int math_exam = 67;
      int spanish_exam = 98;
      int english_exam = 100;
      int japanese_exam = 52;

      // A simplified if-else statement called ternary with this structure:
      // (condition) ? true : false
      String math_corrector = (math_exam >= 70) ? "Approved" : "Reproved";
      String spanish_corrector = (spanish_exam >= 70) ? "Approved" : "Reproved";
      String english_corrector = (english_exam >= 70) ? "Approved" : "Reproved";
      String japanese_corrector = (japanese_exam >= 70) ? "Approved" : "Reproved";
      
      System.out.println("Math exam: " + math_corrector + "\n" + "Spanish exam: " + spanish_corrector + "\n" + 
      "English exam: " + english_corrector + "\n" + "Japanese Exam: " + japanese_corrector);


   }
}
