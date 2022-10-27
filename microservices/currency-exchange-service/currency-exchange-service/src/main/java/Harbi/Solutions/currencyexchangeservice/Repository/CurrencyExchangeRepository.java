package Harbi.Solutions.currencyexchangeservice.Repository;

import Harbi.Solutions.currencyexchangeservice.Model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
