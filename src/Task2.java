import java.util.Scanner;

public class Task2 {
    static Scanner console;

    static float [] Input() {
        System.out.print("Enter size of an array: "); 
        int n = console.nextInt(); 
        float []array = new float[n]; 
        
        for (int i = 0; i < n; ++i){
            System.out.print("array["+i+"]= ");
            array[i] = console.nextFloat();
        }
        return array; 
    }

    static void Print(float[] array) { 
        for (int i = 0; i < array.length; i++){ 
            System.out.print(array[i] + " ");
        }  
    }

    static void Change(float []array) { 
        int firstN = -1, lastN = array.length - 1; 
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
        if (firstN == lastN) { 
            System.out.print("There is only one negative number in array: " + array[firstN]);
        } else if (firstN == 0) { 
            System.out.print("Array without any negative numbers! Array consists of all positive numbers.");
        } else { 
            for (int i = firstN; i <= lastN; i++){
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) { 
        console = new Scanner(System.in);
        float[] myArray=Input(); 
        System.out.println("Output array: "); 
        Print(myArray);
        System.out.println("");
        System.out.println("Values between first and last negative numbers: ");
        Change(myArray); 
    }
}
