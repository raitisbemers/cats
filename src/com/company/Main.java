package com.company;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        CatOwner catOwner = new CatOwner();
        catOwner.setOwnerName("Anna");
        catOwner.setPersonId("87-234");
        catOwner.setPhone("33333");
       // DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DATE_FIELD);

        Date date = new Date(1574, 11, 6 );
        catOwner.setDate(date);

        CatOwner catOwner2 = new CatOwner();
        catOwner2.setOwnerName("Juris");
        catOwner2.setPersonId("333-333");
        catOwner2.setPhone("111111");
        Date date2 = new Date(2000, 10, 11 );
        catOwner2.setDate(date2);


        Cat cat = new Cat();
        cat.setName("Muris");
        cat.setModel("bomz");
        cat.setCatId(6543L);
        cat.setCatOwner(catOwner);

        Cat cat2 = new Cat();
        cat2.setName("Pelecis");
        cat2.setModel("issspalvainais");
        cat2.setCatId(00000L);
        cat2.setCatOwner(catOwner2);

        System.out.println(catOwner);
        System.out.println(cat);
        System.out.println(cat2);

        System.out.println(catOwner2);
    }
}
