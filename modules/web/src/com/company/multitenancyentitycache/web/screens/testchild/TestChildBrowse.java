package com.company.multitenancyentitycache.web.screens.testchild;

import com.haulmont.cuba.gui.screen.*;
import com.company.multitenancyentitycache.entity.TestChild;

@UiController("multitenancyentitycache_TestChild.browse")
@UiDescriptor("test-child-browse.xml")
@LookupComponent("testChildrenTable")
@LoadDataBeforeShow
public class TestChildBrowse extends StandardLookup<TestChild> {
}