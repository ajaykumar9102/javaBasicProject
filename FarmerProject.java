import java.util.*;
class Farmerrr{
    //static float ri;
    //static{ri=8.5f;}
    float ri=8.5f;
int pa;float td;float si;float amt;


    void inputt(){
        Scanner scan =new Scanner(System.in);
        System.out.println("please mention the principal required");
         pa=scan.nextInt();
        System.out.println("please mention the time duration");
         td=scan.nextInt();
        


    }void computte(){
        si=(pa*td*ri)/100;
        amt=si+pa;

        

    
    }void displayy(){
        System.out.println("si is="+si);
        System.out.println("amount is="+amt);

    }public class FarmerProjecttt{
        public static void main(String args []){
            Farmerrr f1= new Farmerrr();
            Farmerrr f2= new Farmerrr();
            f1.inputt();
            f1.computte();
            f1.displayy();
            f2.inputt();
            f2.computte();
            f2.displayy();
            //scan.close();


        }
    }
}