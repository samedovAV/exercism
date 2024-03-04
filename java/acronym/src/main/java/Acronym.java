class Acronym {

    private static final String NON_ALPHABETIC_REGEX = "[^a-zA-Z\\s-]";
    private static final String WORD_SEPARATOR_REGEX = "[\\s-]+";

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }

        StringBuilder acronym = new StringBuilder();

        String[] words = phrase.replaceAll(NON_ALPHABETIC_REGEX, "").split(WORD_SEPARATOR_REGEX);

        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        return acronym.toString().toUpperCase();
    }
}