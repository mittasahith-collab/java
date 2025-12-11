import java.util.Scanner;
public class seventable {
    
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in); 
        int num=7;
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+mul(num,i));
        }
    }
    public static int mul(int a,int b){
        return a*b;
    }
    
}