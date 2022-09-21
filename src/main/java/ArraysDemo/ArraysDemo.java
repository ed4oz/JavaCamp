package ArraysDemo;

public class ArraysDemo {
    public static void main(String[] args) {

        String student1 = "Engin";
        String student2 = "Derin";
        String student3 = "Salih";
        String student4 = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("--------------------------");

        String[] students = new String[4];
        students[0]="Engin";
        students[1]="Eda";
        students[2]="Mecit";
        students[3]="Ali";

        for (int i=0; i<students.length ; i++){
            System.out.println(students[i]);
        }

        System.out.println("--------------------------");

        for (String element: students){
            System.out.println(element);
        }




    }
}
