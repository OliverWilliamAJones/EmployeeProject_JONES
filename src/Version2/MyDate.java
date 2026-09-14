package Version2;

import java.time.LocalDate;

public class MyDate {

    private int day;
    private int month;
    private int year;


    public MyDate() {
        day = 0;
        month = 0;
        year = 0;
    }


    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public boolean isBirthday() {

        LocalDate today = LocalDate.now();

        return day == today.getDayOfMonth()
                && month == today.getMonthValue();
    }


    @Override
    public String toString() {

        String[] months = {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };

        return day + " " + months[month - 1] + " " + year;
    }
}