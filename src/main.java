import java.util.HashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int count = 0;
        HashSet<String> names = new HashSet<>();

        while (name.contains("Danil") || name.contains("Olya")||name.contains("Slava")||name.contains("Ann")||name.contains("Nikita")) {
            if (name.contains("Danil")) {
                name = name.replaceFirst("Danil", " ");
                names.add(name);
            }
            if (name.contains("Olya")) {
                name = name.replaceFirst("Olya", " ");
                names.add(name);
            }
            if (name.contains("Slava")) {
                name = name.replaceFirst("Slava", " ");
                names.add(name);
            }
            if (name.contains("Ann")) {
                name = name.replaceFirst("Ann", " ");
                names.add(name);
            }
            if (name.contains("Nikita")) {
                name = name.replaceFirst("Nikita", " ");
                names.add(name);
            }
        }
        if (names.size()== 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
