class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll("\\s", "");

        // Check if the candidate consists of a single digit "0"
        if (candidate.length() == 1 && candidate.equals("0")) {
            return false;
        }

        // Check if the candidate consists only of zeros
        if (candidate.matches("^0*$")) {
            return true;
        }

        // Remove leading zeros from the input candidate
        candidate = candidate.replaceFirst("^0+(?!$)", "");

        int sum = 0;
        boolean alternate = false;

        for (int i = candidate.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(candidate.charAt(i));
            if (alternate) digit *= 2;
            sum += digit > 9 ? digit - 9 : digit;
            alternate = !alternate;
        }

        return sum % 10 == 0 && sum > 0;
    }

}
