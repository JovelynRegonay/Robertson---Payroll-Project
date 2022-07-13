public class Hourly extends Employee {
    private int hourlyPay;
    private int hoursWorked;
    private double earnings;

    @Override
    public void load() { // method overiden from employee that prompts the user for instance variable
                         // values.
        super.load();
        System.out.print("Hourly pay ==> ");
        hourlyPay = s.nextInt();
        System.out.print("Hours worked this past week ==> ");
        hoursWorked = s.nextInt();
    }

    @Override
    public double getEarnings() { // method overiden from employee that calculates earnings for an hourly
                                  // employee.

        if (this.hoursWorked > 40) {
            int overTime = this.hoursWorked - 40;
            double overTimePay = (hourlyPay * 1.5) * overTime; // formula for overtimepay.
            double normalPay = 40 * hourlyPay;
            earnings = normalPay + overTimePay;

            if (earnings > 1000) {
                earnings = 1000;
                return earnings;
            } else {
                return (hourlyPay * hoursWorked);
            }

        }

        return (hourlyPay * hoursWorked);

    }

}
