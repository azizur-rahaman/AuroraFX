package com.aurorafx.components;

import com.aurorafx.core.UIComponent;

public class UIButton extends UIComponent {
    private String text;

    super;

    public UIButton(String text){
        this.text = text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void onClick(){
        System.out.println("Button Clicked: " + text);
    }

    
}