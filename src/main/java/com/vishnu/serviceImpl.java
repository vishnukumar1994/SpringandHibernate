package com.vishnu;

import java.util.ArrayList;
import java.util.List;

public class serviceImpl implements Service {
    public serviceImpl() {
    }

    Repository repository;

    public serviceImpl(Repository repository) {
        this.repository = repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }


    @Override
    public List<Employee> findCustomerAll() {
        //List<Customer> customers = new ArrayList<>();
        return repository.findCustomerAll();

    }

}

