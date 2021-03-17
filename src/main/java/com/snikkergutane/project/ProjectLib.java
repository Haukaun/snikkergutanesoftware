package com.snikkergutane.project;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * A collection of projects.
 * Handles creation, editing and
 * deletion of projects in the application.
 */
public class ProjectLib {
    private final TreeMap<String, Project> projects;

    public ProjectLib() {
        this.projects = new TreeMap<>();
    }
    /**
     * Returns the project with given name.
     * @param name name of the project.
     * @return {@code Project} the project with given name.
     */
    public Project getProject(String name) {
        //TODO: Handle NullPointerExceptions.
        return projects.get(name);
    }

    /**
     * Adds a project to the collection.
     * @param project the project to be added.
     */
    public void addProject(Project project) {
        //TODO: Handle NullPointerExceptions.
        this.projects.put(project.getName(),project);
    }

    /**
     * Removes a project from the collection.
     * @param name the name of the project to be removed.
     */
    public void removeProject(String name) {
        //TODO: Handle NullPointerExceptions.
        projects.remove(name);
    }

    /**
     * Returns a list of all projects in the collection in a String format.
     * @return A {@code String} list of all projects in the collection.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String name : projects.keySet()) {
            sb.append(name).append("\n");
        }
        return sb.toString();
    }

    /**
     * Returns the names of all projects as a list of Strings.
     * @return A {@code List<String>} of all projects in the collection.
     */
    public List<String> listProjects() {
        return new ArrayList<>(projects.keySet());
    }
}