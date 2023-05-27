/*
ABCDE
ABCD
ABC
AB
A
 */
package patterns;

public class pattern15 {
    public static void main(String[] args) {
        int n=2;
        char ch = 'A';
        for (int i=n;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}
