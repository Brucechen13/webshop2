package com.cc.webstore.dao.impl;

import com.cc.webstore.beans.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by chenc on 2017/5/10.
 */
@Repository("productDao")
public class ProductDaoImpl extends JdbcBaseDaoImpl<Product> {
}
