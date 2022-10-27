package HarbiSolutions.currencyconversionservice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversationMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private String environment;
}
