public class Add{
    int Add(int a,int b)
    {
        int z=a+b;
        return z;
        }   
         public static void main(String args[]){
            Add car = new Add();
            int k =car.Add(23,55);
            System.out.println(k);
        }
}