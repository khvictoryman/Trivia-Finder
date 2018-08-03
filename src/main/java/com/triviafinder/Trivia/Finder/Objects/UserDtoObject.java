package com.triviafinder.Trivia.Finder.Objects;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
///import javax.persistence.Entity;
///import javax.persistence.GeneratedValue;
///import javax.persistence.GenerationType;
///import javax.persistence.Id;
///@Entity // This tells Hibernate to make a table out of this class
public class UserDtoObject {
///    @Id
///    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private Integer zipcode;


    // standard getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull String lastName) {
        this.lastName = lastName;
    }

    @NotNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    @NotNull
    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(@NotNull Integer zipcode) {
        this.zipcode = zipcode;
    }


}
