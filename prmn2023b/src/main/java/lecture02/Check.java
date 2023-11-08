package lecture02;
import java.util.Scanner;
public class Check {
    int check(String[][] x,int n){
        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください");
        String gakuseki = scan.next();
        int t=-1;
        for(int i=0;i<n;i++){
            if(gakuseki.equals(x[0][i])){
                t=i;
            }
        }
        if(t<0){
            System.out.println("error!!");
            System.exit(0);
        }
        return t;
    }

    void check2(String[][] x,int n){
        Scanner scan =new Scanner(System.in);
        System.out.println("パスワードを入力してください");
        String pass = scan.next();

        if(x[1][n].equals(pass)){
            System.out.println("ログイン完了");
        }else{
            System.out.println("不正なアクセス");
            System.exit(0);
        }

    }
}
