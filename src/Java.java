
public class Java {
	public void series() {
		int ar[] = { 11, 45, 8, 25, 8, 11 };
		System.out.println("Given array is");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("Duplicate values in the array is");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[j]);
				}

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java j = new Java();
		j.series();
	}

}
