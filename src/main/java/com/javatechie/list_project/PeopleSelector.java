package com.javatechie.list_project;

import java.util.List;

public interface PeopleSelector {
    List<String> selectPeople(List<String> allPeople, List<String> fixedPeople);
}
