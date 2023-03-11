package animals;

import animals.base.wild;

public class wolf extends wild {

    protected boolean leader;

    public wolf(float height, float weight, String eyeColor, String name, String areal, String foundDate, boolean leader) {
        super(height, weight, eyeColor, name, areal, foundDate);
        this.leader = leader;
    }

    @Override
    public String doSound() {
        return String.format("Ууууууу.");
    }

    @Override
    public String getInfo() {
        return String.format("%s вожак:%s", super.getInfo(), leader ? "Да" : "Нет");
    }
    
}
