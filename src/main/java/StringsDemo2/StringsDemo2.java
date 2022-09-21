package StringsDemo2;

public class StringsDemo2 {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);

        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(message.substring(2,5));

        for (String word : message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}
