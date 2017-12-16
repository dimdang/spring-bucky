package com.bucky.crazy.repositories.repositoryImpl;

import com.bucky.crazy.model.core.Users;
import com.bucky.crazy.repositories.UserEntityDao;

/**
 * Created by Dang Dim
 * Date     : 16-Dec-17, 3:56 PM
 * Email    : d.dim@gl-f.com
 */
public class UserEntityDaoImpl extends AbstractEntityDao implements UserEntityDao {


    @Override
    public Users saveUpdateUser(Users users) {
        if (users != null){
            saveUpdate(users);
            return users;
        }
        return null;
    }
}
