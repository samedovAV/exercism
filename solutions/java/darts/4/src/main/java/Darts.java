class Darts {
    int score(int xOfDart, int yOfDart) {
        int d2 = xOfDart * xOfDart + yOfDart * yOfDart;

        if (d2 <= 1) {
            return 10;
        } else if (d2 <= 25) {
            return 5;
        } else if (d2 <= 100) {
            return 1;
        }
        return 0;
    }
}