package Version3;

public class MyDate {
    private int day;
    private int month;
    private int year;

    private static final String[] MONTH_NAMES = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public MyDate(int day, int month, int year) {
        setMonth(month);
        setYear(year);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int maxDay = daysInMonth(month, year);
        if (day >= 1 && day <= maxDay) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                return leap ? 29 : 28;
            default:
                return 31;
        }
    }

    public void displayDate() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("%02d %s %d", day, MONTH_NAMES[month - 1], year);
    }
}