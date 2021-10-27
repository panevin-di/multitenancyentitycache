package com.company.multitenancyentitycache.entity;

import com.haulmont.addon.sdbmt.entity.StandardTenantEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "MULTITENANCYENTITYCACHE_TEST_CHILD")
@Entity(name = "multitenancyentitycache_TestChild")
@NamePattern("%s|test")
public class TestChild extends StandardTenantEntity {

    private static final long serialVersionUID = -2254996934391169265L;

    @Column(name = "TEST")
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}