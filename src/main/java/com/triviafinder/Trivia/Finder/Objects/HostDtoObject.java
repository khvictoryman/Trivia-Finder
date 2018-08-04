package com.triviafinder.Trivia.Finder.Objects;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class HostDtoObject {

    private Integer id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String address;

    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    private String webAddress;

    @NotNull
    @NotEmpty
    private String menuAddress;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public String getUsername() {
        return username;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    @NotNull
    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(@NotNull String webAddress) {
        this.webAddress = webAddress;
    }

    @NotNull
    public String getMenuAddress() {
        return menuAddress;
    }

    public void setMenuAddress(@NotNull String menuAddress) {
        this.menuAddress = menuAddress;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }
}
