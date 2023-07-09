import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter the year of your birth (1950-2015): ", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter the month of your birth (1-12): ", 1, 12);
        int birthDay = SafeInput.getRangedInt(in, "Enter the day of your birth (1-31): ", 1, 31);
        int birthHours = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24): ", 1, 24);
        int birthMinutes = SafeInput.getRangedInt(in, "Enter the minutes of your birht (1-59): ", 1, 59);

        System.out.println("Your birth date and time is : " + birthYear + "-" + birthMonth + "-" + birthDay + "-" + birthHours + "-" + birthMinutes);

    }
}
