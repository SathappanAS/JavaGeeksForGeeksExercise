package ArraysPracticeQuestions;
/**/
public class LargestElementinArray {

	public static void main(String[] args) {
		
		int a[]= {1, 8, 7, 56, 90};
		
		int max=a[0];

		
		int len = a.length;
		
		for(int i=1;i<len;i++) {
			
			  if (a[i] > max) {
	                max = a[i];
	            }
				
	
			
		}
		System.out.println(max);	
	}

}
