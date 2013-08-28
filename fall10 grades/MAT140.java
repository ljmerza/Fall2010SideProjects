public class MAT140
{
	private int numberOfProjects, numberofHWs, numberOfTests, numberOfQuizes, numberOfLabs;
	private double hwPercent, testPercent, projectPercent, finalPercent, quizPercent, labPercent;
	private double projectGrade, testGrade, hwGrade, quizGrade, finalGrade, labGrade;
	private double testAvg, hwAvg, projectAvg, quizAvg, labAvg;
	private double totalGrade;
	private double totalPoints;

	public void getGrade()
	{
		// enter grading scale
		/********************************************************/
		totalPoints = 80;

		hwPercent = 20 / totalPoints;
		testPercent = 60 / totalPoints;
		projectPercent = 0 / totalPoints;
		finalPercent = 0 / totalPoints;
		quizPercent = 0 / totalPoints;
		labPercent = 0 / totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes - need min of 1
		/********************************************************/
		numberOfTests = 5;
		numberofHWs = 6;
		numberOfProjects = 1;
		numberOfQuizes = 1;
		numberOfLabs = 1;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		testGrade = 100+100+76.9+72.7+98.9;
		hwGrade = 96.8+98.1+99.3+100+100+89.2;
		projectGrade = 0;
		quizGrade = 0;
		labGrade = 0;
		finalGrade = 0;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = (testGrade / numberOfTests);
		hwAvg = (hwGrade / numberofHWs);
		projectAvg = (projectGrade / numberOfProjects);
		quizAvg = (quizGrade / numberOfQuizes);
		labAvg = (labGrade / numberOfLabs);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = testAvg * testPercent;
		hwAvg = hwAvg * hwPercent;
		projectAvg = projectAvg * projectPercent;
		quizAvg = quizAvg * quizPercent;
		labAvg = labAvg * labPercent;
		finalGrade = finalGrade * finalPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = testAvg + hwAvg + projectAvg + quizAvg  + labAvg + finalGrade;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
