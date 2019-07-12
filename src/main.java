public class main {

	public static void main(String[] args) {

		Double[] nums = {4.2, 2.0, 3.1, 6.9, -1.28, 2.9, 6.6, 7.1, 9.9, 7.25, -3.1};
		Double largest = -Double.MAX_VALUE;
		Double secondLargest = -Double.MAX_VALUE;

		for(Double element : nums) {
			//System.out.println(element);
			if(element<=secondLargest) {
				continue;
			}
			if(element>largest) {
				secondLargest = largest;
				largest = element;
			} else if(element>secondLargest) {
				secondLargest = element;
			}
		}
		
		int outI = 0;
		int outJ = 1;
		Double minDif = Math.abs(nums[0]-nums[1]);
		for(int i = 0;i<nums.length;i++) {
			for(int j = 0;j<nums.length;j++) {
				Double dif = Math.abs(nums[j]-nums[i]);
				if(dif>minDif || i == j) {
					continue;
				}
				minDif = dif;
				outI = i;
				outJ = j;
			}
		}
		System.out.println("A m�sodik legnagyobb sz�m a(z) " + secondLargest);
		System.out.println("A legkisebb k�l�nbs�g a " +  (outJ+1) + ". �s a " + (outI+1) + ". sz�m k�z�tt van. Ez a k�t sz�m a(z): " + nums[outJ] + " �s a(z): " + nums[outI] + " amik k�l�nbs�ge: " + minDif);
	}

}
