import java.util.Scanner;

import animals.*;
import animals.base.*;

public class mycollection {

    private Object[] zCollection = new Object[0];
    private int length = 0;

    public void add(Object o) {
        Object[] newArray = new Object[this.zCollection.length + 1];
        int i = 0;
        if (this.zCollection.length > 0) {
            for (Object object : zCollection) {
                newArray[i++] = object;
            }
        }
        newArray[i] = o;
        this.zCollection = newArray;
        this.length++;
    }

    /**
     * Удаляет элемент массива с номером n
     * 
     * @param n
     */
    public void remove(int n) {
        n--;
        if (this.length > n) {
            Object[] newArray = new Object[this.length - 1];
            int j = 0;
            for (int i = 0; i < this.length; i++) {
                if (n != i)
                    newArray[j++] = zCollection[i];
            }
            this.zCollection = newArray;
            this.length--;
        } else {
            System.out.println("No such element!");
        }
    }

    public void printList() {
        System.out.println();
        for (int i = 0; i < this.length; i++) {
            System.out.printf("%d. %s\n", i + 1, ((zoo) zCollection[i]).getInfo());
        }
    }

    public void printInfo(int i) {
        i--;
        System.out.println(((zoo) zCollection[i]).getInfo());
    }

    public void doSound(int i) {
        i--;
        if (zCollection[i] instanceof animal)
            System.out.println(((animal) zCollection[i]).doSound());
        else
            System.out.println("No sounds!");
    }

    public void doSoundList() {
        System.out.println();
        for (int i = 0; i < this.length; i++) {
            if (zCollection[i] instanceof animal)
                System.out.printf("%d. %s\n", i + 1, ((animal) zCollection[i]).doSound());
        }
    }

    public void abilityList() {
        System.out.println();
        for (int i = 0; i < this.length; i++) {
            if (zCollection[i] instanceof birds)
                System.out.printf("%d. %s\n", i + 1, ((birds) zCollection[i]).toFly());
            if (zCollection[i] instanceof dogs)
                System.out.printf("%d. %s\n", i + 1, ((dogs) zCollection[i]).toTrain());
            if (zCollection[i] instanceof pets)
                System.out.printf("%d. %s\n", i + 1, ((pets) zCollection[i]).toFawn());
        }
    }

    public void addNewAnimal(int type) {
        Float ht, wt;
        String cly, typ, clr, dr, nn, arl;

        switch (type) {
            case 1:
                System.out.print("Высота/рост:");
                ht = appZoo.getUserFloat();
                System.out.print("Вес:");
                wt = appZoo.getUserFloat();
                System.out.print("Цвет глаз:");
                cly = appZoo.getUserStr();
                System.out.print("Порода:");
                typ = appZoo.getUserStr();
                System.out.print("Цвет:");
                clr = appZoo.getUserStr();
                System.out.print("Дата рождения:");
                dr = appZoo.getUserStr();
                System.out.print("Кличка:");
                nn = appZoo.getUserStr();
                this.add(new cats(ht, wt, cly, "Кот", typ, false, clr, dr, nn));
                break;
            case 2:
                System.out.print("Высота/рост:");
                ht = appZoo.getUserFloat();
                System.out.print("Вес:");
                wt = appZoo.getUserFloat();
                System.out.print("Цвет глаз:");
                cly = appZoo.getUserStr();
                System.out.print("Порода:");
                typ = appZoo.getUserStr();
                System.out.print("Цвет:");
                clr = appZoo.getUserStr();
                System.out.print("Дата рождения:");
                dr = appZoo.getUserStr();
                System.out.print("Кличка:");
                nn = appZoo.getUserStr();
                this.add(new dogs(ht, wt, cly, "Собака", typ, false, clr, dr, nn, false));
                break;
            case 3:
                System.out.print("Высота/рост:");
                ht = appZoo.getUserFloat();
                System.out.print("Вес:");
                wt = appZoo.getUserFloat();
                System.out.print("Цвет глаз:");
                cly = appZoo.getUserStr();
                System.out.print("Место обитания:");
                arl = appZoo.getUserStr();
                System.out.print("Дата нахождения:");
                dr = appZoo.getUserStr();
                this.add(new tigers(ht, wt, cly, "Тигр", arl, dr));
                break;
            case 4:
                System.out.print("Высота/рост:");
                ht = appZoo.getUserFloat();
                System.out.print("Вес:");
                wt = appZoo.getUserFloat();
                System.out.print("Цвет глаз:");
                cly = appZoo.getUserStr();
                System.out.print("Место обитания:");
                arl = appZoo.getUserStr();
                System.out.print("Дата нахождения:");
                dr = appZoo.getUserStr();
                this.add(new wolf(ht, wt, cly, "Волк", arl, dr, false));
                break;
            case 5:
                System.out.print("Высота/рост:");
                ht = appZoo.getUserFloat();
                System.out.print("Вес:");
                wt = appZoo.getUserFloat();
                System.out.print("Цвет глаз:");
                cly = appZoo.getUserStr();
                this.add(new chiks("Курица", ht, wt, cly, 0));
                break;
            case 6:
                System.out.print("Высота/рост:");
                ht = appZoo.getUserFloat();
                System.out.print("Вес:");
                wt = appZoo.getUserFloat();
                System.out.print("Цвет глаз:");
                cly = appZoo.getUserStr();
                System.out.print("Высота полета:");
                int alt = appZoo.getUserNumber();
                this.add(new chiks("Аист", ht, wt, cly, alt));
                break;
            default:
                break;
        }
    }

}
