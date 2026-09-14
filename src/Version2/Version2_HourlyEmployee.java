package Version2;

public class HourlyEmployee {

    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private float totalHoursWorked;
    private double ratePerHour;


    public HourlyEmployee() {
        empID = 0;
        empName = new Name("N/A");
        birthDate = new MyDate();
        dateHired = new MyDate();
        totalHoursWorked = 0;
        ratePerHour = 0;
    }


    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = new Name(empName);
        birthDate = new MyDate();
        dateHired = new MyDate();
        totalHoursWorked = 0;
        ratePerHour = 0;
    }


    public HourlyEmployee(int empID, Name empName) {
        this.empID = empID;
        this.empName = empName;
        birthDate = new MyDate();
        dateHired = new MyDate();
        totalHoursWorked = 0;
        ratePerHour = 0;
    }


    public HourlyEmployee(int empID, Name empName, MyDate birthDate,
                          MyDate dateHired, float totalHoursWorked, double ratePerHour) {

        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }


    public int getEmpID() {
        return empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }


    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        if (totalHoursWorked >= 0) {
            this.totalHoursWorked = totalHoursWorked;
        } else {
            this.totalHoursWorked = 0;
        }
    }

    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour >= 0) {
            this.ratePerHour = ratePerHour;
        } else {
            this.ratePerHour = 0;
        }
    }


    public double computeSalary() {

        double salary;

        if (totalHoursWorked <= 40) {
            salary = totalHoursWorked * ratePerHour;
        } else {
            double regularPay = 40 * ratePerHour;
            double overtimePay =
                    (totalHoursWorked - 40) * (ratePerHour * 1.5);

            salary = regularPay + overtimePay;
        }


        if (birthDate.isBirthday()) {
            salary = salary + 5000;
        }

        return salary;
    }


    public void displayHourlyEmployee() {
        System.out.printf(
                "ID: %d | Name: %s | Birth Date: %s | Date Hired: %s | Hours: %.2f | Rate: ₱%.2f/hr%n",
                empID, empName, birthDate, dateHired,
                totalHoursWorked, ratePerHour
        );
    }


    @Override
    public String toString() {
        return String.format(
                "HourlyEmployee [ID: %d, Name: %s, Birth Date: %s, Date Hired: %s, Hours: %.2f, Rate: ₱%.2f, Total Salary: ₱%,.2f]",
                empID, empName, birthDate, dateHired,
                totalHoursWorked, ratePerHour, computeSalary()
        );
    }
}