package animals.base;

public abstract class wild extends animal {
    public wild(float height, float weight, String eyeColor, String name, String areal, String foundDate) {
        super(height, weight, eyeColor);
        this.name = name;
        this.areal = areal;
        this.foundDate = foundDate;
    }

    protected String name;
    protected String areal;
    protected String foundDate;

    @Override
    public String toString() {
        return String.format("Название: %s, найден: %s(%s), Выс:%.2fм Вес:%.1fкг Глаза-%s", name, foundDate, areal, super.getHeight(), super.getWeight(), super.getEyeColor());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
