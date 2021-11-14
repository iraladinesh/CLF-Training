package Lab1Flowcontrol;



import java.util.*;

class SquareSum{
	public int calculateDifference(int n) {
		int sumOfSquares=0,naturalSum=0;
		int[] squares1 = new int[n+1];
		//int[] naturals = new int[n+1];
		for(int i=0;i<n+1;i++) {
			squares1[i] = (int) Math.pow(i, 2);
			sumOfSquares += squares1[i];
			naturalSum += i;
		}
		return(naturalSum*naturalSum - sumOfSquares);
	}
}

public class Excersice_6 {
	public static void main(String[] args) {
		SquareSum sq = new SquareSum();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int num = sc.nextInt();
		System.out.println("Difference in sum of Squares and sum of natural squares : "+sq.calculateDifference(num));
	}

}

