package com.company.multitenancyentitycache.entity;

import com.haulmont.addon.sdbmt.entity.StandardTenantEntity;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "MULTITENANCYENTITYCACHE_TEST_PARENT")
@Entity(name = "multitenancyentitycache_TestParent")
public class TestParent extends StandardTenantEntity {

    private static final long serialVersionUID = 6887610406198431963L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHILD_ID")
    private TestChild child;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHILD2_ID")
    private TestChild2 child2;

    public TestChild2 getChild2() {
        return child2;
    }

    public void setChild2(TestChild2 child2) {
        this.child2 = child2;
    }

    public TestChild getChild() {
        return child;
    }

    public void setChild(TestChild child) {
        this.child = child;
    }
}