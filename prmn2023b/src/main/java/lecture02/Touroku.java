package lecture02;
import java.net.SocketOption;
import java.util.Scanner;
public class Touroku {
    int in(String[][] x,int n){
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<n;i++){
            System.out.printf("%d個目の学籍番号を入力してください",i+1);
            x[0][i]=scan.next();

            System.out.println("パスワードを入力してください");
            x[1][i]=scan.next();
        }
        return n;
    }
}
