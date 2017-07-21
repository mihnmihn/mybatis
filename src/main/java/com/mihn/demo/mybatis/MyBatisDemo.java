package com.mihn.demo.mybatis;

import java.io.IOException;
import java.io.InputStream;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class MyBatisDemo {

	public static void main(String[] args) throws IOException {
		/*从 XML 中构建 SqlSessionFactory*/
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		/*不使用 XML 构建 SqlSessionFactory*/
		DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);
		configuration.addMapper(BlogMapper.class);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			//方式一（不推荐）
			//Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
		  
			//方式二
			BlogMapper mapper = session.getMapper(BlogMapper.class);
			Blog blog = mapper.selectBlog(101);
		} finally {
		  session.close();
		}
	}
}
