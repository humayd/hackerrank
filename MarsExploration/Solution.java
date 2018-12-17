import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) 
    {
        int l,i,z=0;char a,b,c;
        l = s.length();
        for (i=0;i<l;i=i+3)
        {
            a = s.charAt(i);
            b = s.charAt(i+1);
            c = s.charAt(i+2);
            if (a!='S')
                z++;
            if (b!='O')
                z++;
            if (c!='S')
                z++;
        }
        return z;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
