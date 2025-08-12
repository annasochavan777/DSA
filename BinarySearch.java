public class BinarySearch {
    public static int BinarySearch(int arr[],int target)
    {
        int left = 0,right = arr.length - 1;
        while (left<=right)
        {
            int mid = (left + right) /2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,6,8,9,11,13,17};

        int response = BinarySearch(arr,17);
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