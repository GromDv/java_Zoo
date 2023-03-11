import java.util.ArrayList;
import java.util.List;

import animals.base.zoo;

public class zoopark {

    private List<zoo> zoopark;

    public zoopark() {
        this.zoopark = new ArrayList<>();
    }

    public void add(zoo o) {
        zoopark.add(o);
    }

    public void remove(zoo o) {
        zoopark.remove(0);
    }

    public void printList() {
        System.out.println();
        for (zoo zoo : zoopark) {
            System.out.println(zoo.getInfo());
        }
    }

}
