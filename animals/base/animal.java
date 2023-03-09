package animals.base;

import ifaces.sounds;
import ifaces.info;

public abstract class animal implements sounds, info {
    protected float height;
    protected float weight;
    protected String eyeColor;

    public animal(float height, float weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
