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
}
