import java.util.ArrayList;
import java.util.List;

class Allergies {
    private int score;

    public Allergies(int score) {
        this.score = score;
    }

    boolean isAllergicTo(Allergen allergen) {
        return (score & allergen.getScore()) != 0;
    }

    List<Allergen> getList() {
        List<Allergen> allergicTo = new ArrayList<>();
        for (Allergen allergen : Allergen.values()) {
            if (isAllergicTo(allergen)) {
                allergicTo.add(allergen);
            }
        }
        return allergicTo;
    }
}
