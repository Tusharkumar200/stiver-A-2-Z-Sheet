package Easy;
class Move_all_Zeros_to_the_end_of_the_array_Optimal_Approach {

    public static int[] moveZeros(int n, int[] a) {

        int j = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return a;

        // swap

        for (int i = j + 1; i < n; i++) {

            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }



        return a;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        int n = arr.length;
        // moveZeros(n, arr);

        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");

    }
}