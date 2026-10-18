class Acronym {

    static String abbreviate(String phrase) {
        phrase.findAll(/[A-Za-z]+(?:'[A-Za-z]+)*/).collect { it[0] }.join().toUpperCase()
    }

}