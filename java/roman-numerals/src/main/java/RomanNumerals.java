class RomanNumerals {

    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    private int number;

    // Note: For this exercise, we are only concerned about traditional Roman numerals, 
    // in which the largest number is MMMCMXCIX (or 3,999)

    RomanNumerals(int number) {
        this.number = number;
    }

    String getRomanNumeral() throws IllegalArgumentException {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("NUmber is out of range");
        }
    
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < VALUES.length; i++) {
            while (number >= VALUES[i]) {
                result.append(SYMBOLS[i]);
                number -= VALUES[i];
            }
        }

        return result.toString();
    }
}
