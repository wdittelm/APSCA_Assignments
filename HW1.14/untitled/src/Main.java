
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int i = 1;
        int n = 10000;
        while (i<n){
            sum = sum + (1.0/(i*i));
            i += 1;
        }
        System.out.println(sum);
        System.out.println(sum- ((Math.PI*Math.PI)/6));




    }

}