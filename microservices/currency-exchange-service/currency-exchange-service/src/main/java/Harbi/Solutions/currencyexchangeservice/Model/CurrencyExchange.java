package Harbi.Solutions.currencyexchangeservice.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class CurrencyExchange {
    @Id
    private Long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    @Column(name="conversion_multiple")
    private BigDecimal conversationMultiple;
    private String environment;

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversationMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversationMultiple = conversationMultiple;
    }


}
