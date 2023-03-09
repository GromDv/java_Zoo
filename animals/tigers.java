package animals;

import animals.base.wild;

public class tigers extends wild {

public tigers(float height, float weight, String eyeColor, String name, String areal, String foundDate) {
    super(height, weight, eyeColor, name, areal, foundDate);
}

    @Override
    public String doSound() {
        return String.format("Ррррррр...");
    }

    @Override
    public String getInfo() {
        return this.toString();
    }
    
}
