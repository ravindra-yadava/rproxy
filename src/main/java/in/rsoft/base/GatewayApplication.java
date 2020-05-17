package in.rsoft.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.rsoft.filters.MyFilter;

@Configuration
public class GatewayApplication {

  @Bean
  public MyFilter myFilter() {
    return new MyFilter();
  }
}
