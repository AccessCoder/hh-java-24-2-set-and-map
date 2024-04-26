package de.neuefische;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> listWithDuplication = new ArrayList<>(List.of("Hallo", "Hallo", "Hallo", "Ciao"));

        Set<String> stringSet = new HashSet<>(listWithDuplication);

        List<String> listWithoutDuplication = new ArrayList<>(stringSet);

        System.out.println(listWithoutDuplication);

        // Schlüssel, Objekt
        Map<Integer, String> stringMap = new HashMap<>();

        //add
        stringMap.put(1, "Jasmin");
        stringMap.put(1245, "Pascal");

        //get
        stringMap.get(1);

        //gibt es die ID?
        stringMap.containsKey(15);

        //Isoliere auf Values oder Keys
        System.out.println(stringMap.values());
        System.out.println(stringMap.keySet());


        Medication med1 = new Medication("Aspirin", "1000", 5.99);
        Medication med2 = new Medication("Ibu", "100000", 2.99);

        Pharmacy pharmacy = new Pharmacy();

        pharmacy.save(med1);
        pharmacy.save(med2);

        System.out.println("Meds in Pharmacy: " + pharmacy.getCount());

        pharmacy.printAllMeds();

    }
}