
class Product {

    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}
class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {

        // First: price from highest to lowest
        if (p1.price != p2.price) {
            return p2.price - p1.price;
        }

        // If price is same: name alphabetically
        return p1.name.compareTo(p2.name);
    }
}

public class sorting2 {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        // Adding products
        products.add(new Product(101, "Laptop", 60000));
        products.add(new Product(102, "Mobile", 60000));
        products.add(new Product(103, "Tablet", 30000));
        products.add(new Product(104, "Mouse", 1000));

        // Sort using Comparator
        Collections.sort(products, new ProductComparator());

        // Display sorted products
        System.out.println("Sorted Products:");

        for (Product p : products) {
            System.out.println(p);
        }
    }
}