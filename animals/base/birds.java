package animals.base;

import ifaces.fly;
import ifaces.info;

public abstract class birds implements fly, info {

    protected int altitude;
    private String name;

    protected birds(String name, int altitude) {
        this.altitude = altitude;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toFly() {
        return String.format("Я лечу на %d метрах!", altitude);
    }

    @Override
    public String toString() {
        return String.format("Название %s, высота полета: %dм", name, altitude);
    }
}
