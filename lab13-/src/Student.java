import java.util.Date;

public class Student {
    private int IDNumber;
    private int GPA;
    Date date;

    public Student(int _IDNumber, int _GPA, int day, int month, int year) {
        IDNumber = _IDNumber;
        GPA = _GPA;
        date.setDate(day);
        date.setMonth(month);
        date.setYear(year);
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString(int i) {
        if (i == 1)

            return "Student{" +
                    "IDNumber=" + IDNumber +
                    ", GPA=" + GPA +
                    ", ShortDate=" + date.getDay() + "." + date.getMonth() +
                    '}';
        else if (i == 2)
            return "Student{" +
                    "IDNumber=" + IDNumber +
                    ", GPA=" + GPA +
                    ", MiddleDate=" + date.getDay() + "." + date.getMonth() + "." + (int) date.getYear() - 1100 +
                    '}';
        else
            return "Student{" +
                    "IDNumber=" + IDNumber +
                    ", GPA=" + GPA +
                    ", ShortDate=" + date.getDay() + "." + date.getMonth() + "." + (int) date.getYear() - 900 +
                    '}';
    }
}