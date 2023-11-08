package lecture02;

public class Keisan {
    int sum(int u[]){
        int x=0;
        for(int j=0;j<5;j++){
            x+=u[j];
        }
        return x;
    }

    void judge(int num){
        if(num>=100){
            System.out.println("great!!");
        }else if(num>=50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
