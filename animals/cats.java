package animals;

import animals.base.pets;

public class cats extends pets {

    public cats(float height, float weight, String eyeColor, String name, String type, boolean vaccined, String color,
            String birthDay, String nickname) {
        super(height, weight, eyeColor, name, type, vaccined, color, birthDay, nickname);
    }

    @Override
    public String toFawn() {
        return String.format("Ласкается.");
    }

    @Override
    public String doSound() {
        return String.format("Мяяяуууу.");
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
