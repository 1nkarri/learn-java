public class TipoString {
    public static void main(String[] args) {
        char character = 'a';
        System.out.println(character);

        character = 65;
        System.out.println(character);

        character = 65 + 1;
        char secondCharacter = (char) (character + 1);
        System.out.println(secondCharacter);

        String phrase = "Alura cursos online";
        System.out.println(phrase);

        phrase = phrase + " 2023";
        System.out.println(phrase);
    }
}
