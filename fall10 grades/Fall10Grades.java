import java.util.Scanner;

public class Fall10Grades
{
	public static void main(String[] args)
	{
		EGR281 egr = new EGR281();
		CHEM110 chem = new CHEM110();
		MAT140 mat = new MAT140();

		System.out.print("EGR281: ");
		egr.getGrade();
		System.out.print("CHEM110: ");
		chem.getGrade();
		System.out.print("MAT140: ");
		mat.getGrade();

		Scanner in = new Scanner(System.in);
		in.nextLine();

	}
}