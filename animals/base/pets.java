package animals.base;

import ifaces.fawn;

public abstract class pets extends animal implements fawn {

    public pets(float height, float weight, String eyeColor, String name, String type, boolean vaccined, String color, String birthDay) {
        super(height, weight, eyeColor);
        this.name = name;
        this.type = type;
        this.vaccined = vaccined;
        this.color = color;
        this.birthDay = birthDay;
    }

    protected String name;
    protected String type;
    protected boolean vaccined;
    protected String color;
    protected String birthDay;

    @Override
    public String toString() {
        return String.format("Зовут: %s(%s),%s(глаза-%s) Выс:%.2fм Вес:%.1fкг др:%s. Прив:%s", name, type, color, super.getEyeColor(), super.getHeight(), super.getWeight(), birthDay, vaccined ? "Yes" : "No");
    };

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isVaccined() {
        return vaccined;
    }
    public void setVaccined(boolean vaccined) {
        this.vaccined = vaccined;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
