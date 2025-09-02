public class SwitchUsingArrow {
    public static void main(String[] args) {
        String day="Monday";
        String result= "";

        switch(day){
          //  case "saturday","Friday"->System.out.println("6am");
            case "saturday","Friday"-> result = "6am";

           // case "Monday"->System.out.println("7am");
           case "Monday"->result = "7 am";

           // default ->System.out.println("5am");
            default ->result = "5 am";

        }
        System.out.println(result);
    }
    
}
