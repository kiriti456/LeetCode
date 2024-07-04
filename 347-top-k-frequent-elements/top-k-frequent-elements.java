class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }
            else
                map.put(nums[i],map.get(nums[i])+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (b,a) -> a.getValue() - b.getValue()
        );
        
        pq.addAll(map.entrySet());
        int ans[] = new int[k];
        for(int i=0; i<k;i++)
            ans[i] = pq.poll().getKey();
        return ans;
    }
}