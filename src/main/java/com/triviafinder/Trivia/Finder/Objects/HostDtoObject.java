package com.triviafinder.Trivia.Finder.Objects;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.security.PrivateKey;

public class HostDtoObject {

    private Integer id;

    @NotEmpty
    @NotNull
    private String HostUserName;

    @NotEmpty
    @NotNull
    private String HostUserPhysAddress;

    @NotEmpty
    @NotNull
    private String HostUserEmail;

    @NotEmpty
    @NotNull
    private String HostUserPassword;

    private String HostUserWebsite;

    private String HostUserMenu;

    private String HostUserDescription;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    public String getHostUserName() {
        return HostUserName;
    }

    public void setHostUserName(@NotNull String hostUserName) {
        HostUserName = hostUserName;
    }

    @NotNull
    public String getHostUserPhysAddress() {
        return HostUserPhysAddress;
    }

    public void setHostUserPhysAddress(@NotNull String hostUserPhysAddress) {
        HostUserPhysAddress = hostUserPhysAddress;
    }

    @NotNull
    public String getHostUserEmail() {
        return HostUserEmail;
    }

    public void setHostUserEmail(@NotNull String hostUserEmail) {
        HostUserEmail = hostUserEmail;
    }

    @NotNull
    public String getHostUserPassword() {
        return HostUserPassword;
    }

    public void setHostUserPassword(@NotNull String hostUserPassword) {
        HostUserPassword = hostUserPassword;
    }

    public String getHostUserWebsite() {
        return HostUserWebsite;
    }

    public void setHostUserWebsite(String hostUserWebsite) {
        HostUserWebsite = hostUserWebsite;
    }

    public String getHostUserMenu() {
        return HostUserMenu;
    }

    public void setHostUserMenu(String hostUserMenu) {
        HostUserMenu = hostUserMenu;
    }

    public String getHostUserDescription() {
        return HostUserDescription;
    }

    public void setHostUserDescription(String hostUserDescription) {
        HostUserDescription = hostUserDescription;
    }
}
