import java.util.Scanner;

public class Opclass {
    public void test() {
        System.out.println("too cold");
    }
    public int add(int x, int y) {
        int sum = x+y;
        return sum;
    }
    public static void main(String[] args){
        Scanner rd = new Scanner(System.in);
        System.out.print("From: ");
        int num1 = rd.nextInt();
        int num2 = rd.nextInt();


            Opclass oop = new Opclass();
            oop.test();
        int abc = oop.add(num1, num2);
             System.out.println(abc);
        }
    }

