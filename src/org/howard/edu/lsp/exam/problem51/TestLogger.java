package org.howard.edu.lsp.exam.problem51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLogger {
	private Logger logger;
	private Logger logger1;
	private Logger logger2;
	
	@BeforeEach
	void setUp() {
		logger = Logger.getInstance(); 
		logger1 = Logger.getInstance();
		logger2 = Logger.getInstance();
;	}
	
	@Test
	@DisplayName("test displaylog")
	public void test_displayLog() {
		logger.logMessage("Hello, this is a test");
		assertEquals("Log:\nHello, this is a test\n", logger.displayLog());
		
		logger.logMessage("It's a Beautiful Day");
		assertEquals("Log:\nHello, this is a test\nIt's a Beautiful Day\n", logger.displayLog());
	}
	
	@Test
	@DisplayName("test log instances")
	public void test_logger_instances() {
		assertSame(logger, logger1);
		assertSame(logger1, logger2);
	}

}
