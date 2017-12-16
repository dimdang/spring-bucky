package com.bucky.crazy.model.core;

import com.bucky.crazy.model.core.AbstractEntities;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Dang Dim
 * Date     : 09-Dec-17, 3:04 PM
 * Email    : d.dim@gl-f.com
 */
@Entity
@Table(name = "td_user")
public class Users extends AbstractEntities {

    String firstName;
    String lastName;
    String login;
    String password;
    String email;
    Boolean userStatus;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    @Override
    public Long getId() {
        return null;
    }

    @Column(name = "usr_code")
    @Override
    public String getCode() {
        return null;
    }

    @Column(name = "usr_desc")
    @Override
    public String getDesc() {
        return null;
    }

    @Column(name = "usr_fir_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "usr_las_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "usr_login", nullable = false)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "usr_pwd", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "usr_email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "usr_active")
    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }
}
