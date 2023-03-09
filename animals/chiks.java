package animals;

import animals.base.birds;
import ifaces.info;
import ifaces.sounds;

public class chiks extends birds implements info, sounds {

    public chiks(String name, int altitude) {
        super(name, altitude);
    }

    @Override
    public String getInfo() {
        return this.toString();
    }

    @Override
    public String doSound() {
        return String.format("Ко-ко-ко...");
    }
    
}
