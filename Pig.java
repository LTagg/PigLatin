import java.util.Scanner;
public class Pig {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		String SE ="";
		String[] v;
		System.out.print("Type your freaking words ");
		SE = input.nextLine();//Advances this scanner, returns the skipped input
		v = SE.split(" "); //divides sentence into multiple words
		for (String word : v) {
			if (word.startsWith("aeiouAEIOU")){
				System.out.print(word + " ay "); }
			else 
				System.out.print(word.substring(1)+word.substring(0,1)+"ay ");
			input.close();
		}
	}
}
