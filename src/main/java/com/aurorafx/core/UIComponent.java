package com.aurorafx.core;

public abstract class UIComponent {
    private String id;

    /**
     * Constructor to initialize the component with a unique ID.
     */
    public UIComponent(String id) {
        this.id = id;
    }

    /**
     * Renders the component on the screen.
     */
    public abstract void render();

    /**
     * Gets the component ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the component ID.
     */
    public void setId(String id) {
        this.id = id;
    }
}
