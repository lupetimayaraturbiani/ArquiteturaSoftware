package org.example.view;

import org.example.model.Pedido;

import javax.swing.*;
import java.awt.*;

public class PedidoView extends JFrame{
    private JLabel label;

    public PedidoView(Pedido p){
        super("Pedido " + p.getId());
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel(p.toString());
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        add(label);
    }

    public void atualizar(Pedido p){
        label.setText(p.toString());
        repaint();
    }
}
