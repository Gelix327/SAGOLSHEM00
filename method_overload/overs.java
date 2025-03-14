import java.util.*;
public class overs {
    void sub(int a, int b){
        System.out.println("answer is"+(a- b));
    }
    void sub(int a, int b,int c){
      System.out.println("answer is"+(a- b - c));
    }
    public static void main(String args[]){
        overs cat = new overs();
        cat.sub(10,5);
        cat.sub(13,5,2);
    }
}
