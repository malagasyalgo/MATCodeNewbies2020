public int [][] partitionArray(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    for(int i = 0; i < 3; i++) {
    	result.add(new ArrayList<Integer>());
    }
    	
    for(int i = 0; i < nums.length; i++) {
    	if(nums[i] % 2 == 0) {
    		result.get(0).add(nums[i]);
    	} else if (nums[i] % 3 == 0) {
    		result.get(1).add(nums[i]);
    	} else {
    		result.get(2).add(nums[i]);
    	}
    }
    return result.stream().map(x -> x.stream().mapToInt(Integer::intValue).toArray()).toArray(int [][]::new);
}
