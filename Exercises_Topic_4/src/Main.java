public class Main {
    public static void main(String[] args){
        //Exercise "If"
        System.out.println("Exercise If");
        int numberIf = 5;
        if (numberIf > 0){
            System.out.println("The number is positive");
        }
        else if (numberIf == 0){
            System.out.println("The number is 0");
        }
        else {
            System.out.println("The number is negative");
        }

        //Exercise "While"
        System.out.println("Exercise While");
        int numberWhile = -5;
        while (numberWhile < 3){
            numberWhile ++;
            System.out.println(numberWhile);
        }

        //Exercise "Do While"
        System.out.println("Exercise Do While");
        int numberDoWhile = 3;
        do {
            numberDoWhile ++;
            System.out.println(numberDoWhile);
        } while (numberDoWhile < 3);

        //Exercise "For"
        System.out.println("Exercise For");
        for (int numberFor = 0; numberFor <= 3; numberFor ++) {
            System.out.println(numberFor);
        }

        //Exercise "Switch"
        System.out.println("Exercise Switch");
        var season = "summer";

        switch (season){
            case "autumn":
                System.out.println("Is autumn");
                break;
            case "winter":
                System.out.println("Is winter");
                break;
            case "spring":
                System.out.println("Is spring");
                break;
            case "summer":
                System.out.println("Is summer");
                break;
            default:
                System.out.println("This is not a season");
        }
        }
    }