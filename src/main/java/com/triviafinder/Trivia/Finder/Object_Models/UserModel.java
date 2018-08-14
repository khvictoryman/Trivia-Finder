package com.triviafinder.Trivia.Finder.Object_Models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // This tells Hibernate to make a table out of this class
public class UserModel {

   @Id
   @GeneratedValue
    private Integer id;

    @NotNull(message = "This entry is required!")
    @NotEmpty(message = "This entry is required!")
    private String firstName;

    @NotNull(message = "This entry is required!")
    @NotEmpty(message = "This entry is required!")
    private String lastName;

    @NotNull(message = "This entry is required!")
    @NotEmpty(message = "This entry is required!")
    private String username;

    @NotNull(message = "This entry is required!")
    @NotEmpty(message = "This entry is required!")
    @Size(min = 6, max = 200, message
            = "Password must be at least 6 characters long and less than 200.")
    private String password;

    @NotNull(message = "This entry is required!")
    @NotEmpty(message = "This entry is required!")
    private String matchingPassword;

    @NotNull(message = "This entry is required!")
    @NotEmpty(message = "This entry is required!")
    @Email(message = "Please enter a valid email address.")
    private String email;

    @NotNull(message = "This entry is required!")
    @NotEmpty(message = "This entry is required!")
    @Max(value = 6, message = "Please enter a proper 6 digit area code.")
    private Integer zipcode;


    // standard getters and setters
    public Integer getId() {
        return id;
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
