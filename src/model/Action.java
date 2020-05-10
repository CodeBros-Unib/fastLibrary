package model;

import javax.swing.JOptionPane;

public class Action {
    public static void validaUser() {
        String user = view.Tela1.user.getText();
        String password = view.Tela1.password.getText();
        
        if(
            (!user.equals("gustavo") && !password.equals("unib2020"))
                || (!user.equals("jason") && !password.equals("unib2020"))
                    || (!user.equals("leonardo") && !password.equals("unib2020"))
                        || (!user.equals("becari") && !password.equals("unib2020"))     
        ) {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido");
            new view.Tela1().setVisible(true);
        } else {
            new view.Tela2().setVisible(true);
        }
    }
}
