import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) 
    {
        int c=0;
        if (p==1||p==n)
            c=0;
        else if (((n-p)==1)&&(n%2!=0))
            c=0;
        else if (((n-p)==1)&&(n%2==0))
            c = c+1;
        else if (p==2||p==3)
            c= c+1;
        else if (p>3 && p<(n-1))
        {
            if ((n-p)<(p-0))
                c = (int)(Math.ceil(((n-p))/2));
            else if ((n-p)>(p-0))
                c = (int)(Math.ceil(p/2));
            else if ((n-p)==(p-0))
                c = (int)(Math.ceil(n/2));
        }
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
