package com.gizmodk.gizmopedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import com.gizmodk.gizmopedia.repository.BookRepository;

public class StartupRunner implements CommandLineRunner {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private DataSource ds;
	
	//this will create a datasource and wrap it with jdbc template 
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BookRepository repository;
	
	@Override
	public void run(String... arg0) throws Exception {
		logger.info("Hello");
		logger.info("Autowired In-memory H2 datasource ::: \n"+ds.toString());
	}
	
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void run() {
		logger.info("Number of Books : "+repository.count());
	}

}
