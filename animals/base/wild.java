package animals.base;

public abstract class wild extends animal {
    public wild(float height, float weight, String eyeColor, String name, String areal, String foundDate) {
        super(name, height, weight, eyeColor);
        this.name = name;
        this.areal = areal;
        this.foundDate = foundDate;
    }

    protected String areal;
    protected String foundDate;

    @Override
    public String getInfo() {
        return String.format("Название: %s, найден: %s(%s), %s", name, foundDate, areal, super.getInfo());
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        this.areal = areal;
    }

    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    };
}
