package version2;

public class CommissionEmployee {
    private int empId;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private double totalSale;

    public static final double BIRTHDAY_BONUS = 5000.00;

    public CommissionEmployee() {
        this.empId = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
        this.totalSale = 0.0;
    }

    public CommissionEmployee(int empId, Name empName, MyDate birthDate, MyDate dateHired, double totalSale) {
        this.empId = empId;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalSale(totalSale);
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

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        if (totalSale >= 0) {
            this.totalSale = totalSale;
        }
    }

    protected double getCommissionRate(double sales) {
        if (sales >= 500000) {
            return 0.20;
        } else if (sales >= 100000) {
            return 0.15;
        } else if (sales >= 50000) {
            return 0.10;
        } else {
            return 0.05;
        }
    }

    private double calculateBaseSalary() {
        return totalSale * getCommissionRate(totalSale);
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

    public void displayCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Total Sale: \u20b1%,.2f%n",
                empId, empName.toString(), birthDate.toString(), dateHired.toString(), totalSale);
    }

    @Override
    public String toString() {
        return String.format(
                "CommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Total Sale: \u20b1%,.2f, Total Salary: \u20b1%,.2f]",
                empId, empName.toString(), birthDate.toString(), dateHired.toString(), totalSale, computeSalary());
    }
}