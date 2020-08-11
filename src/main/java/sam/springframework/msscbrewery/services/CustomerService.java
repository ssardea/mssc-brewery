package sam.springframework.msscbrewery.services;

import org.springframework.stereotype.Service;
import sam.springframework.msscbrewery.web.model.CustomerDto;


import java.util.UUID;


public interface CustomerService {
    CustomerDto getCustomerById(UUID customerID);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateById(UUID customerId, CustomerDto customerDto);

    void removeById(UUID customerId);
}
