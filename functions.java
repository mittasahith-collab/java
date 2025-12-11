public class functions {
     
    public static void main(String[] args) {
        System.out.println(add(3,2));
        System.out.println(multiply(3,2));
        System.out.println(divide(6,2));
        System.out.println(subtract(3,2));
    }
    public static int add(int a , int b) {
        return a+b;
    }
    public static int multiply(int a , int b) {
        return a*b;
}
    public static int divide(int a , int b) {
        return a/b;
    }
    public static int subtract(int a , int b) {
        return a-b;
    }
}