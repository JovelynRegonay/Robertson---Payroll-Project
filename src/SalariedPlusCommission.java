public class SalariedPlusCommission extends Employee {
    double salesPastWeek;
    double commissionRate;
    double salary;

    @Override
    public void load() { // overiden method that prompt the user for instance-variable values and loads
                         // the entries.
                         
        super.load(); // calls the load method from super class.
        System.out.print("Sales for this past week ==>");
        salesPastWeek = s.nextDouble();
        System.out.print("Sales commission rate (fraction paid to employee) ==>");
        commissionRate = s.nextDouble();
        System.out.print("Salary ==>");
        salary = s.nextDouble();

    }

    public double getEarnings() { // overiden method that computes the salary of employees based from the sales
                                  // during the past week and commission rate.
        double percentageOfSales = salesPastWeek * commissionRate;
        salary += percentageOfSales;

        if (salary > 1000) {
            salary = 1000;
        }
        return salary;

    }
}
