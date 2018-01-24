package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.MenuDAO;
import com.heee.bean.model.entity.Menu;

public class JPAMenuDAO extends JPAGenericDAO<Menu, Integer> implements MenuDAO {

    public JPAMenuDAO() {
        super(Menu.class);
    }
}
