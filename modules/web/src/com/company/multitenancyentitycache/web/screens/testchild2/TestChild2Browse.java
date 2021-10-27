package com.company.multitenancyentitycache.web.screens.testchild2;

import com.haulmont.cuba.gui.screen.*;
import com.company.multitenancyentitycache.entity.TestChild2;

@UiController("multitenancyentitycache_TestChild2.browse")
@UiDescriptor("test-child2-browse.xml")
@LookupComponent("testChild2sTable")
@LoadDataBeforeShow
public class TestChild2Browse extends StandardLookup<TestChild2> {
}