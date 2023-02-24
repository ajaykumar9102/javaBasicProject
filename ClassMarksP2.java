import java.util.*;
public class ClassMarksP2 {
    public static void main(String args []){

    
    Scanner scan =new Scanner(System.in);
    System.out.println("enter total class");
    int totalClass=scan.nextInt();
    System.out.println("enter total stusent in each class");
    int totalStudent=scan.nextInt();
    int array[] []=new int[totalClass][totalStudent];
    for(int i=0;i<totalClass;i++){
        for(int j=0;j<totalStudent;j++){
            System.out.println("enetr marks of each student in each class");
            array[i][j]=scan.nextInt();
        }System.out.println();
    }System.out.println("following marks obtained by each student of each class which are");
    for(int k=0;k<totalClass;k++){
        for(int l=0;l<totalStudent;l++){
            System.out.print(array[k] [l]);
        }System.out.println();
    }
    }
}
