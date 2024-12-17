public class class5 {
    public static void main(String[] args) {
//        int a = 10;
//        if(a == 5){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }

//        int weekDays  = 5;
//        if(weekDays == 1){
//            System.out.println("Monday");
//        }
//        else if (weekDays == 2){
//            System.out.println("Tuesday");
//        }
//        else if (weekDays == 3){
//            System.out.println("Wednesday");
//        }
//        else if (weekDays == 4){
//            System.out.println("Thursday");
//        }
//        else if (weekDays == 5){
//            System.out.println("Friday");
//        }
//        else if (weekDays == 6){
//            System.out.println("Saturday");
//        }
//        else if (weekDays == 7){
//            System.out.println("Sunday");
//        }
//        else{
//            System.out.println("Invalid weekday");
//        }


//        int Recharge = 100;
//        int P_YouTube = 300;
//        if(Recharge >= 200){
//            System.out.println("You can watch YouTube");
//            if(P_YouTube >= 300){
//                System.out.println("You can watch YouTube without ADDS");
//            }
//            else{
//                System.out.println("You can watch YouTube with ADDS");
//            }
//        }
//        else{
//            System.out.println("You can't watch YouTube");
//        }

        int weekDay = 6;
        switch (weekDay){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                    System.out.println("Thursday");
                    break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid weekday");
        }
    }
}
