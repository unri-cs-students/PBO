 package com.sammidev.tugas4;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Product a = new Product(UUID.randomUUID().toString());
        Product b = new Product(UUID.randomUUID().toString());
        Product c = new Product(UUID.randomUUID().toString());

        System.out.println(a.show());
        System.out.println(b.show());
        System.out.println(c.show());

    }

    public static BigDecimal generateRandomBigDecimalFromRange(BigDecimal min, BigDecimal max) {
        BigDecimal randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max.subtract(min)));
        return randomBigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}


class Product {
    private String id;
    private String name;
    private BigDecimal price;
    private LocalDateTime expired;
    private Category category;

    private final String[] items = {"Panci","Baju","Celana","Iphone XS"};
    Random random = new Random();
    int rand = random.nextInt(items.length);


    // 1 args constrcutor
    public Product(String id) {
        this(id, null);
    }

    // 2 args constrcutor
    public Product(String id, String barang) {
        this(id, barang, App.generateRandomBigDecimalFromRange(
                new BigDecimal(100000).setScale(2, BigDecimal.ROUND_HALF_UP),
                new BigDecimal(10000000).setScale(2, BigDecimal.ROUND_HALF_UP)
        ));
    }

    // 3 args constrcutor
    public Product(String id, String name, BigDecimal price) {
        this(id, name, price, LocalDateTime.now().plus(3, ChronoUnit.WEEKS));
    }

    // 4 args constrcutor
    public Product(String id, String name, BigDecimal price, LocalDateTime expired) {
        this(id,name, price,expired, Category.DAPUR);
    }

    // all args constrcutor
    public Product(String id, String name, BigDecimal price, LocalDateTime expired, Category category) {
        this.id        = id;
        this.name      = items[rand];
        this.price     = price;
        this.expired   = expired;
        this.category  = category;
    }

    // show data
    public String show() {
        return  "\n\n  id       = " + this.id   + "\n" +
                "  name     = " + this.name     + "\n" +
                "  price    = " + this.price    + "\n" +
                "  expired  = " + this.expired  + "\n" +
                "  cateogry = " + this.category + "\n";
    }
}

enum Category {
    DAPUR,ELEKTRONIK,FASHION,KESEHATAN,KECANTIKAN,OTOMOTIF
}