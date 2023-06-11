public class SortColors {
    public static void sortColors(int[] nums) {
        int p1 = 0;
        int i = 0;
        int p3 = nums.length-1;
        while(i <= p3){
            int num = nums[i];
            if(num == 0){
                swap(i,p1,nums);
                p1++;
            }else if(num == 2){
                swap(p3,i,nums);
                p3--;
                continue;
            }
            i++;
        }
    }
    public static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int n = 6;
        int arr[] = {0, 2, 1, 2, 0, 1};
        sortColors(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
