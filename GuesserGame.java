import java.util.*;
 class Guesser{
    int guessingNum(){
        Scanner scan =new Scanner(System.in);
        //scan.close();
        System.out.println("guesser kindly!guess a number");
        int guessingNum=scan.nextInt();
        return guessingNum;

    }}
    class Player{
        int pguessingNum () {
            int pguessingNum;
            Scanner scan =new Scanner(System.in);
           // scan.close();
            System.out.println("player kindly guess a number");
            pguessingNum=scan.nextInt();
             return pguessingNum;
        }

        }
      class Umpire{
        int takingNumFromGuesser;
        int takingNumFromPlayer1;
        int takingNumFromPlayer2;
        int takingNumFromPlayer3;
        void takingNumFromGuesser(){
          Guesser obj=new Guesser();
           takingNumFromGuesser=obj.guessingNum();
        }void  takingNumFromPlayer(){
          Player p1=new Player();
          Player p2=new Player();
          Player p3=new Player();
           takingNumFromPlayer1=p1.pguessingNum();
           takingNumFromPlayer2=p2.pguessingNum();
           takingNumFromPlayer3=p3.pguessingNum();

          

        }void compare(){
          if(takingNumFromGuesser==takingNumFromPlayer1){
            if(takingNumFromGuesser==takingNumFromPlayer2&&takingNumFromGuesser==takingNumFromPlayer3)
            {System.out.println(" game tied");
            
          }else if(takingNumFromGuesser==takingNumFromPlayer2){
            System.out.println("player1 and player2 won the game");
          }else if(takingNumFromGuesser==takingNumFromPlayer3){
            System.out.println("player3 and player 1 won the game");
        }else{
          System.out.println("player1 won the game");
        }}else if(takingNumFromGuesser==takingNumFromPlayer2){
          if (takingNumFromGuesser==takingNumFromPlayer3){System.out.println
            ("player2 and player3 won the game");
          }else{System.out.println
            ("player2  won the game");
            
          }

        }else if(takingNumFromGuesser==takingNumFromPlayer3){System.out.println
          ("player3 won the game");
      
        }else{
          System.out.println("you have lost the game");
        }}}
        
        
     public class GuesserGame {
    public static void main (String args []){
      System.out.println("game started");
      Umpire u=new Umpire();
      u.takingNumFromGuesser();
      u.takingNumFromPlayer();
      u.compare();
      

    }}
