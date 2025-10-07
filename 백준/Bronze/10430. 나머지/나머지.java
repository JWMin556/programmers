import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int cal1 = (a+b)%c;
        int cal2 = ((a%c) + (b%c)) % c;
        int cal3 = (a*b)%c;
        int cal4 = ((a%c) * (b%c)) % c;
        System.out.println(cal1);
        System.out.println(cal2);
        System.out.println(cal3);
        System.out.println(cal4);
    }
}