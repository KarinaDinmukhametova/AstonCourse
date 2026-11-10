package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


    public class Phone {
        private Map<String, List<String>> directory;


        public Phone() {
            this.directory = new HashMap<>();
        }

        public void add(String surname, String phoneNumber) {
            directory.putIfAbsent(surname, new ArrayList<>());
            directory.get(surname).add(phoneNumber);
        }



        public void get(String surname) {
            if (directory.containsKey(surname)) {
                List<String> phones = directory.get(surname);
                System.out.println("Телефоны для фамилии " + surname + ": " + phones);
            } else {
                System.out.println("Фамилия " + surname + " нет в справочнике.");
            }
        }
    }


