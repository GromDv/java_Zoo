package animals.base;

import ifaces.fly;

public abstract class birds extends animal implements fly {

    public birds(String name, float height, float weight, String eyeColor, int altitude) {
        super(name, height, weight, eyeColor);
        this.altitude = altitude;
    }

    protected int altitude;

    @Override
    public String toFly() {
        return String.format("Я лечу на %d метрах!", altitude);
    }

    @Override
    public String getInfo() {
        return String.format("Название %s, высота полета: %dм, %s", name, altitude, super.getInfo());
    }
}
