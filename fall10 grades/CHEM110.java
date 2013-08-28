public class CHEM110
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
		totalPoints = 100;

		hwPercent = 0 / totalPoints;
		testPercent = 75 / totalPoints;
		projectPercent = 0 / totalPoints;
		finalPercent = 0 / totalPoints;
		quizPercent = 0 / totalPoints;
		labPercent = 25 / totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfTests = 5;
		numberofHWs = 1;
		numberOfProjects = 1;
		numberOfQuizes = 1;
		numberOfLabs = 13;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		testGrade = 90.5+3.5+91+92.5+88.5+92.5;
		hwGrade = 0;
		projectGrade = 0;
		quizGrade = 0;
		labGrade = 975+97+100+100;
		finalGrade = 0;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = (testGrade / numberOfTests);
		hwAvg = (hwGrade / numberofHWs);
		projectAvg = (projectGrade / numberOfProjects);
		quizAvg = (quizGrade / numberOfQuizes);
		labAvg = (labGrade / numberOfLabs) + 2;
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
