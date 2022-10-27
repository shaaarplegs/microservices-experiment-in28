package Harbi.Solutions.Limitservice.configuration;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.*;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Configuration {
    private int minimum;
    private int maximum;

}
