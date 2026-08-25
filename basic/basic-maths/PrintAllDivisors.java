class Solution {
	public ArrayList<Integer> getDivisors(int n) {
		
		
		ArrayList<Integer> res = new ArrayList<>();// to store arraylist of divisors
		
		for (int i = 1; i*i <= n; i++) {   //i*i to reduce complexity
			if (n % i == 0) {
				res.add(i);
				
				if ((n / i) != i) {
					res.add(n/i);
				}
				
			}
		}
		
		Collections.sort(res);     // to sort arraylist
                return res;
	}	
}