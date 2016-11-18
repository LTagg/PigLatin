import java.util.Scanner;
public class Pig {

	public static void main(String[] args)
	{
		System.out.println("Enter sentence or word: ");
		Scanner scanner = new Scanner(System.in);

		String firstVowelThing = scanner.nextLine();
		{
			String first = firstVowelThing.substring(0,1);
			String slice = firstVowelThing.substring(1,firstVowelThing.length());
			System.out.println(slice + first + "ay");
			scanner.close();
		}
	}
}	