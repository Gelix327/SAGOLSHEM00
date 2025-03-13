

public class program {
    void add(int n,int b){
        int num=n+b;
        System.out.println(num);
    }  
    void sub(int m,int u){
        int z= m-u;
        System.out.println(z);
    }
    void multi(int p,int q){
        int v=p*q;
        System.out.println(v);
    }
    void div(int t,int y){
        int w=t%y;
        System.out.println(w);
    }
    public static void main(String[] args) {
        program car =new program();
        car.add(12,22);
        car.sub(10,5);
        car.multi(6,9);
        car.div(100,5);
    }
}
