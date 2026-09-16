package Version3;

import version2.MyDate;
import version2.Name;

public class BasePlusCommissionEmployee {
    private int empId;
    private version2.Name empName;
    private version2.MyDate birthDate;
    private version2.MyDate dateHired;
    private double totalSale;
    private double baseSalary;

    public static final double BIRTHDAY_BONUS = 5000.00;

    public BasePlusCommissionEmployee() {
        this.empId = 0;
        this.empName = new version2.Name();
        this.birthDate = new version2.MyDate();
        this.dateHired = new version2.MyDate();
        this.totalSale = 0.0;
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empId, version2.Name empName, version2.MyDate birthDate, version2.MyDate dateHired,
                                      double totalSale, double baseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        if (empId >= 0) {
            this.empId = empId;
        }
    }

    public version2.Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        if (empName != null) {
            this.empName = empName;
        }
    }

    public version2.MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(version2.MyDate birthDate) {
        if (birthDate != null) {
            this.birthDate = birthDate;
        }
    }

    public version2.MyDate getDateHired() {
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }

    private double getCommissionRate(double sales) {
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
        return (totalSale * getCommissionRate(totalSale)) + baseSalary;
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

    public void displayBasePlusCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Total Sale: \u20b1%,.2f | Base: \u20b1%,.2f%n",
                empId, empName.toString(), birthDate.toString(), dateHired.toString(), totalSale, baseSalary);
    }

    @Override
    public String toString() {
        return String.format(
                "BasePlusCommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Total Sale: \u20b1%,.2f, Base: \u20b1%,.2f, Total Salary: \u20b1%,.2f]",
                empId, empName.toString(), birthDate.toString(), dateHired.toString(), totalSale, baseSalary,
                computeSalary());
    }
}