package nLayerDemo;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.business.concrete.ProductManager;
import nLayerDemo.core.jLoggerManagerAdapter;
import nLayerDemo.dataAccess.concretes.HibernateProductDao;
import nLayerDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//TO DO : Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new HibernateProductDao(),new jLoggerManagerAdapter());
		Product product = new Product(2,2,"elma",12,50);
		
		productService.add(product);
	
		
	
	}

}
