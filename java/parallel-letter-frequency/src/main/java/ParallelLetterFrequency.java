import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class ParallelLetterFrequency {

    List<String> texts;
    ConcurrentMap<Character, Integer> lettersCount;

    ParallelLetterFrequency(String[] texts) {
        this.texts = List.of(texts);
        lettersCount = new ConcurrentHashMap<>();
    }

    Map<Character, Integer> countLetters() {
        if (!lettersCount.isEmpty() || texts.isEmpty()) {
            return lettersCount;
        }

        texts.parallelStream()
                .flatMapToInt(CharSequence::chars) 
                .filter(Character::isAlphabetic)   
                .map(Character::toLowerCase)      
                .forEach(c -> lettersCount.compute((char) c, (k, v) -> v == null ? 1 : v + 1));

        return lettersCount;
    }

}
