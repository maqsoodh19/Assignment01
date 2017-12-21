package com.example.maqso.assignment01;

/**
 * Created by maqso on 10/2/2017.
 */

public class Contacts {
    private String name;
    private int phoneNO;

    public Contacts(String name, int phoneNO) {
        this.name = name;
        this.phoneNO = phoneNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(int phoneNO) {
        this.phoneNO = phoneNO;
    }
}
