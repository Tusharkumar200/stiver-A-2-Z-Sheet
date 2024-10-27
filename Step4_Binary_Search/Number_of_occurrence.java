public class Number_of_occurrence {

    public static int countOccurrence(int arr[], int x) {
        // *linear search

        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }

        return count;
    }
    // * binary search

    public static int firstOccurrence(int[] arr, int n, int k) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int first = -1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == x) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {

                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int k) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int first = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
        }
    }

    public static void main(String[] args) {
        int X = 2;
        int array[] = { 2, 2, 3, 3, 3, 3, 4 };
        int result = countOccurrence(array, X);
        System.out.println(result);
    }
}
