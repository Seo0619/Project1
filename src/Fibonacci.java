import java.util.ArrayList;

public class Fibonacci {
    ArrayList<Integer> f;
    Fibonacci(int s1, int s2){
        f = new ArrayList<>();
        f.add(s1);
        f.add(s2);
    }
    void printF(int n){
        for(int i = 0;i < n;i++){
            int a = f.get(f.size() - 2);
            int b = f.get(f.size() - 1);

            f.add(a + b);
        }

        for(Integer i : f){
            System.out.println(i);
        }
    }
}
