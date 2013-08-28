import java.util.Scanner;
public class NeededExamGrade
{
	public static void main(String[] args)
	{
		egr281 egr = new egr281();
		chem110 chem = new chem110();

		System.out.println("EGR 281:");
		egr.egrGrade();
		System.out.println();
		System.out.println();

		System.out.println("CHEM 110:");
		chem.chemGrade();

		Scanner in = new Scanner(System.in);
		in.nextLine();
	}
}