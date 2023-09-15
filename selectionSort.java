import java.util.Random;
/*
 * Selection sort class that takes fraction array as an input
 * 
 * @author Jere Perisic
 * @version September 15, 2023
 */
public class selectionSort {

    public static Fraction[] sort(Fraction[] arr){
        for(int i = 0; i< arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int swap = arr[min];
                arr[min]=arr[i];
                arr[i]=swap;
            }

        }
        return arr;
    }
}

