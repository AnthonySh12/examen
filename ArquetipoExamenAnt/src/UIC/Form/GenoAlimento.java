package UIC.Form;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Infra.Style;

public class GenoAlimento extends JPanel implements ActionListener {
    private JButton btnCrearLarva;
    private JButton btnEliminar;
    private JButton btnGuardar;
    private JButton btnAlimentar;
    private JLabel lblMensaje;

    public GenoAlimento() {
        setLayout(new BorderLayout());

        
        lblMensaje = new JLabel("GenoAlimento - Alimentación de Hormigas", JLabel.CENTER);
        lblMensaje.setFont(new Font("Arial", Font.BOLD, 16));

        // Botón para simular la alimentación
        btnAlimentar = new JButton("Alimentar");
        btnAlimentar.addActionListener(this);

        //Boton para Cerrar
        btnCrearLarva = new JButton("Crear Larva");
        btnCrearLarva.addActionListener(this);

        //Boton para Eliminar
        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this);

        //Boton para Guardar
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this);



        JPanel pnlBoton = new JPanel();
        pnlBoton.add(btnCrearLarva);
        pnlBoton.add(btnAlimentar);
        pnlBoton.add(btnEliminar);
        pnlBoton.add(btnGuardar);

        // Agregar los componentes al panel
        add(lblMensaje, BorderLayout.CENTER);
        add(pnlBoton, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAlimentar) {
            Style.showMsg("Hormiga alimentada con éxito!");
        }
    }
}
