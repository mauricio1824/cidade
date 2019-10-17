/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Cidade {
    private Integer codigo;
    private String nome;
    private String sigla_estado;
    private Integer nr_habitantes;
    private LocalDate data_emancipacao;
    private Double area_total;
    private Integer distancia_capital;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla_estado() {
        return sigla_estado;
    }

    public void setSigla_estado(String sigla_estado) {
        this.sigla_estado = sigla_estado;
    }

    public Integer getNr_habitantes() {
        return nr_habitantes;
    }

    public void setNr_habitantes(Integer nr_habitantes) {
        this.nr_habitantes = nr_habitantes;
    }

    public LocalDate getData_emancipacao() {
        return data_emancipacao;
    }

    public void setData_emancipacao(LocalDate data_emancipacao) {
        this.data_emancipacao = data_emancipacao;
    }

    public Double getArea_total() {
        return area_total;
    }

    public void setArea_total(Double area_total) {
        this.area_total = area_total;
    }

    public Integer getDistancia_capital() {
        return distancia_capital;
    }

    public void setDistancia_capital(Integer distancia_capital) {
        this.distancia_capital = distancia_capital;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + '}';
    }
}
