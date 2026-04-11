/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UStorie;

import java.awt.*;
import javax.swing.*;

public class TareaRenderer extends JPanel implements ListCellRenderer<TareasItem> {

    private JLabel lblTitulo;
    private JLabel lblEstado;
    private JLabel lblFecha;

    public TareaRenderer() {
        setLayout(new BorderLayout(10, 5));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lblTitulo = new JLabel();
        lblEstado = new JLabel();
        lblFecha = new JLabel();

        JPanel panelTexto = new JPanel();
        panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.Y_AXIS));
        panelTexto.setOpaque(false);

        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblEstado.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblFecha.setFont(new Font("Segoe UI", Font.BOLD, 12));

        panelTexto.add(lblTitulo);
        panelTexto.add(lblEstado);

        add(panelTexto, BorderLayout.CENTER);
        add(lblFecha, BorderLayout.EAST);
    }

    @Override
    public Component getListCellRendererComponent(
        JList<? extends TareasItem> list,
        TareasItem value,
        int index,
        boolean isSelected,
        boolean cellHasFocus) {

    lblTitulo.setText(value.titulo);
    lblEstado.setText(value.estado);
    lblFecha.setText(value.fecha);

    String estado = value.estado.trim().toLowerCase();

    if (isSelected) {
        setBackground(new Color(0, 102, 255));
        lblTitulo.setForeground(Color.WHITE);
        lblEstado.setForeground(Color.WHITE);
        lblFecha.setForeground(Color.RED);
    } else {
        setBackground(Color.WHITE);

        lblTitulo.setForeground(Color.BLACK);

        lblFecha.setForeground(new Color(255, 102, 102));

        if (estado.equals("vencida")) {
            lblEstado.setForeground(new Color(255, 102, 102)); 
        } else if (estado.equals("calificado")) {
            lblEstado.setForeground(new Color(0, 153, 0));
        } else if (estado.equals("activa")) {
            lblEstado.setForeground(Color.GRAY); 
        } else {
            lblEstado.setForeground(Color.GRAY);
        }
    }

    setOpaque(true);

    return this;
}
}
