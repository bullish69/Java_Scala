import java.util.*;

public class Election {
    public static void main(String args[]) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int sb = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people wish to vote :- ");
        int no = sc.nextInt();
        System.out.println();
        System.out.println("Candidates are as follows :- ");
        System.out.println("Press 1 for Candidate 1");
        System.out.println("Press 2 for Candidate 2");
        System.out.println("Press 3 for Candidate 3");
        System.out.println("Press 4 for Candidate 4");
        System.out.println("Press 5 for Candidate 5");
        System.out.println();
        for (int i = 0; i < no; i++) {
            System.out.print("Enter Candidate choice :- ");
            int c = sc.nextInt();
            if (c == 1) {
                c1++;
            } else if (c == 2) {
                c2++;
            } else if (c == 3) {
                c3++;
            } else if (c == 4) {
                c4++;
            } else if (c == 5) {
                c5++;
            } else {
                sb++;
            }
        }
        System.out.println();
        System.out.println("Vote count are as follows :- ");
        System.out.println("Candidate 1:- " + c1);
        System.out.println("Candidate 2:- " + c2);
        System.out.println("Candidate 3:- " + c3);
        System.out.println("Candidate 4:- " + c4);
        System.out.println("Candidate 5:- " + c5);
        System.out.println("Spoiled ballots:- " + sb);
    }
}
