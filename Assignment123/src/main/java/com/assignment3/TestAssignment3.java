package com.assignment3;

public class TestAssignment3 {

    public static void main(String[] args) {
        Employee teamLead = new TeamLead();
        Employee moduleLead = new ModuleLead();
        Employee projectManager = new ProjectManager();

        teamLead.doWork();
        moduleLead.doWork();
        projectManager.doWork();
    }
}
