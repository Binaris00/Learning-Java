package Random;

import java.util.Scanner;

public class Tictactoe {
   // This start with 0 so the board index is 0-8 no 1-9 
   static String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
   static Scanner scanner = new Scanner(System.in);
   
   // To determine when a player win
   static boolean x_win = false;
   static boolean o_win = false;

   
   public static String printBoard(){
      // I don't want to repeat this print in all the code...
      return board[0] + "|" + board[1] + "|" + board[2] + "|" + "\n" + 
      board[3] + "|" + board[4] + "|" + board[5] + "|" + "\n" +
      board[6] + "|" + board[7] + "|" + board[8] + "|";
   }

   public static boolean noWinners(){

      // Rows wins
      for (int i = 0; i < 8; i += 3){
         if (board[i] == "X" && board[i+1] == "X" && board[i+2] == "X"){
            x_win = true;
            return false;
         }

         else if (board[i] == "O" && board[i+1] == "O" && board[i+2] == "O"){
            o_win = true;
            return false;
         }
      }

      
      // Columns wins
      for (int i = 0; i < 2; i++){
         if (board[0+i] == "X" && board[3+i] == "X" && board[6+i] == "X"){
            x_win = true;
            return false;
         }

         else if (board[0+i] == "O" && board[3+i] == "O" && board[6+i] == "O"){
            o_win = true;
            return false;
         }
      }

      // Diagonal wins
      if (board[0] == "X" && board[4] == "X" && board[8] == "X"){
         x_win = true;
         return false;
      }
      else if (board[2] == "X" && board[4] == "X" && board[6] == "X"){
         x_win = true;
         return false;
      }

      else if (board[0] == "O" && board[4] == "O" && board[8] == "O"){
         o_win = true;
         return false;
      }

      else if (board[2] == "O" && board[4] == "O" && board[6] == "O"){
         o_win = true;
         return false;
      }
      // For continue the loop
      return true;
   }

   public static void main(String[] args) {
      System.out.println("Welcome to tictactoe game in java!!");
      System.out.println("To play, you only need to put the number of the space you want to select");
      System.out.println("0" + "|" + "1" + "|" + "2" + "|" + "\n" + 
      "3" + "|" + "4" + "|" + "5" + "|" + "\n" +
      "6" + "|" + "7" + "|" + "8" + "|" + "\n");


      while(noWinners()){
         try {

            ///////////////////////////////////////////////// 
            //X turn
            ///////////////////////////////////////////////// 
            System.out.println(printBoard());
            System.out.println("X: What space you want to select? ");
            String x_option = scanner.nextLine();


            // if the selected space is not empty (X)
            if (board[Integer.parseInt(x_option)] != " "){break;} else{board[Integer.parseInt(x_option)] = "X";}
            System.out.print("\033[H\033[2J"); //Clear console
            if (noWinners() == false){break;}



            ///////////////////////////////////////////////// 
            // O turn
            ///////////////////////////////////////////////// 
            System.out.println(printBoard());
            System.out.println("O: What space you want to select? ");
            String o_option = scanner.nextLine();
            

            // if the selected space is not empty (O)
            if (board[Integer.parseInt(o_option)] != " "){break;} else {board[Integer.parseInt(o_option)] = "O";}
            System.out.print("\033[H\033[2J"); //Clear console

           } 
         catch (NumberFormatException e) {
            System.out.println("You don't write a valid number, please try again with a number 1-9");
            System.out.println(e.getMessage());
            break;
            }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You write a number mayor of 9, please try again with a number 1-9");
            System.out.println(e.getMessage());
            break;
         }
         catch (Exception e) {
            System.out.println("Error");
      }

      }

      if (x_win){System.out.println("X win!!!!!!");} else if (o_win){System.out.println("O win!!!!!!!");}
      
      
   }
}
