package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.CompanyFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    CompanyFacade companyFacade;

    @Test
    public void ShouldFetchEmployeesByNameFragment() {
        //Given
        //When
        List<Employee> foundEmployeesList = companyFacade.findEmployeeByNameFragment("arc");

        //Then
        Assert.assertTrue(foundEmployeesList.size() != 0);
    }

    @Test
    public void ShouldFetchCompaniesByNameFragment() {
        //Given
        //When
        List<Company> foundCompaniesList = companyFacade.findCompaniesByNameFragment("ach");

        //Then
        Assert.assertTrue(foundCompaniesList.size() != 0);
    }
}
