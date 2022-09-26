public class Main {

    public static void main(String[] args) {
        String message = "Today, the weather is very good.";
        System.out.println(message);

        /*System.out.println("Eleman sayisi: " +message.length());
        System.out.println("5. eleman: "+message.charAt(4)); //charAt
        System.out.println(message.concat(" I am so happy!")); //concat
        System.out.println(message.startsWith("t")); //startsWith
        System.out.println(message.endsWith(".")); //endsWith

        char[] characters = new char[5];

        message.getChars(0, 5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("a")); //indexOf
        System.out.println(message.indexOf("ay"));
        System.out.println(message.lastIndexOf("a")); //lastIndexOf*/

        String newMessage = message.replace(',', ' ');
        System.out.println(newMessage);
        System.out.println(message.substring(2)); //substring
        System.out.println(message.substring(2,4));

        for (String word: message.split(" ") ){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase()); //toLowerCase
        System.out.println(message.toUpperCase()); //toUpperCase
        System.out.println(message.trim()); //basta ve sonda olan bosluklari ortadan kaldirma
    }
}
