package patterns;

public class pattern19 {
    public static void main(String[] args) {
        int N=5;
        // initial spaces.
        int iniS = 0;
        for(int i=0;i< N;i++){

            //for printing the stars in the row.
            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }

            //for printing the spaces in the row.
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }

            iniS+=2;

            System.out.println();
        }

        // for lower half of the pattern

        // initial spaces.
        iniS = 2*N -2;
        for(int i=1;i<=N;i++){

            //for printing the stars in the row.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            iniS-=2;

            System.out.println();
        }
    }
}
