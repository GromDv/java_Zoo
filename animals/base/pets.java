package animals.base;

import ifaces.fawn;

public abstract class pets extends animal implements fawn {

    public pets(float height, float weight, String eyeColor, String name, String type, boolean vaccined, String color, String birthDay, String nickname) {
        super(name, height, weight, eyeColor);
        this.nickname = nickname;
        this.type = type;
        this.vaccined = vaccined;
        this.color = color;
        this.birthDay = birthDay;
    }

    protected String nickname;
    protected String type;
    protected boolean vaccined;
    protected String color;
    protected String birthDay;

    @Override
    public String getInfo() {
        return String.format("Название: %s; Зовут: %s(%s),%s %s др:%s. Прив:%s", name, nickname, type, color, super.getInfo(), birthDay, vaccined ? "Да" : "Нет");
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
