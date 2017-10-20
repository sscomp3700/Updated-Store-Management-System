import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {

    private JButton btnCheckout = new JButton("Checkout");
    private JButton btnManage   = new JButton("Manage Product");

    public MainScreen() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);

        btnManage.setPreferredSize(new Dimension(320, 100));
        btnManage.setFont(new Font("Consolas", Font.BOLD, 24));
        btnManage.setForeground(Color.WHITE);
        btnManage.setBackground(Color.BLUE);
        btnCheckout.setPreferredSize(new Dimension(320, 100));
        btnCheckout.setFont(new Font("Consolas", Font.BOLD, 24));
        btnCheckout.setForeground(Color.WHITE);
        btnCheckout.setBackground(Color.BLUE);


        JLabel title = new JLabel("Store Management System");
        title.setFont(new Font("Consolas", Font.BOLD, 55));
        title.setForeground(Color.BLUE);
        JPanel panelTitle = new JPanel();
        panelTitle.add(title);
        this.getContentPane().add(panelTitle);

        JPanel panelButton = new JPanel();
        panelButton.add(btnCheckout);
        panelButton.add(btnManage);

        this.getContentPane().add(panelButton);

        btnCheckout.addActionListener(new ActionListener() { // when controller is simple, we can declare it on the fly
            public void actionPerformed(ActionEvent e) {
                Application.getInstance().getCheckoutScreen().setVisible(true);            }
        });


        btnManage.addActionListener(new ActionListener() { // when controller is simple, we can declare it on the fly
            public void actionPerformed(ActionEvent e) {
                Application.getInstance().getProductView().setVisible(true);
            }
        });
    }


}
