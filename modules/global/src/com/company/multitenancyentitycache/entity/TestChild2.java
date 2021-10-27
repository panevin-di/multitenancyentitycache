package com.company.multitenancyentitycache.entity;

import com.haulmont.addon.sdbmt.entity.StandardTenantEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "MULTITENANCYENTITYCACHE_TEST_CHILD2")
@Entity(name = "multitenancyentitycache_TestChild2")
@NamePattern("%s|test")
public class TestChild2 extends StandardTenantEntity {

    private static final long serialVersionUID = -3630633242777103220L;

    @Column(name = "TEST")
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}