import java.util.Scanner;

public class A {

    public static void main(String[] args){
        // read input data from console
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // numbers of dishes in canteen
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt(); // price of i-th dish
        }
        int q = in.nextInt(); // numbers of days
        int m[] = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = in.nextInt(); // amount of money at i-th day
        }
        in.close();

        // processing solution
        for (int i = 0; i < q; i++) {
            int k = 0; // number of dishes
            for (int j = 0; j < n; j++) {
                if (x[j] <= m[i] * 2) {
                    k++;
                }
            }
            System.out.println(k); // write solution on new line
        }
    }
}
