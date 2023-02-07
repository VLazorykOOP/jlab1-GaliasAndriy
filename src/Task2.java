import java.util.Scanner;

public class Task2 {
    //Scanner console = new Scanner(System.in);
    static Scanner console;

    static float [] Input() {
        System.out.println("Enter size of an array: ");
        int n = console.nextInt();
        float []array = new float[n];
        
        for (int i = 0; i < n; ++i){
            System.out.println("array["+i+"]= ");
            array[i] = console.nextFloat();
        }
        return array;
    }

    static void Print(float[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }  
        System.out.println();
    }

    public static void main(String[] args) {
        console = new Scanner(System.in);
        float[] myArray=Input();
        System.out.println("Output array: ");
        Print(myArray); 
    }
}