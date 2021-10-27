package com.company.multitenancyentitycache.web.screens.testchild2;

import com.haulmont.cuba.gui.screen.*;
import com.company.multitenancyentitycache.entity.TestChild2;

@UiController("multitenancyentitycache_TestChild2.edit")
@UiDescriptor("test-child2-edit.xml")
@EditedEntityContainer("testChild2Dc")
@LoadDataBeforeShow
public class TestChild2Edit extends StandardEditor<TestChild2> {
}