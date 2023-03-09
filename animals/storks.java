package animals;

import animals.base.birds;
import ifaces.info;

public class storks extends birds implements info {

    public storks(String name, int altitude) {
        super(name, altitude);
    }

    @Override
    public String getInfo() {
        return this.toString();
    }

    @Override
    public String toFly() {
        return super.toFly();
    }
    
}
