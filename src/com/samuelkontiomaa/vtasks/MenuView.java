package com.samuelkontiomaa.vTasks;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.Popover;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class MenuView extends NavigationView {

	private Button newListButton;
	private boolean showButton = false;
	final Button editButton=new Button("Edit");
    public MenuView() {
        setCaption("Tokka");
        
        editButton.addClickListener(new ClickListener(){
        	@Override
        	public void buttonClick(ClickEvent event){
        		if(showButton){
        			newListButton.setVisible(false);
        			editButton.setCaption("Edit");
        			showButton=false;
        		}
        		else{
        			showButton=true;
        			editButton.setCaption("Done");
        			newListButton.setVisible(true);
        		}
        	}
        });
        
        newListButton = new Button("+ New list");
        newListButton.setVisible(false);
        
        newListButton.addClickListener(new ClickListener(){
        	@Override
        	public void buttonClick(ClickEvent event){
        		NewListPopover popover = new NewListPopover();
        		popover.showRelativeTo(newListButton);
        	}
        });
        
        setRightComponent(editButton);
        setContent(newListButton);
    };
}
