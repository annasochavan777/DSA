package patterns;

public class pattern11 {
    public static void main(String[] args) {

        int a=0;
        for(int i=1;i<=5;i++)
        {
            if(i % 2 == 0)
                a = 0;
            else
                a=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a = 1 - a;
            }
            System.out.println();
        }
    }
}
