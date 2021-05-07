package com.company.Abstract;

import com.company.Entities.Customer;

public interface CustomerCheckService {

    boolean checkIfRealPerson(Customer customer);
}
