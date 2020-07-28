import static java.util.stream.Collectors.joining;

public class ChangeCase {
    public static void main(String[] args) {
        String content="Hell*0";
        String result = content
                .chars()
                .map(s -> Character.isUpperCase(s) ? Character.toLowerCase(s) : Character.toUpperCase(s))
                .mapToObj(s -> (char) s)
                .map(Object::toString)
                .collect(joining());
        System.out.println(result);
    }
}

   /* String a = "Hell*o";

    char[] chars = a.toCharArray();

for (int i = 0; i < chars.length; i++) {
        char c = chars[i];
        if (Character.isUpperCase(c)) {
            chars[i] = Character.toLowerCase(c);
        } else if (Character.isLowerCase(c)) {
            chars[i] = Character.toUpperCase(c);

        }
    System.out.println(new String(chars));}*/





