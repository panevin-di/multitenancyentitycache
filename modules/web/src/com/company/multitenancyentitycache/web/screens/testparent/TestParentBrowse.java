package com.company.multitenancyentitycache.web.screens.testparent;

import com.haulmont.cuba.gui.screen.*;
import com.company.multitenancyentitycache.entity.TestParent;

@UiController("multitenancyentitycache_TestParent.browse")
@UiDescriptor("test-parent-browse.xml")
@LookupComponent("testParentsTable")
@LoadDataBeforeShow
public class TestParentBrowse extends StandardLookup<TestParent> {
}