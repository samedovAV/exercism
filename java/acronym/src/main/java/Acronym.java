class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }

        StringBuilder acronym = new StringBuilder();

        String[] words = phrase.replaceAll("[^a-zA-Z\\s-]", "").split("[\\s-]+");

        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        return acronym.toString().toUpperCase();
    }

}
