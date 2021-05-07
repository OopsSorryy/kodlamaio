package com.company.Adapters;

import com.company.Abstract.CustomerCheckService;
import com.company.Entities.Customer;
import com.company.MerniseServiceReference.VRNKPSPublicSoap;


import java.util.Locale;

public class MerniseServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        VRNKPSPublicSoap client = new VRNKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),
                        customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
