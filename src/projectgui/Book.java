package projectgui;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Book {

    private String name, author, pages, catagory;
    private int price, quantity=0;
    private double evolution;
    private ImageIcon cover;

    public Book(String name, String author, String pages, String catagory, int price, double evolution, String cover) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.catagory = catagory;
        this.price = price;
        this.evolution = evolution;
        this.cover = new ImageIcon(new ImageIcon(getClass().getResource(cover)).getImage().getScaledInstance(350, 250, Image.SCALE_DEFAULT));
    
    }

    public Book(Book book) {
        this.name = book.name;
        this.author = book.author;
        this.pages = book.pages;
        this.catagory = book.catagory;
        this.price = book.price;
        this.evolution = book.evolution;
        this.cover = book.cover;
        

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getEvolution() {
        return evolution;
    }

    public void setEvolution(double evolution) {
        this.evolution = evolution;
    }

    public ImageIcon getCover() {
        return cover;
    }

    public void setCover(ImageIcon cover) {
        this.cover = cover;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
