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

    public static int firstOccurrence(int[] arr, int n, int x) {
        
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
        
        int left = 0;
        int right = n - 1;
        int last = -1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == k){
                last = mid;
                left = mid +1;
            }
            else if(arr[mid] < k){
                left = mid +1;
            }
            else{
                right = mid - 1;
            }
        }

        return last;
    }

    public static int[] firstLastOccurrence(int []arr, int n, int x){
        int first = firstOccurrence(null, n, x);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurrence(null, n, x);
        return new int[] {first, last};
    }

    
    public static void main(String[] args) {
        int X = 2;
        int array[] = { 2, 2, 3, 3, 3, 3, 4 };
        int result = countOccurrence(array, X);
        System.out.println(result);
    }
}
