package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.CompanyDao;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> findEmployeeByNameFragment(String fragment) {
        return employeeDao.retrieveEmployeeByNameFragment(fragment);
    }

    public List<Company> findCompaniesByNameFragment(String fragment) {
        return companyDao.retrieveCompaniesByNameFragment(fragment);
    }
}
