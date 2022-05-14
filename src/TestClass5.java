
public class TestClass5 {
	public void array() {
		int ar[] = { 1,2,2,3,4,5,6,3};
		System.out.println("Length of the array is " +ar.length);
		//System.out.println("Duplicate values in the array is");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				 if(ar[i] != ar[j])
				 {
					 System.out.print(ar[j]+ " ");
				 }
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass5 t = new TestClass5();
		t.array();
	}

}
