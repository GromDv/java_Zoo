import javax.swing.GrayFilter;

import animals.cats;
import animals.chiks;
import animals.dogs;
import animals.storks;
import animals.tigers;
import animals.wolf;
import animals.base.animal;
import animals.base.birds;

/**
 * appZoo
 */
public class appZoo {

    public static void main(String[] args) {
        
        animal tom = new cats((float) 0.3, (float) 3.0, "Желтые", "Том", "Сиамский", true, "черный", "12.12.2012");
        animal tiger = new tigers((float) 1.2, 160, "blue", "tiger", "Africa", "12.1805");
        animal polkan = new dogs((float) 0.65, 56, "brown", "Polkan", "Ovcharka", true, "brown", "25.06.2015", true);
        animal volk = new wolf((float) 1.0, 100, "grey", "волк", "лес", "15.16.2001", true);
        birds chik = new chiks("Курица", 0);
        birds aist = new storks("aist", 200);
        

        System.out.println(tom.getInfo());
        System.out.println(tiger.getInfo());
        System.out.println(polkan.getInfo());
        System.out.println(volk.getInfo());
        System.out.println(chik.getInfo());
        System.out.println(aist.getInfo());
    }
}