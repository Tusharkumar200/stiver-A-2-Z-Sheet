
class XOR_Operation_in_an_Array{

    public int xorOperation(int n, int start) {
        
        int ans=0;
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
             arr[i] = start+2*i;
            ans ^= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        XOR_Operation_in_an_Array obj = new XOR_Operation_in_an_Array();
        int n = 5; 
        int start = 0; 
        int result = obj.xorOperation(n, start);
        System.out.println("The XOR operation result is: " + result);
    }
}