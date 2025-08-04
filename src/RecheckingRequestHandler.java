/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bjc
 */
public class RecheckingRequestHandler extends RequestHandler {
    @Override
    public boolean handle(Application app) {
        if (app.getType().equalsIgnoreCase("Rechecking")) {
            System.out.println("Rechecking Request Approved");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(app);
        }
        return false;
    }
}

