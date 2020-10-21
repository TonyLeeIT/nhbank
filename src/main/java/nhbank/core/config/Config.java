package nhbank.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "sqlfiles")
public class Config {
    private final List<String> sql = new ArrayList<String>();

    public List<String> getSql() {
        return this.sql;
    }
}