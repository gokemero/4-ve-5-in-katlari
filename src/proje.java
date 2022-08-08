import java.util.Scanner;

public class proje {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int x = input.nextInt();
        int i = 1;
        int t = 1;
        System.out.println("4'ün katları :");
        while(i <= x){
            System.out.println(i);
            i *=4;
        }
        System.out.println("5'in katları :");
        while(t<= x){
            System.out.println(t);
            t *=5;
        }


    }
}
