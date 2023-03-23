package br.com.portfolio.mvc.mudi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import javax.persistence.*;


@Entity
public class  Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeProduto;
	private BigDecimal valorNegociado;
	private LocalDate dataDaEntrega;
	private String urlProduto;
	private String urlImagem;
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido", fetch = FetchType.LAZY)
  @JsonIgnore
  private List<Oferta> ofertas;


  public String getNomeProduto() {
    return nomeProduto;
  }
  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }
  public BigDecimal getValorNegociado() {
    return valorNegociado;
  }
  public void setValorNegociado(BigDecimal valorNegociado) {
    this.valorNegociado = valorNegociado;
  }

  public LocalDate getDataDaEntrega() {
    return dataDaEntrega;
  }
  public void setDataDaEntrega(LocalDate dataDaEntrega) {
    this.dataDaEntrega = dataDaEntrega;
  }
  public String getUrlProduto() {
    return urlProduto;
  }
  public void setUrlProduto(String urlProduto) {
    this.urlProduto = urlProduto;
  }
  public String getUrlImagem() {
    return urlImagem;
  }
  public void setUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public StatusPedido getStatus() {
    return status;
  }
  public void setStatus(StatusPedido status) {
    this.status = status;
  }
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  public List<Oferta> getOfertas() {
    return ofertas;
  }

  public void setOfertas(List<Oferta> ofertas) {
    this.ofertas = ofertas;
  }
}
