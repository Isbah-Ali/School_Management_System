
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arham
 */
public class ViewFactory {
    public static UserRole createView(String role) {
        switch (role.toLowerCase()) {
            case "student":
                return new Welcome();
            case "teacher":
                return new TeacherPortal();
            case "admin":
                return new AdminFrame();
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }
}


