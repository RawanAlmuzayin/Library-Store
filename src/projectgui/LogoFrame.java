package projectgui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class LogoFrame extends JFrame implements ActionListener {

    Container cp;
    JLabel img;
    JPanel p, p2;
    JButton b;
    JMenuBar mb;
    JMenu menu;
    JMenuItem Start, AllBook, Cart;
    Color color = new Color(202, 202, 140);
    ArrayList<Book> ArrayShopingCard = new ArrayList<Book>();

    public LogoFrame() {
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.setBackground(color);

        Start = new JMenuItem("HomePage");
        AllBook = new JMenuItem("All Books");
        Cart = new JMenuItem("Shopping Cart");

        Start.addActionListener(this);
        AllBook.addActionListener(this);
        Cart.addActionListener(this);

        menu = new JMenu("Menu");

        mb = new JMenuBar();

        menu.add(Start);
        menu.add(AllBook);
        menu.add(Cart);

        mb.add(menu);

        p = new JPanel(new BorderLayout());
        p.setBorder(BorderFactory.createTitledBorder("Welcome to the Library Store"));
        p.add(mb, BorderLayout.WEST);

        img = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("LogoBook-removebg-preview.png")).getImage().getScaledInstance(350, 250, Image.SCALE_DEFAULT)));
        cp.add(img);

        Icon icon = new ImageIcon(getClass().getResource("icons8-go-30.png"));
        JButton b = new JButton(icon);
        b.addActionListener(this);

        p2 = new JPanel();
        p2.add(b);

        cp.add(p, "North");
        cp.add(p2, "South");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocation(160, 5);
        setTitle("Library Store");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new AllBookFrame(ArrayShopingCard).setVisible(true);
        if (e.getSource().equals(Start)) {
            this.setVisible(false);
            new LogoFrame().setVisible(true);
        }
        if (e.getSource().equals(AllBook)) {
            this.setVisible(false);
            new AllBookFrame(ArrayShopingCard).setVisible(true);
        }

        if (e.getSource().equals(Cart)) {
            this.setVisible(false);
            new ShoppingCart(ArrayShopingCard).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new LogoFrame();
    }

}
