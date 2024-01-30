import java.util.HashMap;
import java.util.Map;

class RaindropConverter {

    private static final HashMap<Integer, String> map = new HashMap<>(Map.of(3, "Pling", 5, "Plang", 7, "Plong"));

    // Map Approach
    String convertWithMap(int number) {
        return map.keySet()
            .stream()
            .filter(key -> number % key == 0)
            .map(key -> map.get(key))
            .reduce((s1, s2) -> s1 + s2)
            .orElse(Integer.toString(number));
    }

    // If Statements Approach
    String convertWithIf(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        if (number % 3 == 0) {
            stringBuilder.append("Pling");
        }
        if (number % 5 == 0) {
            stringBuilder.append("Plang");
        }
        if (number % 7 == 0) {
            stringBuilder.append("Plong");
        }

        return stringBuilder.isEmpty() ? String.valueOf(number) : stringBuilder.toString();
    }

}
