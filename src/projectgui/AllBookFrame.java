package projectgui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class AllBookFrame extends JFrame {

    static Book[] books = new Book[6];
    Container cp;
    JLabel img, tex, ShoppingCartIcon;
    JTextArea ta;
    JPanel titlePanel, booksPanel, bookPanel;
    ArrayList<Book> ArrayShopingCard;

    public AllBookFrame(ArrayList<Book> ArrayShopingCard) {

        books[0] = new Book("Philosopher's Stone", "J. K. Rowling", "340", "kids", 55, 4.9, "1.jpg");
        books[1] = new Book("The Wimpy Kid", "‎Jeff Kinney", "256", "kids", 35, 4.5, "4.jpg");
        books[2] = new Book("Start With Why", "Simon Sinek", "256", "Business Management", 59, 5.0, "5.jpg");
        books[3] = new Book("Terrible Experiment", "Masashi Kishimoto", "568", "kids", 89, 5.0, "2.jpg");
        books[4] = new Book("‎The Big Questions in Science", "Mun Keat Looi", "176", "kids", 15, 4.6, "3.jpg");
        books[5] = new Book("The Secret", "‎Rhonda Byrne", "208", "Self development", 115, 4.0, "6.jpg");

        this.ArrayShopingCard = ArrayShopingCard;

        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        titlePanel = new JPanel(new BorderLayout(375, 0));
        tex = new JLabel("All Books");
        tex.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
        titlePanel.add(tex, "Center");
        booksPanel = new JPanel(new GridLayout(0, 3));
        ShoppingCartIcon = new JLabel(new ImageIcon(getClass().getResource("icons8-shopping-cart-64.png")));
        ShoppingCartIcon.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new ShoppingCart(ArrayShopingCard).setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        titlePanel.add(ShoppingCartIcon, "West");
        for (Book b : books) {
            bookPanel = new JPanel(new GridBagLayout());
            GridBagConstraints gcon = new GridBagConstraints();
            gcon.gridx = 0;
            gcon.gridy = 0;
            gcon.gridheight = 5;
            gcon.gridwidth = 2;
            gcon.fill = GridBagConstraints.HORIZONTAL;
            img = new JLabel(b.getCover());
            bookPanel.add(img, gcon);

            JLabel name = new JLabel(b.getName());
            gcon.gridx = 0;
            gcon.gridy = 6;
            gcon.gridheight = 1;
            gcon.gridwidth = 2;
            gcon.fill = GridBagConstraints.CENTER;
            bookPanel.add(name, gcon);

            JLabel price = new JLabel(b.getPrice() + " SAR");
            gcon.gridx = 0;
            gcon.gridy = 7;
            bookPanel.add(price, gcon);
            bookPanel.addMouseListener(new MouseInputListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setVisible(false);
                    new BookFrame(b, ArrayShopingCard).setVisible(true);

                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }

                @Override
                public void mouseDragged(MouseEvent e) {
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                }
            });
            booksPanel.add(bookPanel);
        }
        cp.add(titlePanel, "North");
        cp.add(booksPanel, "Center");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocation(160, 5);
        setTitle("Library Store");
        setVisible(true);
    }

}
