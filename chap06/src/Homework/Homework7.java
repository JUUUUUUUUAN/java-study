package Homework;

import java.util.Arrays;

public class Homework7 {

	public static void main(String[] args) {
		
		String[] report = {"Introduction", "Research", "Conclusion"};
		
		String[] reportCopy = new String[report.length];
		
		reportCopy[0] = "Team Feedback";
		System.arraycopy(report, 1, reportCopy, 1, report.length-1);
		
		System.out.print("원본보고서 : ");
		for(int i = 0; i < report.length; i++) {
			System.out.print(report[i] + ", ");
		}
		
		System.out.println();
		
		System.out.print("복사된 보고서 : ");
		for(int i = 0; i < reportCopy.length; i++) {
			System.out.print(reportCopy[i] + ", ");
		}
	}

}
