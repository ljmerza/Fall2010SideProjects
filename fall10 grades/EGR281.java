public class EGR281
{
	private int numberOfProjects, numberofHWs, numberOfTests, numberOfQuizes;
	private double hwPercent, testPercent, projectPercent, finalPercent, quizPercent;
	private double projectGrade, testGrade, hwGrade, quizGrade, finalGrade;
	private double testAvg, hwAvg, projectAvg, quizAvg;
	private double totalGrade;
	private double totalPoints;

	public void getGrade()
	{
		// enter grading scale
		/********************************************************/
		totalPoints = 100;

		hwPercent = 0 / totalPoints;
		testPercent = 25 / totalPoints;
		projectPercent = 30 / totalPoints;
		finalPercent = 25 / totalPoints;
		quizPercent = 20 / totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfTests = 3;
		numberofHWs = 1;
		numberOfProjects = 15;
		numberOfQuizes = 19;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		testGrade = 89 + 99 + 95;
		hwGrade = 0;
		projectGrade = 100+100+100+100+110+105+95+100+100+80+100+100+100+100+100;
		quizGrade = (173.65) * 10;
		finalGrade = 98;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = (testGrade / numberOfTests);
		hwAvg = (hwGrade / numberofHWs);
		projectAvg = (projectGrade / numberOfProjects);
		quizAvg = (88.02);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = testAvg * testPercent;
		hwAvg = hwAvg * hwPercent;
		projectAvg = projectAvg * projectPercent;
		quizAvg = quizAvg * quizPercent;
		finalGrade = finalGrade * finalPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = testAvg + hwAvg + projectAvg + quizAvg  + finalGrade;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
