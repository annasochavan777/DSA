package sorting;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,5};
        for (int i = 1; i < arr.length; i++) {
            int j = i -1;
            int key = arr[i];
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        
    }
}
