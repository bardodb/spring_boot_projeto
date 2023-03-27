package br.com.portfolio.mvc.mudi;

import br.com.portfolio.mvc.mudi.interceptor.InterceptadorDeAcessos;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class WebConfig extends WebMvcConfigurationSupport {

  @Override
  protected void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new InterceptadorDeAcessos()).addPathPatterns("/**");
  }
}
