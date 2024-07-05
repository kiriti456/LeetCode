class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        Comparator<Integer> c = new Comparator<Integer>() { 
            @Override
            public int compare(Integer a, Integer b) { 
                if (a < b) 
                    return -1; 
                if (a == b) 
                    return 0; 
                return 1;
            } 
        }; 
        Queue<Integer> pq = new PriorityQueue<>(c); 
        for(int num : nums)
            pq.offer(num);
        int first = pq.poll();
        int count = 1;
        int min = -1*(int)(1e9+1);
        /*while (!pq.isEmpty()) { 
            int x = pq.poll();
            System.out.print(x+" ");
        }*/
        while (!pq.isEmpty()) { 
            int x = pq.poll();
            if(first+1 == x){
                first = x;
                count++;
            }
            else if(first == x){}
            else{
                count = 1;
                first = x;
            }
            if(min<count)
                min = count;
        }    
        return min;
    }
}