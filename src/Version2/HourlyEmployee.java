package version2;

public class HourlyEmployee {
    private int empId;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private double hoursWorked;
    private double hourlyRate;

    public static final double REGULAR_HOURS = 40.0;
    public static final double OVERTIME_MULTIPLIER = 1.5;
    public static final double BIRTHDAY_BONUS = 5000.00;

    public HourlyEmployee() {
        this.empId = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
        this.hoursWorked = 0.0;
        this.hourlyRate = 0.0;
    }

    public HourlyEmployee(int empId, Name empName, MyDate birthDate, MyDate dateHired,
                          double hoursWorked, double hourlyRate) {
        this.empId = empId;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        if (empId >= 0) {
            this.empId = empId;
        }
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        if (empName != null) {
            this.empName = empName;
        }
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        if (birthDate != null) {
            this.birthDate = birthDate;
        }
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        if (dateHired != null) {
            this.dateHired = dateHired;
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
    }

    private double calculateBaseSalary() {
        if (hoursWorked <= REGULAR_HOURS) {
            return hoursWorked * hourlyRate;
        } else {
            double regularPay = REGULAR_HOURS * hourlyRate;
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            double overtimePay = overtimeHours * hourlyRate * OVERTIME_MULTIPLIER;
            return regularPay + overtimePay;
        }
    }

    public double computeSalary(int currentMonth) {
        double salary = calculateBaseSalary();
        if (birthDate.getMonth() == currentMonth) {
            salary += BIRTHDAY_BONUS;
        }
        return salary;
    }

    public double computeSalary() {
        return calculateBaseSalary();
    }

    public void displayHourlyEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Hours: %.2f | Rate: \u20b1%.2f/hr%n",
                empId, empName.toString(), birthDate.toString(), dateHired.toString(), hoursWorked, hourlyRate);
    }

    @Override
    public String toString() {
        return String.format(
                "HourlyEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Hours: %.2f, Rate: \u20b1%.2f, Total Salary: \u20b1%,.2f]",
                empId, empName.toString(), birthDate.toString(), dateHired.toString(), hoursWorked, hourlyRate,
                computeSalary());
    }
}