class Darts {
    int score(int xOfDart, int yOfDart) {
        int distance = xOfDart * xOfDart + yOfDart * yOfDart;

        if (distance <= 1) {
            return 10;
        } else if (distance <= 5) {
            return 5;
        } else if (distance <= 10) {
            return 1;
        }
        return 0;
    }
}