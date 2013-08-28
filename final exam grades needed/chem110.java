public class chem110
{
	public void chemGrade()
	{//24.9
		double labGrade = 99.60;
		double finalGrade = 0;
		double testGrade = ((90.5+91+78+88.5+3.5+finalGrade)/5);
		double passingGrade = 89.50;

		while (((labGrade *.25) + (testGrade * .75)) < passingGrade)
		{
			finalGrade = finalGrade + .1;
			testGrade = ((90.5 + 91 + finalGrade + 88.5 + 3.5 + finalGrade)/5);
		}
		double newGrade = ((labGrade *.25)+(testGrade * .75));

		newGrade = (newGrade * 100);
		finalGrade = (finalGrade *100);

		int newGradeInt = (int)newGrade;
		int finalGradeInt = (int)finalGrade;

		double newGradeDouble = newGradeInt;
		double newFinalGradeDouble = finalGradeInt;

		double finalNewGrade = newGradeDouble/100;
		double finalFinalGrade = newFinalGradeDouble/100;

		System.out.println("the final grade would be: " + finalNewGrade);
		System.out.println("the final exam grade needed would be: " + finalFinalGrade);
	}
}