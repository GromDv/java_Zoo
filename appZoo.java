import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import animals.cats;
import animals.chiks;
import animals.dogs;
import animals.storks;
import animals.tigers;
import animals.wolf;
import animals.base.pets;
import animals.base.zoo;

/**
 * appZoo
 */
public class appZoo {

    private static Scanner inpt = new Scanner(System.in);

    public static void main(String[] args) {

        // Вариант на ArrayList
        // zoopark zooList = new zoopark();
        mycollection zooList = new mycollection();

        zoo tom = new cats((float) 0.3, (float) 3.0, "Желтые", "Кот", "Сиамский", true, "черный", "12.12.2012", "Том");
        zooList.add(tom);

        zoo tiger = new tigers((float) 1.2, 160, "blue", "tiger", "Africa", "12.1805");
        zooList.add(tiger);

        zoo polkan = new dogs((float) 0.65, 56, "brown", "Собака", "Ovcharka", true, "brown", "25.06.2015", "Полкан",
                true);
        zooList.add(polkan);

        zoo volk = new wolf((float) 1.0, 100, "grey", "волк", "лес", "15.16.2001", true);
        zooList.add(volk);

        zoo chik = new chiks("Курица", (float) .3, 2, "желтые", 0);
        zooList.add(chik);

        zoo aist = new storks("Аист", 1, 5, "зеленые", 200);
        zooList.add(aist);

        while (true) {
            switch (getUserChoice()) {
                case 1:
                    zooList.addNewAnimal(getUserAddNew());
                    break;
                case 2:
                    System.out.print("Укажите номер по порядку, кого удалить:");
                    zooList.remove(getUserNumber());
                    break;
                case 3:
                    System.out.print("Укажите номер по порядку, кого посмотреть:");
                    zooList.printInfo(getUserNumber());
                    break;
                case 4:
                    zooList.printList();
                    break;
                case 5:
                    System.out.print("Укажите номер по порядку, кого послушать:");
                    zooList.doSound(getUserNumber());
                    break;
                case 6:
                    zooList.doSoundList();
                    break;
                case 7:
                    zooList.abilityList();
                    break;
                case 8:
                    return;
                default:
                    break;
            }
        }
    }

    public static int getUserChoice() {
        System.out.println("======================================================");
        System.out.println("Чтобы выполнить операцию введите номер:");
        System.out.println("   1 - добавить новое животное;");
        System.out.println("   2 - убрать какое-либо животное;");
        System.out.println("   3 - посмотреть инфо о животном;");
        System.out.println("   4 - посмотреть инфо обо всех животных;");
        System.out.println("   5 - заставить животное издать звук;");
        System.out.println("   6 - заставить всех животных издать звуки;");
        System.out.println("   7 - показать способности животных;");
        System.out.println("   8 - закончить.");
        return inpt.nextInt();
    }

    public static int getUserAddNew() {
        System.out.println("Укажите номер, кого будем добавлять:");
        System.out.println("   1. Кот");
        System.out.println("   2. Собака");
        System.out.println("   3. Тигр");
        System.out.println("   4. Волк");
        System.out.println("   5. Курица");
        System.out.println("   6. Аист");
        return inpt.nextInt();
    }

    public static int getUserNumber() {
        return inpt.nextInt();
    }

    public static float getUserFloat() {
        return inpt.nextFloat();
    }

    public static String getUserStr() {
        return inpt.next();
    }
}