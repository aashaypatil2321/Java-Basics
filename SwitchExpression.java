public class SwitchExpression {
        public static void main(String[] args) {
        String day = "sunday";
        String result =" ";

//we have to used the switch expression here..
        result = switch(day){
            case "saturday","friday"-> "6am";
            case "Monday"-> "7 am";
            default -> "5 am";

        };
        System.out.println(result);
    }
    
}
