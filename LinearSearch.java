public class LinearSearch {
    public static int LinearSearch(int arr[],int target)
    {
        for (int i =0;i<arr.length;i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,6,8,9,11,13,17};

        int response = LinearSearch(arr,17);
        if (response != -1)
        {
            System.out.println("Element found at "+response + " array position");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}