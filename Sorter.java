public class Sorter {
    public static void main(String[] args) {
    }

    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    
    public static void insertion_sort(int arr[]) {
        int n = arr.length;
        // loop for each iteration
        for (int i = 1; i < n; i++) {

            // storing value of arr[i] in key temporarily
            int key = arr[i];
            int j = i - 1;

            // Move all the elements to the right side of the key which are greater than key value.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void sort(int array){
        insertion_sort(array);
    }
} 
        