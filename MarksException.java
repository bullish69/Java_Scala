import java.util.*;

class MarksOutOfBoundsException extends Exception {
	public MarksOutOfBoundsException(String st) {
		super(st);
	}
}

public class MarksException {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter name :- ");
		String name = s.nextLine();
		System.out.print("Enter date :- ");
		String date = s.nextLine();
		System.out.print("Enter seat no :- ");
		String sno = s.nextLine();
		System.out.print("Enter center number :- ");
		int cno = s.nextInt();
		System.out.print("Enter marks :- ");
		int marks = s.nextInt();
		System.out.println();
		try {
			System.out.println("Student Result");
			System.out.println("Name :- " + name);
			System.out.println("Date appeared :- " + date);
			System.out.println("Seat Number :- " + sno);
			System.out.println("Center Number :- " + cno);
			System.out.println("Marks Obtained :- " + marks);
			if (marks > 100 || marks < 0) {
				throw new MarksOutOfBoundsException("MarksOutOfBoundsException!");
			}
		} catch (MarksOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
