package Version3;

import version2.MyDate;
import version2.Name;

public class Employee{
    private int empID;
    private version2.Name empName;
    private version2.MyDate birthDate;
    private version2.MyDate dateHired;

    public Employee() {
    }


    public Employee(int empID) {
        this.empID = empID;
    }

    public Employee(Name empName) {
        this.empName = empName;
    }

    public Employee(MyDate birthDate) {
        this.birthDate = birthDate;
    }



}



