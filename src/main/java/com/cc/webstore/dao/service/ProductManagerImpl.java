package com.cc.webstore.dao.service;

import com.cc.webstore.beans.Product;
import com.cc.webstore.dao.impl.ProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenc on 2017/5/12.
 */
@Service
public class ProductManagerImpl implements ProductMananger{
    @Autowired
    private ProductDaoImpl productDao;

    @Override
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }
}
