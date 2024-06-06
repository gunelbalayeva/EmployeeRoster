package com.javatechie.list_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MainController {

    @GetMapping("/api/roster")
    public RosterResponse getRoster() {
        List<String> allPeople = PeopleSelectorUtil.initializePeople();
        List<String> fixedPeople = PeopleSelectorUtil.initializeFixedPeople();

        PeopleSelector peopleSelector = new PeopleSelectorUtil();
        List<String> selectedPeople = peopleSelector.selectPeople(allPeople, fixedPeople);

        Date currentDate = new Date();

        return new RosterResponse(currentDate, selectedPeople);
    }

    static class RosterResponse {
        private Date date;
        private List<String> roster;

        public RosterResponse(Date date, List<String> roster) {
            this.date = date;
            this.roster = roster;
        }

        public Date getDate() {
            return date;
        }

        public List<String> getRoster() {
            return roster;
        }
    }
}
