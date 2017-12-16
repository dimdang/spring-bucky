package com.bucky.crazy.services.UserServiceImp;

import com.bucky.crazy.model.core.Users;
import com.bucky.crazy.repositories.EntityDao;
import com.bucky.crazy.repositories.UserEntityDao;
import com.bucky.crazy.services.UserEntityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dang Dim
 * Date     : 16-Dec-17, 2:49 PM
 * Email    : d.dim@gl-f.com
 */

@Service
public class UserEntityServiceImpl extends AbstractEntityService implements UserEntityServices {

    @Autowired
    private UserEntityDao userEntityDao;

    @Override
    public Users saveUpdateUser(Users users) {
        return userEntityDao.saveUpdateUser(users);
    }

    @Override
    public EntityDao getDao() {
        return userEntityDao;
    }
}
