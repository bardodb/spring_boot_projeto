package br.com.portfolio.mvc.mudi.api;

import br.com.portfolio.mvc.mudi.interceptor.InterceptadorDeAcessos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import br.com.portfolio.mvc.mudi.interceptor.InterceptadorDeAcessos.Acesso;
@RequestMapping("acessos")
@RestController
public class AcessosRest {
  @GetMapping
  public List<Acesso> getAcessos(){
return InterceptadorDeAcessos.acessos;

  }
}
