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

    static void Change(float []array) {
        Integer firstN = 0, lastN = array.length - 1;

        for (int i = 0; i < array.length; i++){
            if (array[i] < 0) {
                firstN = i;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--){
            if (array[i] < 0) {
                lastN = i;
                break;
            }
        }
        // isEmpty
        if (firstN == lastN) {
            System.out.println("There is only one negative number in array: " + array[firstN]);
        }
        else if (firstN == 0) {
            System.out.println("Array without any negative numbers! Array consists of all positive numbers.");
        }
        else {
            for (int i = firstN; i <= lastN; i++){
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        console = new Scanner(System.in);
        float[] myArray=Input();
        System.out.println("Output array: ");
        Print(myArray); 
        System.out.println("Values between first and last negative numbers: ");
        Change(myArray);
    }
}