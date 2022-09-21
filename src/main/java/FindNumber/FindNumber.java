package FindNumber;

public class FindNumber {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,5,7,9,0};
        int number = 13;

        boolean isExist = false;

        for (int element: numbers){
            if (number==element){
                isExist=true;
                break;
            }
        }

        if (isExist){
            System.out.println(number + " exists in array.");
        } else {
            System.out.println(number + " does not exist in array.");
        }



    }
}
