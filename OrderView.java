import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class OrderView extends JFrame{

    private JButton toMain = new JButton("Go To Main");
    private DefaultTableModel items = new DefaultTableModel(); // store information for the table!
    private JTable tblItems = new JTable(items);
    DataAdapter dataAdapter;
    public OrderView() {
        this.setTitle("Order Details");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(400, 600);
        items.addColumn("Order ID");
        items.addColumn("CustomerName");
        items.addColumn("Total Price");
        items.addColumn("Total Tax");
        items.addColumn("Date");
        JPanel panelOrder = new JPanel();
        panelOrder.setPreferredSize(new Dimension(400, 450));
        panelOrder.setLayout(new BoxLayout(panelOrder, BoxLayout.PAGE_AXIS));
        tblItems.setBounds(0, 0, 500, 350);
        panelOrder.add(tblItems.getTableHeader());
        panelOrder.add(tblItems);
        tblItems.setFillsViewportHeight(true);
        this.getContentPane().add(panelOrder);

        JPanel panelButton = new JPanel();
        panelButton.setPreferredSize(new Dimension(400, 100));
        panelButton.add(toMain);
        this.getContentPane().add(panelButton);
    }
    public JButton getToMain() {
        return toMain;
    }

}
