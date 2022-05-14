
public class TestClass2 {
	public void array() {
		int ar[] = { 11, 8, 55, 25, 12, 60, 32 };
		int temp = 0;
		System.out.println("The length of the array is  " + ar.length);
		System.out.println("ELements in the array is ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if (ar[i]<ar[j])
						{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
						}
			}
		}
		System.out.println();
		System.out.println("ELements of array after sorting is ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass2 t = new TestClass2();
		t.array();
	}

}
