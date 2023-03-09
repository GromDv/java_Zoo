package animals;

import animals.base.pets;
import ifaces.train;

public class dogs extends pets implements train {

    private boolean isTrained;

    public dogs(float height, float weight, String eyeColor, String name, String type, boolean vaccined, String color,
            String birthDay, boolean isTrained) {
        super(height, weight, eyeColor, name, type, vaccined, color, birthDay);
        this.isTrained = isTrained;
    }

    @Override
    public String toFawn() {
        return String.format("Ласкается.");
    }

    @Override
    public String doSound() {
        return String.format("Гав.");
    }

    @Override
    public String getInfo() {
        return String.format("%s Дресс:%s", super.toString(), isTrained ? "Yes" : "No");
    }

    @Override
    public String toTrain() {
        return String.format("Дрессировка идет.");
    }
    
}
