import java.util.Random;  
import java.util.Scanner;
public class miniproject{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rc = new Random();
        int sai=rc.nextInt(1000);
        int suswaran=rc.nextInt(1000);
        int vrushank=rc.nextInt(1000);
        int sahith=rc.nextInt(1000);
        System.out.print("Enter your age to vote: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote.");
            System.out.println("Candidates List");
            System.out.println("1. Sai");
            System.out.println("2. Suswaran");
            System.out.println("3. Vrushank");
            System.out.println("4. Sahith");
            System.out.println("");
            System.out.print("Enter the candidate number you want to vote for: ");

            int vote=sc.nextInt();
            if(vote==1){
                sai++;
                System.out.println("Your voting is successful!");
            }
            else if(vote==2){
                suswaran++;
                System.out.println("Your voting is successful!");
            }
            else if(vote==3){
                vrushank++;
                System.out.println("Your voting is successful!");
            }
            else if(vote==4){
                sahith++;
                System.out.println("Your voting is successful!");
            }
            else{
                System.out.println("Invalid candidate number.");
            }
         }
        else{
            System.out.println("You are not eligible to vote.");
        }
        System.out.println("Voting Results:");
        System.out.println("Total votes for Sai: " + sai);
        System.out.println("Total votes for Suswaran: " + suswaran);
        System.out.println("Total votes for Vrushank: " + vrushank);
        System.out.println("Total votes for Sahith: " + sahith);

        if(sai>suswaran && sai>vrushank && sai>sahith){
            System.out.println("Sai is the winner!!");
        }
        else if(suswaran>sai && suswaran>vrushank && suswaran>sahith){
            System.out.println("Suswaran is the winner!!");
        }
        else if(vrushank>sai && vrushank>suswaran && vrushank>sahith){
            System.out.println("Vrushank is the winner!!");
        }
        else if(sahith>sai && sahith>suswaran && sahith>vrushank){
            System.out.println("Sahith is the winner!!");
        }
        else{
            System.out.println("It's a tie!");
        }
    }
}