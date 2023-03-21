package br.com.portfolio.mvc.mudi.dto;

import br.com.portfolio.mvc.mudi.model.Oferta;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RequisicaoNovaOferta {

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

  private Long pedidoId;

  private String valor;

  private String dataDaEntrega;

  private String comentario;

  public Long getPedidoId() {
    return pedidoId;
  }

  public void setPedidoId(Long pedidoId) {
    this.pedidoId = pedidoId;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public String getDataDaEntrega() {
    return dataDaEntrega;
  }

  public void setDataDaEntrega(String dataDaEntrega) {
    this.dataDaEntrega = dataDaEntrega;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public Oferta toOferta() {
    Oferta oferta = new Oferta();
    oferta.setComentario(this.comentario);
    oferta.setDataDaEntrega(LocalDate.parse(this.dataDaEntrega, formatter));

    oferta.setValor(new BigDecimal(this.valor));

    return oferta;
  }

}
