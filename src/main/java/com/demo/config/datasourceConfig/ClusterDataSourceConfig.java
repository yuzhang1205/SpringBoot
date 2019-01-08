package com.demo.config.datasourceConfig;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan(basePackages=ClusterDataSourceConfig.PACKAGE,sqlSessionFactoryRef="clusterSqlSessionFactory")
public class ClusterDataSourceConfig {
	
	static final String PACKAGE="com.demo.dao.cluster";
	static final String MAPPER_LOCATION="classpath:mybatis/mapper/cluster/*.xml";
	
	@Value("${cluster.datasource.url}")
	private String url;
	
	@Value("${cluster.datasorce.uasername}")
	private String user;
	
	@Value("${cluster.datasource.password}")
	private String password;
	
	@Value("${cluster.datasource.driverClassName}")
	private String driverClass;
	
	@Bean(name="clusterDataSource")
	public DataSource clusterDataSource() {
		DruidDataSource dataSource=new DruidDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	@Bean(name="clusterTransactionManager")
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(clusterDataSource());
	}
	
	@Bean(name="clusterSqlSessionFactory")
	public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("clusterDataSource") DataSource clusterDataSource) throws Exception{
		final SqlSessionFactoryBean sessionFactory=new SqlSessionFactoryBean();
		sessionFactory.setDataSource(clusterDataSource);
		sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(ClusterDataSourceConfig.MAPPER_LOCATION));
		return sessionFactory.getObject();
	}
}
