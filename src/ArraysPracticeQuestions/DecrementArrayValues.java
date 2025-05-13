package ArraysPracticeQuestions;

public class DecrementArrayValues {
	
	public static void arrayDecremental(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i] + " ");
		}
	
	}

	public static void main(String[] args) {
		int s[]= {54, 43, 2, 1, 5};
		
		
		DecrementArrayValues.arrayDecremental(s);
		

	}

}
