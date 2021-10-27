package com.company.multitenancyentitycache.web.screens.testchild;

import com.haulmont.cuba.gui.screen.*;
import com.company.multitenancyentitycache.entity.TestChild;

@UiController("multitenancyentitycache_TestChild.edit")
@UiDescriptor("test-child-edit.xml")
@EditedEntityContainer("testChildDc")
@LoadDataBeforeShow
public class TestChildEdit extends StandardEditor<TestChild> {
}