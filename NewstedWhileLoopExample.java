public class NewstedWhileLoopExample {
    public static void main(String[] args) {
        int i=1;

        while(i<=5){
            System.out.println("Hello " + i);

            int j=1;
            while (j<=3) {
                System.out.println("Nested loop"); 
                j++;
                
            }
            i++;
        }
    }
    
}
