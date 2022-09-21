package DoWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {



        for (int i=2 ; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For loop has ended.");


        int i=2;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While loop has ended.");


        int j=2;
        do {
            System.out.println(j);
            j+=2;
        } while (j<10);
        System.out.println("Do-while loop has ended.");


    }
}
