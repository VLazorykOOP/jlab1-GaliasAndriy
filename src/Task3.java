import java.util.Scanner;

public class Task3 {
    //Scanner console = new Scanner(System.in);
    static Scanner console;

    static float [][] InputArr_A (int n){
        float A[][] = new float[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.println("A["+i+", "+j+"]= ");
                A[i][j] = console.nextInt();
            }
        }
        return A;
    }

    static float [][] InputArr_B (int n){
        float B[][] = new float[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.println("B["+i+", "+j+"]= ");
                B[i][j] = console.nextInt();
            }
        }
        return B;
    }

    static float[] BuildVectorX (float[][] A, float[][] B, int n) {
        float[] X = new float[n];
        int countA = 0, countB = 0, countRes = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (A[i][j] < 0) countA++;
                if (B[i][j] < 0) countB++;
            }
            if (countA == countB && countA != 0) {
                countRes = 1; // it means that we found string in both arrays, where amount of negative numbers is equal
            } else {
                countA = countB = 0;
            }
        }
        
        if (countRes == 1){
            for (int i = 0; i < n; i++)
                X[i] = 1;
        } else {
            for (int i = 0; i < n; i++)
                X[i] = 0;
        }

        System.out.println("Vector X["+n+"]: ");
        for (int i = 0; i < n; i++)
            System.out.println(X[i] + " ");

        return X;
    }

    static void Print(float[][] A) {
        for (int i = 0; i < A.length; ++i, System.out.println()) 
            for (int j = 0; j < A[i].length; ++j)
                System.out.println(A[i][j]+"\t");
    }

    public static void main(String[] args) {
        console = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Enter size for two arrays: ");
            n = console.nextInt();
        } while (n > 0 && n > 20);

        float[][] A=InputArr_A(n);
        System.out.println("Output array A: ");
        Print(A); 
        float[][] B=InputArr_B(n);
        System.out.println("Output array B: ");
        Print(B); 
        float[] X=BuildVectorX(A, B, n);
    }
}