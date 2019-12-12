package org.openjfx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.FocusModel;

public class Controller {

    private Model model;
    private List<Bank> bankList = new ArrayList<Bank>(); //for testing
    private List<Person> personList = new ArrayList<Person>(); //for testing
    private List<Account> accountList = Model.getList();


    public Controller(Model model) {
        this.model = model;
        createPerson();
        createBank();
        createAccount();
    }

    public List getList(String s) {
        switch(s) {
            case "personList":
                return personList;
            case "bankList":
                return bankList;
            case "accountList":
                return accountList;
            default:
                System.out.println("Wrong input");
        }
    }

    public Model getModel() {
        return Model;
    }

    private void createPerson() {
        Person personA = new Person("FirstA","LastA",20);
        Person personB = new Person("FirstB","LastB",21);
        Person personC = new Person("FirstC","LastC",22);
        Person personD = new Person("FirstD","LastD",23);
        Person personE = new Person("FirstE","LastE",24);
        Person personF = new Person("FirstF","LastF",25);
        Person personG = new Person("FirstG","LastG",26);
    }

    private void createBank() {
        Bank bankA = new Bank("SEB");
        Bank bankB = new Bank("Swedbank");
        Bank bankC = new Bank("Handelsbanken");
        Bank bankD = new Bank("Nordea");
    }

    private void createAccount() {
        accountList.add(Account account1 = new Account(1, bankA, personA));
        accountList.add(Account account2 = new Account(2, bankA, personB));
        accountList.add(Account account3 = new Account(3, bankA, personC));
        accountList.add(Account account4 = new Account(4, bankB, personD));
        accountList.add(Account account5 = new Account(5, bankB, personE));
        accountList.add(Account account6 = new Account(6, bankB, personF));
        accountList.add(Account account7 = new Account(7, bankC, personF));
        accountList.add(Account account8 = new Account(8, bankC, personG));
        accountList.add(Account account9 = new Account(9, BankC, personG));
    }
}