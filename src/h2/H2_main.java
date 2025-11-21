package h2;

public class H2_main {
    public static void main(String[] args) {
        int n = 299;
        int digits;
        int [] a = {0,0,0,0,0,0,0,0,0};

        digits = (int) Math.log10(n) + 1;


        for(int i = 0; i < digits; i++){
            a[(a.length - 1) - i] = n % 10;
            n = (int) n / 10;
        }
    }
}
