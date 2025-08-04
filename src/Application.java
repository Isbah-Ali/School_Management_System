/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bjc
 */
public class Application {
    private String role;
    private String type;
    private String details;

    public Application(String role, String type, String details) {
        this.role = role;
        this.type = type;
        this.details = details;
    }

    public String getRole() { return role; }
    public String getType() { return type; }
    public String getDetails() { return details; }
}

