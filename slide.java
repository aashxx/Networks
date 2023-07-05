public class slide {
    static int maxSum(int arr[],int k) {
        int n = arr.length;
        if(n<k) {
            System.out.println("Invalid");
            return -1;
        }
        int window_sum = 0;
        for (int i = 0; i < n; i++) {
            window_sum+=arr[i];
        }
        int max_sum = window_sum;
        for (int i = k; i < n; i++) {
            window_sum+=(arr[i]-arr[i-k]);
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int k = 3;
        int arr[] = {16,12,9,19,11,8};
        System.out.println(maxSum(arr, k));
    }
}