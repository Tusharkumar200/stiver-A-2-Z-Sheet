import java.util.PriorityQueue;

class Connect_N_Ropes_With_Minimum_Cost{

     public static long connectRopes(int[] arr)
    {   int n = arr.length;long totalCost = 0;
        if(n == 1){
            return (long) 0;
        }
        PriorityQueue<Integer> ropes = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            ropes.add(arr[i]);
        }

        while(!ropes.isEmpty())
        {
            int minmumCost = 0;
            int fmin = ropes.poll();
            int smin = ropes.poll();
            minmumCost = fmin+smin;

            if(ropes.size()>=1){
            totalCost += (long)minmumCost;
            ropes.add(minmumCost);
            }
        else{
            totalCost+= (long)minmumCost;
        }
        }
        return totalCost;
    }
    public static void main(String args[]{

    }
}