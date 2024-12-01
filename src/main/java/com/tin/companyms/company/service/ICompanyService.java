package com.tin.companyms.company.service;

import com.tin.companyms.company.model.Company;

import java.util.List;

public interface ICompanyService {
    List<Company> findAllCompanies();
    Company createCompany(Company company);
    Company updateCompany(Long id, Company company);

    Boolean deleteCompanyById(Long id);
    Company findCompanyById(Long id);
}
