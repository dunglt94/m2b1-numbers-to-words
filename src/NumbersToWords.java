import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên không âm có tối đa 3 chữ số: ");
        int number = scanner.nextInt();

        if (number == 0) System.out.print("zero");
        else if (number <= 10) {
            String SingleDigit;
            switch (number) {
                case 1: SingleDigit = "one"; break;
                case 2: SingleDigit = "two"; break;
                case 3: SingleDigit = "three";break;
                case 4: SingleDigit = "four";break;
                case 5: SingleDigit = "five";break;
                case 6: SingleDigit = "six";break;
                case 7: SingleDigit = "seven";break;
                case 8: SingleDigit = "eight";break;
                case 9: SingleDigit = "nine";break;
                case 10: SingleDigit = "ten";break;
                default: SingleDigit = "";break;
            }
            System.out.print(SingleDigit);
        } else if (number < 20) {
            String Teens;
            int ones = number % 10;
            Teens = switch (ones) {
                case 1 -> "eleven";
                case 2 -> "twelve";
                case 3 -> "thirteen";
                case 4 -> "fourteen";
                case 5 -> "fifteen";
                case 6 -> "sixteen";
                case 7 -> "seventeen";
                case 8 -> "eighteen";
                case 9 -> "nineteen";
                default -> "";
            };
            System.out.print(Teens);
        } else if (number < 100) {
            String Tens;
            int tens = number / 10;
            int ones = number % 10;
            switch (tens) {
                case 2: Tens = "twenty"; break;
                case 3: Tens = "thirty"; break;
                case 4: Tens = "forty"; break;
                case 5: Tens = "fifty"; break;
                case 6: Tens = "sixty"; break;
                case 7: Tens = "seventy"; break;
                case 8: Tens = "eighty"; break;
                case 9: Tens = "ninety"; break;
                default: Tens = ""; break;
            }
            if (ones != 0) {
                Tens += " ";
                switch (ones) {
                    case 1: Tens += "one"; break;
                    case 2: Tens += "two"; break;
                    case 3: Tens += "three"; break;
                    case 4: Tens += "four"; break;
                    case 5: Tens += "five"; break;
                    case 6: Tens += "six"; break;
                    case 7: Tens += "seven"; break;
                    case 8: Tens += "eight"; break;
                    case 9: Tens += "nine"; break;
                }
                System.out.print(Tens);
            }
        } else if (number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            String Hundreds;
            switch (hundreds) {
                case 1: Hundreds = "one hundred"; break;
                case 2: Hundreds = "two hundred"; break;
                case 3: Hundreds = "three hundreds";break;
                case 4: Hundreds = "four hundreds";break;
                case 5: Hundreds = "five hundreds";break;
                case 6: Hundreds = "six hundreds";break;
                case 7: Hundreds = "seven hundreds";break;
                case 8: Hundreds = "eight hundreds";break;
                case 9: Hundreds = "nine hundreds";break;
                default: Hundreds = "";break;
            }
            if (remainder == 0) {
                System.out.print(Hundreds);
            } else {
                System.out.print(Hundreds + " and ");
                int tens = remainder / 10;
                int ones = remainder % 10;
                if (remainder <= 10) {
                    String SingleDigit = "";
                    switch (remainder) {
                        case 1: SingleDigit = "one";break;
                        case 2: SingleDigit = "two";break;
                        case 3: SingleDigit = "three";break;
                        case 4: SingleDigit = "four";break;
                        case 5: SingleDigit = "five";break;
                        case 6: SingleDigit = "six";break;
                        case 7: SingleDigit = "seven";break;
                        case 8: SingleDigit = "eight";break;
                        case 9: SingleDigit = "nine";break;
                        case 10: SingleDigit = "ten";break;
                        default: SingleDigit = "";break;
                    }
                    System.out.print(SingleDigit);
                } else if (remainder < 20) {
                    String Teens;
                    Teens = switch (ones) {
                        case 1 -> "eleven";
                        case 2 -> "twelve";
                        case 3 -> "thirteen";
                        case 4 -> "fourteen";
                        case 5 -> "fifteen";
                        case 6 -> "sixteen";
                        case 7 -> "seventeen";
                        case 8 -> "eighteen";
                        case 9 -> "nineteen";
                        default -> "";
                    };
                    System.out.print(Teens);
                } else {
                    String Tens = "";
                    switch (tens) {
                        case 2: Tens = "twenty"; break;
                        case 3: Tens = "thirty"; break;
                        case 4: Tens = "forty"; break;
                        case 5: Tens = "fifty"; break;
                        case 6: Tens = "sixty"; break;
                        case 7: Tens = "seventy"; break;
                        case 8: Tens = "eighty"; break;
                        case 9: Tens = "ninety"; break;
                        default: Tens = ""; break;
                    }
                    if (ones != 0) {
                        Tens += " ";
                        switch (ones) {
                            case 1: Tens += "one"; break;
                            case 2: Tens += "two"; break;
                            case 3: Tens += "three"; break;
                            case 4: Tens += "four"; break;
                            case 5: Tens += "five"; break;
                            case 6: Tens += "six"; break;
                            case 7: Tens += "seven"; break;
                            case 8: Tens += "eight"; break;
                            case 9: Tens += "nine"; break;
                        }
                        System.out.print(Tens);
                    }
                }
            }
        }
    }
}
