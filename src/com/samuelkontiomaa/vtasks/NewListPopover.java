package com.samuelkontiomaa.vTasks;

import com.vaadin.addon.touchkit.ui.Popover;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;

public class NewListPopover extends Popover {
	public NewListPopover() {
		setWidth("350px");
		setHeight("65%");
		
		final VerticalComponentGroup content = new VerticalComponentGroup();
		
		final TextField nameField = new TextField("List Name");
        nameField.setInputPrompt("Wishlist");
        content.addComponent(nameField);
        
        final Button submitButton = new Button("Add");
        content.addComponent(submitButton);
        
        setContent(content);
	}
}
