import java.util.Scanner;

public class Activity6_Cuesta {
    public static String zodiac(String month, int day) {
            if (day <= 1) {
                return "Invalid Day";
            }
        switch (month) {
            case "January":
                if (day <= 19) {
                    return "Capricorn";
                } else if (day <= 31) {
                    return "Aquarius";
                }
                break;
            case "February":
                if (day <= 18) {
                    return "Aquarius";
                } else if (day <= 29) {
                    return "Pisces";
                }
                break;
            case "March":
                if (day <= 20) {
                    return "Pisces";
                } else if (day <= 31) {
                    return "Aries";
                }
                break;
            case "April":
                if (day <= 19) {
                    return "Aries";
                } else if (day <= 30) {
                    return "Taurus";
                }
                break;
            case "May":
                if (day <= 20) {
                    return "Taurus";
                } else if (day <= 31) {
                    return "Gemini";
                }
                break;
            case "June":
                if (day <= 20) {
                    return "Gemini";
                } else if (day <= 30) {
                    return "Cancer";
                }
                break;
            case "July":
                if (day <= 22) {
                    return "Cancer";
                } else if (day <= 31) {
                    return "Leo";
                }
                break;
            case "August":
                if (day <= 22) {
                    return "Leo";
                } else if (day <= 31) {
                    return "Virgo";
                }
                break;
            case "September":
                if (day <= 22) {
                    return "Virgo";
                } else if (day <= 30) {
                    return "Libra";
                }
                break;
            case "October":
                if (day <= 22) {
                    return "Libra";
                } else if (day <= 31) {
                    return "Scorpio";
                }
                break;
            case "November":
                if (day <= 21) {
                    return "Scorpio";
                } else if (day <= 30) {
                    return "Sagittarius";
                }
                break;
            case "December":
                if (day <= 21) {
                    return "Sagittarius";
                } else if (day <= 31) {
                    return "Capricorn";
                }
                break;
            default:
                return "Invalid Month";
        }
        return "Invalid Day";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "====Check your Zodiac====\n" +
                            "Enter Birth Month: ");
            String month = scanner.nextLine();
        System.out.println("Enter Birth Day: ");
            int day = scanner.nextInt();

        System.out.println("For " + month + " " + day);
        System.out.println(Activity6_Cuesta.zodiac(month, day));
    }
}

