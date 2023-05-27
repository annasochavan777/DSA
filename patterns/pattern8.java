package patterns;

public class pattern8 {
    public static void main(String[] args) {
        int n=5;
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
