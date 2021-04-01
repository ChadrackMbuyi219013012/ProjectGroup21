/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.projectgroup21;

/**
 *
 * @author Matthew Jones
 * Student Number:220077681
 * 
 */
public class JavaAccount 
{
    private String name, surname, account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    @Override
    public String toString() {
        return "JavaAccount{" + "name=" + name + ", surname=" + surname + ", account=" + account + '}';
    }
}
