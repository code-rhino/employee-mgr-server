package com.wutang.employeemgrserver.domain.employee.service;

import com.wutang.employeemgrserver.domain.core.ResourceCreationException;
import com.wutang.employeemgrserver.domain.core.ResourceNotFoundException;
import com.wutang.employeemgrserver.domain.employee.models.Employee;
import com.wutang.employeemgrserver.domain.employee.repos.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee create(Employee employee) throws ResourceCreationException {
        Optional<Employee> optional = employeeRepository.findByEmail(employee.getEmail());
        if(optional.isPresent())
            throw new ResourceCreationException("Email already exist");
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getById(Long id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Employee getByEmail(String email) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee update(Long id, Employee employeeDetail) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public void delete(Long id) throws ResourceNotFoundException {

    }
}
