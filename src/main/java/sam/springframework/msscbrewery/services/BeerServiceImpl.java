package sam.springframework.msscbrewery.services;

import org.springframework.stereotype.Service;
import sam.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Corona Beer")
                .beerStyle("Brewed")
                .build();
    }
}
