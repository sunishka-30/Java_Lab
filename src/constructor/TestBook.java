package constructor;

import java.util.Scanner;

class Book{
    public String getName() {
        return name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty_in_stock() {
        return qty_in_stock;
    }

    String name;
    String author_name;
    double price;
    int qty_in_stock;

    Book(String name, String author_name, double price,int qty_in_stock)
    {
        this.name = name;
        this.author_name = author_name;
        this.price = price;
        this.qty_in_stock = qty_in_stock;
    }

}

public class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book obj = new Book(sc.nextLine(),sc.nextLine(), sc.nextDouble(), sc.nextInt());
        System.out.println(obj.getName()+"\n"+obj.getAuthor_name()+"\n"+obj.getPrice()+"\n"+obj.getQty_in_stock());

    }


}
