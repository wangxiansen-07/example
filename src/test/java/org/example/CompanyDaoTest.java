package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.CompanyDao;
import org.example.domain.Company;
import org.junit.Before;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.util.List;

/**
 * @Author: WangTao
 * @Date: 2023-02-03 10:54
 * @Version: 1.0
 * @Desc: 测试Dao层
 */
public class CompanyDaoTest {
    private static final Logger logger = LoggerFactory.getLogger(CompanyDaoTest.class);
    private static SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis\\sqlMapConfig.xml.bak");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAllTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
        try {
            List<Company> companies = companyDao.findAll();
            logger.info("findAll result = {}", companies);
        } finally {
            sqlSession.close();
        }
    }
}
