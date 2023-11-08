package lecture02;
import java.util.Scanner;
public class pra2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("氏名を入力してください:");
        String name1 =scan.next();
        System.out.print("学籍番号を入力してください:b");
        int num = scan.nextInt();

        System.out.printf("氏名: %s  学籍番号: b%d",name1,num);
    }
}
