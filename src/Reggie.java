import java.util.Scanner;

public class Reggie
{
    public  static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssnValid = SafeInput.getRegExString(in, "Enter a valid SSN (***-**-****): " , "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumb = SafeInput.getRegExString(in, "Enter a valid UC Student Number (M*****): ", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O, S, V, Q): ", "^[OoSsVvQq]$");

        System.out.println("Your SSN is: " + ssnValid);
        System.out.println("Your UC M# is: " + mNumb);
        System.out.println("Your menu choice is: " + menuChoice);
    }
}
