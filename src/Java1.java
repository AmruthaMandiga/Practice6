
public class Java1 {
	public void reverse() {
		String s="AMRUTHA";
		char c[]=s.toCharArray();
		System.out.println("Reversed array is");
		for(int i=s.length();i>0;i--)
		{
			System.out.println(c[i-1]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Java1 j=new Java1();
j.reverse();
	}

}
