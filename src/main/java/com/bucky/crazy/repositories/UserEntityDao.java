package com.bucky.crazy.repositories;

import com.bucky.crazy.model.core.Users;

/**
 * Created by Dang Dim
 * Date     : 16-Dec-17, 3:28 PM
 * Email    : d.dim@gl-f.com
 */

public interface UserEntityDao extends EntityDao {

    Users saveUpdateUser(Users users);
}
