import java.util.Calendar;
import java.util.Scanner;

public abstract class Employee {
    private String name;
    private String socialSecNum;
    private int birthMonth;
    private int birthWeek;

    Scanner s = new Scanner(System.in);

    public void load() { // method that prompts the user for instance-variable values and loads the
                         // entries.

        System.out.print("Name ==> ");
        name = s.nextLine();
        System.out.print("Social security number ==> ");
        socialSecNum = s.nextLine();
        System.out.print("Birthday month ==> ");
        birthMonth = s.nextInt();
        System.out.print("Birthday bonus week ==> ");
        birthWeek = s.nextInt();

    }

    public String toString() { // method that returns a string that shows the employee’s name, social security
                               // number, and paycheck.
        String values = String.format("employee: %s \nsocial security number: %s \n paycheck: %f", this.name,
                this.socialSecNum, (getBonus() + getEarnings()));
        return (values);

    }

    public double getBonus() { // method that generates a $100 employee birthday bonus when the current month
                               // and week matches the employees birthday month and birthday week.

        Calendar c = Calendar.getInstance();
        Integer currentMonth = c.get(Calendar.MONTH);
        Integer currentWeek = c.get(Calendar.WEEK_OF_MONTH);

        if (currentMonth.equals(birthMonth) && currentWeek.equals(birthWeek)) {
            return 100;
        }

        return 0;
    }

    public abstract double getEarnings(); // method that gets the earnings

}
