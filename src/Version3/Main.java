package Version3;

import version2.MyDate;
import version2.Name;
import version2.PieceWorkerEmployee;
import version2.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("--- Name & Date Output Verification ---");
        version2.Name sampleName = new version2.Name("Alice", "Marie", "Smith");
        version2.MyDate sampleDate = new version2.MyDate(18, 9, 2026);
        System.out.print("Name: ");
        sampleName.displayName();
        System.out.print("Date: ");
        sampleDate.displayDate();
        System.out.println();

        System.out.println("--- Hourly Employee Payroll Test ---");
        HourlyEmployee hourly1 = new HourlyEmployee(101,
                new version2.Name("Alice", "Marie", "Smith"),
                new version2.MyDate(18, 9, 2000),
                new version2.MyDate(1, 6, 2022),
                45.00, 200.00);

        HourlyEmployee hourly2 = new HourlyEmployee();
        hourly2.setEmpId(102);
        hourly2.setEmpName(new version2.Name("Bob", "Cruz", "Jones", "Jr."));
        hourly2.setBirthDate(new version2.MyDate(5, 3, 1998));
        hourly2.setDateHired(new version2.MyDate(15, 1, 2021));
        hourly2.setHoursWorked(38.00);
        hourly2.setHourlyRate(150.00);

        hourly1.displayHourlyEmployee();
        System.out.println(hourly1);
        System.out.println("Regular Month (Oct) Salary: \u20b1" + String.format("%,.2f", hourly1.computeSalary(10)));
        System.out.println("Birth Month (Sep) Salary (+\u20b15,000.00): \u20b1" + String.format("%,.2f", hourly1.computeSalary(9)));
        System.out.println();

        hourly2.displayHourlyEmployee();
        System.out.println(hourly2);
        System.out.println("Regular Month (Dec) Salary: \u20b1" + String.format("%,.2f", hourly2.computeSalary(12)));
        System.out.println("Birth Month (Mar) Salary (+\u20b15,000.00): \u20b1" + String.format("%,.2f", hourly2.computeSalary(3)));
        System.out.println();


        System.out.println("--- Piece Worker Employee Payroll Test ---");
        version2.PieceWorkerEmployee piece1 = new version2.PieceWorkerEmployee(201,
                new version2.Name("Carlos", "Reyes", "Dela Cruz"),
                new version2.MyDate(10, 11, 1995),
                new version2.MyDate(3, 4, 2019),
                250, 8.00);

        version2.PieceWorkerEmployee piece2 = new PieceWorkerEmployee();
        piece2.setEmpId(202);
        piece2.setEmpName(new version2.Name("Diana", "Lopez"));
        piece2.setBirthDate(new version2.MyDate(22, 7, 1992));
        piece2.setDateHired(new version2.MyDate(9, 9, 2020));
        piece2.setPiecesFinished(180);
        piece2.setRatePerPiece(6.50);

        piece1.displayPieceWorkerEmployee();
        System.out.println(piece1);
        System.out.println("Regular Month (Jan) Salary: \u20b1" + String.format("%,.2f", piece1.computeSalary(1)));
        System.out.println("Birth Month (Nov) Salary (+\u20b15,000.00): \u20b1" + String.format("%,.2f", piece1.computeSalary(11)));
        System.out.println();

        piece2.displayPieceWorkerEmployee();
        System.out.println(piece2);
        System.out.println("Regular Month (Feb) Salary: \u20b1" + String.format("%,.2f", piece2.computeSalary(2)));
        System.out.println("Birth Month (Jul) Salary (+\u20b15,000.00): \u20b1" + String.format("%,.2f", piece2.computeSalary(7)));
        System.out.println();


        System.out.println("--- Commission Employee Payroll Test ---");
        CommissionEmployee comm1 = new CommissionEmployee(301,
                new version2.Name("Elena", "Torres", "Ramos"),
                new version2.MyDate(2, 12, 1990),
                new version2.MyDate(20, 5, 2018),
                120000.00);

        CommissionEmployee comm2 = new CommissionEmployee();
        comm2.setEmpId(302);
        comm2.setEmpName(new version2.Name("Franco", "Bautista"));
        comm2.setBirthDate(new version2.MyDate(14, 6, 1988));
        comm2.setDateHired(new version2.MyDate(1, 2, 2017));
        comm2.setTotalSale(45000.00);

        comm1.displayCommissionEmployee();
        System.out.println(comm1);
        System.out.println("Regular Month (Jan) Salary: \u20b1" + String.format("%,.2f", comm1.computeSalary(1)));
        System.out.println("Birth Month (Dec) Salary (+\u20b15,000.00): \u20b1" + String.format("%,.2f", comm1.computeSalary(12)));
        System.out.println();

        comm2.displayCommissionEmployee();
        System.out.println(comm2);
        System.out.println("Regular Month (Jan) Salary: \u20b1" + String.format("%,.2f", comm2.computeSalary(1)));
        System.out.println("Birth Month (Jun) Salary (+\u20b15,000.00): \u20b1" + String.format("%,.2f", comm2.computeSalary(6)));
        System.out.println();


        System.out.println("--- Base Plus Commission Employee Payroll Test ---");
        BasePlusCommissionEmployee bpc1 = new BasePlusCommissionEmployee(401,
                new version2.Name("Grace", "Villanueva", "Santos"),
                new version2.MyDate(30, 4, 1993),
                new version2.MyDate(12, 8, 2020),
                550000.00, 10000.00);

        BasePlusCommissionEmployee bpc2 = new BasePlusCommissionEmployee();
        bpc2.setEmpId(402);
        bpc2.setEmpName(new Name("Henry", "Garcia"));
        bpc2.setBirthDate(new version2.MyDate(19, 10, 1991));
        bpc2.setDateHired(new MyDate(25, 3, 2016));
        bpc2.setTotalSale(80000.00);
        bpc2.setBaseSalary(8000.00);

        bpc1.displayBasePlusCommissionEmployee();
        System.out.println(bpc1);
        System.out.println("Regular Month (Jan) Salary: \u20b1" + String.format("%,.2f", bpc1.computeSalary(1)));
        System.out.println("Birth Month (Apr) Salary (+\u20b15,000.00): \u20b1" + String.format("%,.2f", bpc1.computeSalary(4)));
        System.out.println();

        bpc2.displayBasePlusCommissionEmployee();
        System.out.println(bpc2);
        System.out.println("Regular Month (Jan) Salary: \u20b1" + String.format("%,.2f", bpc2.computeSalary(1)));
        System.out.println("Birth Month (Oct) Salary (+\u20b15,000.00): \u20b1" + String.format("%,.2f", bpc2.computeSalary(10)));
    }
}