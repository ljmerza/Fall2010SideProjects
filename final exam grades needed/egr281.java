public class egr281
{//28.3  24.8225  17.49
	public void egrGrade()
	{
		double testGrade = (95+89+99)/3;
		double projectGrade = 99.29;
		double quizGrade = 87.45;
		double finalExam = 0;
		double passingGrade = 89.50;

		double totalGrade = ((testGrade*.30)+(projectGrade*.25)+(quizGrade*.20)+(finalExam*.25));
		while(totalGrade < passingGrade)
		{
			finalExam = finalExam +.1;
			totalGrade = ((testGrade*.25)+(projectGrade*.30)+(quizGrade*.20)+(finalExam*.25));
		}
		totalGrade = (totalGrade * 100);
		finalExam = (finalExam * 100);

		int newGradeInt = (int)totalGrade;
		int finalGradeInt = (int)finalExam;

		double newGradeDouble = newGradeInt;
		double newFinalGradeDouble = finalGradeInt;

		double finalNewGrade = newGradeDouble/100;
		double finalFinalGrade = newFinalGradeDouble/100;

		System.out.println("the final grade would be: " + finalNewGrade);
		System.out.println("the final exam grade needed would be: " + finalFinalGrade);
	}
}