package animals;

import animals.base.birds;

public class storks extends birds {

    public storks(String name, float height, float weight, String eyeColor, int altitude) {
        super(name, height, weight, eyeColor, altitude);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public String toFly() {
        return super.toFly();
    }

    @Override
    public String doSound() {
        return String.format("Каррррр...");
    }
    
}
