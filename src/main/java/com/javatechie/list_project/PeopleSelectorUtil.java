package com.javatechie.list_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PeopleSelectorUtil implements PeopleSelector {

    @Override
    public List<String> selectPeople(List<String> allPeople, List<String> fixedPeople) {
        Random random = new Random();
        allPeople.removeAll(fixedPeople);

        List<String> selectedPeople = new ArrayList<>();

        while (!allPeople.isEmpty()) {
            int index = random.nextInt(allPeople.size());
            selectedPeople.add(allPeople.remove(index));
        }

        selectedPeople.add(3, "Ilaheddin");
        selectedPeople.add(5, "Kerem");

        return selectedPeople;
    }

    public static List<String> initializePeople() {
        List<String> allPeople = new ArrayList<>();
        allPeople.add("Rizvan");
        allPeople.add("Deyanet");
        allPeople.add("Metin");
        allPeople.add("Nizami");
        allPeople.add("Raqif");
        allPeople.add("Ilaheddin");
        allPeople.add("Kerem");
        return allPeople;
    }

    public static List<String> initializeFixedPeople() {
        List<String> fixedPeople = new ArrayList<>();
        fixedPeople.add("Ilaheddin");
        fixedPeople.add("Kerem");
        return fixedPeople;
    }
}
