package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.CustomerCheckService;
import com.company.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }
        else
            System.out.println("Not a valid Person");
    }
}
