public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double res;
        if (speed >= 1 && speed <= 4) {
            res = speed * 221;
        } else if (speed >= 5 && speed <= 8) {
            res = speed * 221 * 0.9;
        } else if (speed == 9) {
            res = speed * 221 * 0.8;
        } else {
            res = speed * 221 * 0.77; 
        }
        return res;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
