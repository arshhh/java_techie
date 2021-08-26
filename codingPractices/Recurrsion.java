package codingPractices;

class RecurrsionTest{
    public final int recurssion(int n){
        int val =0;
        if(n == 0){
            return 1;
        }
        else{
            val = n*recurssion(n-1);
        }
        return val;
    }
}

public class Recurrsion {
    public static void main(String[] args) {
        RecurrsionTest r = new RecurrsionTest();
        System.out.println(r.recurssion(5));
    }
}
