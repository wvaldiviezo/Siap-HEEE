package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.OrganosSistemasDAO;
import com.heee.bean.model.entity.Organossistemas;

public class JPAOrganosSistemasDAO extends JPAGenericDAO<Organossistemas, Integer> implements OrganosSistemasDAO {

    public JPAOrganosSistemasDAO() {
        super(Organossistemas.class);
    }
}
