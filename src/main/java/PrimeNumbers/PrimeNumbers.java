package PrimeNumbers;

public class PrimeNumbers {
    public static void main(String[] args) {

        int number = 3;
        boolean isPrime = true;

        if (number==1){
            System.out.println(number + " is not Prime number.");
            return;
        }

        for (int i=2 ; i<number-1; i++) {
            if (number%i==0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println(number + " is Prime number.");
        } else {
            System.out.println(number + " is not Prime number.");
        }


    }
}
