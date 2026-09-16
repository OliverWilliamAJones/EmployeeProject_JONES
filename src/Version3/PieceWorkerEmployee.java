package Version3;

import version2.MyDate;
import version2.Name;

public class PieceWorkerEmployee {
    private int empId;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private int piecesFinished;
    private double ratePerPiece;

    public static final int PIECES_PER_BONUS_BLOCK = 100;
    public static final double BONUS_MULTIPLIER = 10.0;
    public static final double BIRTHDAY_BONUS = 5000.00;

    public PieceWorkerEmployee() {
        this.empId = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
        this.piecesFinished = 0;
        this.ratePerPiece = 0.0;
    }

    public PieceWorkerEmployee(int empId, Name empName, MyDate birthDate, MyDate dateHired,
                               int piecesFinished, double ratePerPiece) {
        this.empId = empId;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setPiecesFinished(piecesFinished);
        setRatePerPiece(ratePerPiece);
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

    public int getPiecesFinished() {
        return piecesFinished;
    }

    public void setPiecesFinished(int piecesFinished) {
        if (piecesFinished >= 0) {
            this.piecesFinished = piecesFinished;
        }
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        if (ratePerPiece >= 0) {
            this.ratePerPiece = ratePerPiece;
        }
    }

    private double calculateBaseSalary() {
        double pay = piecesFinished * ratePerPiece;
        int bonusBlocks = piecesFinished / PIECES_PER_BONUS_BLOCK;
        double bonus = bonusBlocks * BONUS_MULTIPLIER * ratePerPiece;
        return pay + bonus;
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

    public void displayPieceWorkerEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Pieces: %d | Rate: \u20b1%.2f/pc%n",
                empId, empName.toString(), birthDate.toString(), dateHired.toString(), piecesFinished, ratePerPiece);
    }

    @Override
    public String toString() {
        return String.format(
                "PieceWorkerEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Pieces: %d, Rate: \u20b1%.2f, Total Salary: \u20b1%,.2f]",
                empId, empName.toString(), birthDate.toString(), dateHired.toString(), piecesFinished, ratePerPiece,
                computeSalary());
    }
}