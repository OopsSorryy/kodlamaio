package com.company;


import com.company.Abstract.BaseCustomerManager;
import com.company.Adapters.MerniseServiceAdapter;
import com.company.Concrete.NeroCustomerManager;
import com.company.Concrete.StarbucksCustomerManager;
import com.company.Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniseServiceAdapter());

        customerManager.save(new Customer(1,"Yunus Emre","ÖZCAN",
                LocalDate.of(1999,1,1),"10271273980"));



    }

}

