package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean addProduct(Product prod) {
		String SQL = "insert into Product value(?,?,?)";
		int n = jdbcTemplate.update(SQL, new Object[] { prod.getPid(), prod.getPname(), prod.getPrice() });
		return n == 1;
	}
}
