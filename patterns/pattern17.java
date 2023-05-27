/*
   A
  ABA
 ABCBA
ABCDCBA
 */
package patterns;

public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            //actual value
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print((char)(ch));
                if(j <= breakpoint) ch++;
                else ch--;
            }

            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
