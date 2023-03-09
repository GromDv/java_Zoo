import animals.cats;
import animals.dogs;
import animals.tigers;
import animals.base.animal;

/**
 * appZoo
 */
public class appZoo {

    public static void main(String[] args) {
        
        animal tom = new cats((float) 0.3, (float) 3.0, "Желтые", "Том", "Сиамский", true, "черный", "12.12.2012");
        animal tiger = new tigers((float) 1.2, 160, "blue", "tiger", "Africa", "12.1805");
        animal polkan = new dogs((float) 0.65, 56, "brown", "Polkan", "Ovcharka", true, "brown", "25.06.2015", true);

        System.out.println(tom.getInfo());
        System.out.println(tiger.getInfo());
        System.out.println(polkan.getInfo());
    }
}