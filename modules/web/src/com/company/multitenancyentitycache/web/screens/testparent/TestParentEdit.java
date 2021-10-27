package com.company.multitenancyentitycache.web.screens.testparent;

import com.haulmont.cuba.gui.screen.*;
import com.company.multitenancyentitycache.entity.TestParent;

@UiController("multitenancyentitycache_TestParent.edit")
@UiDescriptor("test-parent-edit.xml")
@EditedEntityContainer("testParentDc")
@LoadDataBeforeShow
public class TestParentEdit extends StandardEditor<TestParent> {
}