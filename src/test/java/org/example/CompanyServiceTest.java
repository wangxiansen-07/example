package org.example;

import org.example.domain.Company;
import org.example.service.CompanyService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: WangTao
 * @Date: 2023-02-03 14:14
 * @Version: 1.0
 * @Desc:
 */
public class CompanyServiceTest {
    private static final Logger logger = LoggerFactory.getLogger(CompanyServiceTest.class);
    private static ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void findAllTest() {
        CompanyService companyService = applicationContext.getBean("companyServiceImpl", CompanyService.class);
        List<Company> companies = companyService.findAll();
        logger.info("findAll result {}", companies);
    }
}
