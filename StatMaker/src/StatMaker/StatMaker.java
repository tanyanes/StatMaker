package StatMaker;
import java.util.Scanner;

public class StatMaker {
	public static void battingAverage(double x,double y){
		double BA = (x/y);
		System.out.println("The batting average is:" + BA);
	}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Name: ");
		String name = sc.nextLine();
		System.out.print("Input AB: ");
		int AB = sc.nextInt();
		System.out.println("Input H: ");
		int H = sc.nextInt();
		System.out.println("Input 2B: ");
		int B2 = sc.nextInt();
		System.out.println("Input 3B: ");
		int B3 = sc.nextInt();
		System.out.println("Input HR: ");
		int HR = sc.nextInt();
		System.out.println("Input R: ");
		int R = sc.nextInt();
		System.out.println("Input BB: ");
		int BB= sc.nextInt();
		System.out.println(R);
		System.out.println("Stats for: "+name);
		StatMaker.battingAverage(H,AB);
		double OBP=(double)(H+BB)/AB;
		System.out.println("The OBP is: "+ OBP);
		double TB=(H+2*B2+3*B3+4*HR);
		System.out.println("The TB is: "+ TB);
		double SLG=TB/AB;
		System.out.println("The SLG is: " + SLG);
		double OPS=OBP+SLG;
		System.out.println("The OPS is: "+ OPS);
		sc.close();
		}
}
