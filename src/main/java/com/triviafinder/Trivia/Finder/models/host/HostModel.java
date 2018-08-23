package com.triviafinder.Trivia.Finder.models.host;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class HostModel {

    @Id
    @GeneratedValue
    private Integer id;

    @GeneratedValue
    @ManyToOne
    private Integer host_id;

    @NotNull(message = "This field is required!")
    @NotEmpty(message = "This field is required!")
    private String name;

    @NotNull(message = "This field is required!")
    @NotEmpty(message = "This field is required!")
    private String address;

    @NotNull(message = "This field is required!")
    @NotEmpty(message = "This field is required!")
    @Email(message = "Please enter a valid email address.")
    private String email;

    @NotNull(message = "This field is required!")
    @NotEmpty(message = "This field is required!")
    @Size(min = 6, max = 200, message
            = "Password must be at least 6 characters long and less than 200.")
    private String password;

    @NotNull(message = "This field is required!")
    @NotEmpty(message = "This field is required!")
    private String matchingPassword;

    private String website;

    private String menu;

    @NotNull(message = "This field is required!")
    @NotEmpty(message = "This field is required!")
    private String description;

    @NotNull(message = "This field is required!")
    private Boolean hasFood;


    /// Getters and Setters


    public Integer getId() {
        return id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public String getAddress() {
        return address;
    }

    public void setAddress(@NotNull String address) {
        this.address = address;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    @NotNull
    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(@NotNull String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    @NotNull
    public Boolean getHasFood() {
        return hasFood;
    }

    public void setHasFood(@NotNull Boolean hasFood) {
        this.hasFood = hasFood;
    }

}
