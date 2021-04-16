package sam;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        List<Product> productsList2 = new ArrayList<>();

        productsList.add(new Product("Sirup",100000d));
        productsList.add(new Product("kurma",50000d));
        productsList.add(new Product("Ayam Goreng Mail",2000000d));

        Penjual penjual1 = new Penjual();
        penjual1.username = "sammi";
        penjual1.password = "sammi";
        penjual1.productList = productsList;
        penjual1.showProducts();


        productsList2.add(productsList.get(1));
        productsList2.add(productsList.get(2));

        Penjual penjual2 = new Penjual();
        penjual2.username = "adid";
        penjual2.password = "adid";
        penjual2.productList = productsList2;
        penjual2.showProducts();

        Pembeli pembeli = new Pembeli();
        pembeli.username = "saasasasa";
        pembeli.password = "asdasdasa";
        pembeli.setSaldo(1000000d);
        pembeli.showDetails();

        pembeli.buy(productsList.get(0));
        pembeli.showDetails();

        pembeli.buy(productsList.get(2));
        pembeli.showDetails();
    }
}

class Pengguna {
    protected String username;
    protected String password;
}

class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

class Penjual extends Pengguna{
    public List<Product> productList;

    public void showProducts() {
        System.out.println("-------------------PENJUAL---------------------");
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        productList.forEach(temp -> {
            System.out.print("\t"+temp.getName() + " -> ");
            System.out.println(temp.getPrice());
        });
        System.out.println("-----------------------------------------------");
    }
}

class Pembeli extends Pengguna{
    private Double saldo = 0.0;
    private List<Product> shoppingList = new ArrayList<>();

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void buy(Product product) {
        System.out.println("-------------------PURCHASE---------------------");
        if (this.saldo > product.getPrice()) {
            this.saldo  -= product.getPrice();
            this.shoppingList.add(product);
            System.out.println("PEMBELIAN SUKSES");
        }else {
            System.out.println("PEMBELIAN GAGAL : SALDO ANDA TIDAK CUKUP");
        }
        System.out.println("------------------------------------------------");
    }

    public void showDetails() {
        System.out.println("-------------------PEMBELI---------------------");
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        System.out.println("Saldo : " + saldo);
        if (shoppingList.size() == 0) {
            System.out.println("Shopping list : tidak ada");
            return;
        }
        System.out.println("Shopping list : ");
        shoppingList.forEach(value -> System.out.println("\t"+value.getName() + " -> " + value.getPrice()));
        System.out.println("------------------------------------------------");
    }
}

class Grosir extends Penjual {}
class Ritel extends Penjual{}