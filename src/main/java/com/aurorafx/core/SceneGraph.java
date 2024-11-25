package com.aurorafx.core;

import java.util.ArrayList;
import java.util.List;

public class SceneGraph {
    private final List<UIComponent> components;

    /**
     * Constructor to initialize the SceneGraph.
     */
    public SceneGraph() {
        components = new ArrayList<>();
    }

    /**
     * Adds a component to the scene.
     */
    public void addComponent(UIComponent component) {
        components.add(component);
        System.out.println("Added component: " + component.getId());
    }

    /**
     * Removes a component from the scene.
     */
    public void removeComponent(UIComponent component) {
        components.remove(component);
        System.out.println("Removed component: " + component.getId());
    }

    /**
     * Renders all components in the scene.
     */
    public void renderScene() {
        System.out.println("Rendering Scene...");
        for (UIComponent component : components) {
            component.render();
        }
    }
}
