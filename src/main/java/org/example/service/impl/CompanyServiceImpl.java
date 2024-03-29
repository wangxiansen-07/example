package org.example.service.impl;

import org.example.dao.CompanyDao;
import org.example.domain.Company;
import org.example.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: WangTao
 * @Date: 2023-02-03 13:55
 * @Version: 1.0
 * @Desc:
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    private static final Logger logger = LoggerFactory.getLogger(CompanyService.class);
    @Autowired
    private CompanyDao companyDao;

    @Override
    public void save(Company company) {
        companyDao.save(company);
    }

    @Override
    public void update(Company company) {
        companyDao.update(company);
    }

    @Override
    public void delete(String id) {
        companyDao.delete(id);
    }

    @Override
    public Company findById(String id) {
        return companyDao.findById(id);
    }

    @Override
    public List<Company> findAll() {
        return companyDao.findAll();
    }
}
