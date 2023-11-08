package lecture02;
import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("何個の学籍番号とパスワードを入力しますか？(5個以上)");
        int n=scan.nextInt();
        String[][] x= new String[2][n];
        Touroku t =new Touroku();
        Check c = new Check();
        int k=t.in(x,n);
        int m=c.check(x,k);
        c.check2(x,m);
    }
}
