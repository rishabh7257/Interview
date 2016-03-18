import java.util.Scanner;

public class Candy {
    public static int candies(int[] c , int n){
        if(n<1)
            return 0;
        int out =0;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=1;
        }
        for(int i=1;i<n;i++){
            if(c[i-1]<c[i]){
                temp[i] = temp[i-1]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(c[i-1]>c[i]){
                temp[i-1]= Math.max(temp[i-1] , temp[i]+1);
            }
        }
        for(int i=0;i<n;i++){
            out += temp[i];
        }
        return out;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            c[i]=s.nextInt();
        }
        int out = candies(c,n);
        System.out.println(out);
    }
}