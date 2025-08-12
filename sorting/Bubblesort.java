package sorting;

public class Bubblesort {
    public static void main(String[] args) {
        int nums[] = { 5, 3, 2, 7, 8, 9, 10 };

        System.out.println("before sorting");
        for (int elem : nums) {
            System.out.print(elem + " ");
        }

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for (int elem : nums) {
            System.out.print(elem + " ");
        }

    }
}