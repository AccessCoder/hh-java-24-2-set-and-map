package de.neuefische;

import java.util.HashMap;
import java.util.Map;

/**
 * Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
 *
 * Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.
 *
 * Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.
 *
 * Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.
 *
 * Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.
 *
 * Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
 */
public class Pharmacy {

    private Map<String, Medication> medications = new HashMap<>();

    public int getCount(){
        return medications.size();
    }

    public void save(Medication medication){
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName){
        return medications.get(medicationName);
    }

    public void delete(String medicationName){
        medications.remove(medicationName);
    }

    public void printAllMeds(){
        for (Medication medication:medications.values()) {
            System.out.println(medication);
        }
    }
}
