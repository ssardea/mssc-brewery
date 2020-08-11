package sam.springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sam.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerID) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .firstName("Shepo")
                .lastName("Lastname")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateById(UUID customerId, CustomerDto customerDto) {
        log.info("Update Customer Here");
    }

    @Override
    public void removeById(UUID customerId) {
        log.info("Remove Customer Here");
    }
}
