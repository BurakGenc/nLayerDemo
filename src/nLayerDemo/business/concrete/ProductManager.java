package nLayerDemo.business.concrete;

import java.util.List;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.core.LoggerService;
import nLayerDemo.dataAccess.abstracts.ProductDao;

import nLayerDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	private LoggerService loggerService;
	

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService= loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu Kategoride Ürün Kabul Edilmiyor");
			return;
		}
		
		productDao.add(product);
		loggerService.logToSystem("ürün eklendi"+product.getName());
	
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
