import java.util.*;

class Student {
    int rollno;

    void setNo() {
        Scanner sc = new Scanner(System.in);
        rollno = sc.nextInt();
    }
}

class Test extends Student {
    int sem1 = 0, sem2 = 0;

    void setMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sem1 Marks :");
        sem1 = sc.nextInt();
        System.out.println("Enter Sem2 Marks :");
        sem2 = sc.nextInt();
    }
}

interface Sports {
    void score();
}

class Result extends Test implements Sports {
    int sports = 0;

    public void score() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Score:");
        sports = sc.nextInt();
    }

    void getTotal() {
        System.out.println("Total marks :" + rollno + " is " + (sem1 + sem2 + sports));
    }
}

public class inheritanceMarks {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.setNo();
        obj.setMarks();
        obj.score();
        obj.getTotal();
    }
}
