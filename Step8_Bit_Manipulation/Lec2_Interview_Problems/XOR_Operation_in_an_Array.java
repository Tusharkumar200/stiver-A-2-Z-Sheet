
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
        
    }
}