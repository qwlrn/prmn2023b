package lecture02;

public class Login {
    String name;
    int num;
    Login(String x,int y){
        name=x;
        num=y;
    }

    void message(String name_n,int num_n){
        if(name.equals(name_n)){
            if(num==num_n){
                System.out.println("ログイン成功");
            }
        }else{
            System.out.println("ログイン失敗");
        }
    }
}
