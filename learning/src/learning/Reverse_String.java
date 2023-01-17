package learning;

public class Reverse_String {
	public static void main(String[] args) {
		String name="deepak";
		char[] eachchar=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(eachchar[i]);
		}
	}

}
