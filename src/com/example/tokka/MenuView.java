package com.example.tokka;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Button;

@SuppressWarnings("serial")
public class MenuView extends NavigationView {

    public MenuView() {
        setCaption("Tokka");
        
        final Button editButton=new Button("Edit");
        setRightComponent(editButton);
    };
}
