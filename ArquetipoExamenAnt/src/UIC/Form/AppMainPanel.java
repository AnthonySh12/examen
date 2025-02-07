package UIC.Form;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Infra.Style;

public class AppMainPanel extends JPanel {
    public AppMainPanel(){
        customizeComponent();
    }

    private void customizeComponent() {
        
        setLayout(new BorderLayout());
        
      
        JLabel infoLabel = new JLabel("Programacion 2    Cedula: 1754860052    Nombre: Anthony Gamboa", JLabel.CENTER);
        add(infoLabel, BorderLayout.SOUTH);
        
      
        try {
            ImageIcon imageIcon = new ImageIcon(Style.URL_MAIN);
            JLabel imageLabel = new JLabel(imageIcon);
            add(imageLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            Style.showMsgError("No se encuentra la imagen");
        }
        
        setPreferredSize(new Dimension(1000, 700));
    }
}
