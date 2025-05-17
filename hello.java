import java.util.Scanner;
class hello{
    public static void main( String[] args){ 
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); 
        int x = sc.nextInt();
        System.out.println("The value of x is  "+x);
    }
}