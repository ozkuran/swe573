package com.ozkuran.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by MahmutAli on 5/19/2016.
 */
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String lastname;

    private String password;

    @ManyToOne
    private Role role;

    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    @Pattern(regexp="(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@boun.edu.tr",
            message="{invalid.email}")
    private String email;

    @Size(min=10)
    @Pattern(regexp="(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]\u200C\u200B)\\s*)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)([2-9]1[02-9]\u200C\u200B|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})\\s*(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+)\\s*)?$",message="{invalid.telephone}")
    private String phonenumber;

    private Boolean membership;

    @OneToMany(mappedBy = "buyer")
    private List<Transaction> transactionListAsBuyer;

    @OneToMany(mappedBy = "seller")
    private List<Transaction> transactionListAsSeller;

    @OneToMany(mappedBy = "member")
    private List<Event> eventList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Boolean getMembership() {
        return membership;
    }

    public void setMembership(Boolean membership) {
        this.membership = membership;
    }

    public List<Transaction> getTransactionListAsBuyer() {
        return transactionListAsBuyer;
    }

    public void setTransactionListAsBuyer(List<Transaction> transactionListAsBuyer) {
        this.transactionListAsBuyer = transactionListAsBuyer;
    }

    public List<Transaction> getTransactionListAsSeller() {
        return transactionListAsSeller;
    }

    public void setTransactionListAsSeller(List<Transaction> transactionListAsSeller) {
        this.transactionListAsSeller = transactionListAsSeller;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}