package patterns;

public class pattern9 {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }

            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
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
