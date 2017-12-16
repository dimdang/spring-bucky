package com.bucky.crazy.services;

import com.bucky.crazy.model.core.Users;

/**
 * Created by Dang Dim
 * Date     : 09-Dec-17, 11:18 AM
 * Email    : d.dim@gl-f.com
 */
public interface UserEntityServices extends EntityService {

    Users saveUpdateUser(Users users);
}
