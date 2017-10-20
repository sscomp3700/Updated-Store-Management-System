import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderController implements ActionListener {
    private OrderView view;

    public OrderController(OrderView view) {
        this.view = view;
        view.getToMain().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Application.getInstance().getMainScreen().setVisible(true);
    }

}