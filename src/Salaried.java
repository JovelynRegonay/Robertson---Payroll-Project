public class Salaried extends Employee {
    double weeklySalary;
    double salary;

    @Override
    public void load() { // overiden method that prompts the user for instance-variable values and loads
                         // the entries.

        super.load(); // calls load method from the super class.
        System.out.print("Salary ==> ");
        salary = s.nextDouble();

    }

    @Override
    public double getEarnings() { // overiden method that computes earnings for a salaried employee which has
                                  // fixed weekly salary.
        weeklySalary = salary;

        if (weeklySalary > 1000) {
            weeklySalary = 1000;
        }

        return salary;
    }
}
