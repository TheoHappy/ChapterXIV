import java.util.Scanner;

public class PrintingDatesInVariousFormats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date in format month/day/year and press enter ");
        String date = input.nextLine();
        String[] tokens = date.split("/");

        System.out.println("Split with tokens:");
        System.out.printf("%s %s, %s\n",
                displayMonth(tokens[0]),
                tokens[1],
                tokens[2]);

        System.out.println("Split with substring:");
        System.out.printf("%s %s, %s",
                displayMonth(date.substring(0,2)),
                date.substring(3,5),
                date.substring(6)
        );
    }

    public static String displayMonth(String  month){
        String result = null;
        switch (month){
            case "01":
                result = "January";
                break;
            case "02":
                result = "February";
                break;
            case "03":
                result = "March";
                break;
            case "04":
                result = "April";
                break;
            case "05":
                result = "May";
                break;
            case "06":
                result = "June";
                break;
            case  "07":
                result = "July";
                break;
            case "08":
                result = "August";
                break;
            case "09":
                result = "September";
                break;
            case "10":
                result = "October";
                break;
            case  "11":
                result = "November";
                break;
            case "12":
                result = "December";
                break;
        }
        return result;
    }
}
