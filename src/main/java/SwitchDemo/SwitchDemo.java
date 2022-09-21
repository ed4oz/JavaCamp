package SwitchDemo;

public class SwitchDemo {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade){
            case 'A':
                System.out.println("Passed with A.");
                break;
            case 'B':
                System.out.println("Passed with B.");
                break;
            case 'C':
                System.out.println("Passed with C.");
                break;
            case 'D':
                System.out.println("Passed with D.");
                break;
            case 'F':
                System.out.println("Failed with F.");
                break;
            default:
                System.out.println("Illegal grade entered.");
                break;
        }


    }
}
