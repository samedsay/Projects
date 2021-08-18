package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		// ProductService productService = new ProductManager(new
		// HibernateProductDao());
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		// This is horrible solution we will change it later! with Hibernate..

		Product product = new Product(3, 1, "Tablet", 1200, 50);
		productService.add(product);

	}

}
