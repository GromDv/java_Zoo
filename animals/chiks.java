package animals;

import animals.base.birds;
import ifaces.info;
import ifaces.sounds;

public class chiks extends birds implements info, sounds {

    public chiks(String name, float height, float weight, String eyeColor, int altitude) {
        super(name, height, weight, eyeColor, altitude);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public String doSound() {
        return String.format("Ко-ко-ко...");
    }
    
}
