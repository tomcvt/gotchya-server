package com.tomcvt.gotchya.server.auth;

import com.tomcvt.gotchya.server.util.GenUtils;

import jakarta.persistence.Entity;

@Entity
public class UserAccount {
    private String username;
    private String XID12 = GenUtils.generateSecureXID12();
    private String password;
    private String email;
    private String role;
    private boolean enabled = true;
    public UserAccount() {
        // Default constructor for JPA
    }
    public UserAccount(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getXID12() {
        return XID12;
    }
    public void setXID12(String XID12) {
        this.XID12 = XID12;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
}
