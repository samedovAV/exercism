public class PangramChecker {

    public boolean isPangram(String input) {
        return input.toLowerCase().chars()
            .filter(i -> i >= 'a' && i <= 'z')
            .distinct()
            .count() == 26;
    }

}
