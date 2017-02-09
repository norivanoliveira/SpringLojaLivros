
/**
 * Produto.java
 * 
 * @date 7 de fev de 2017
 * @author <a href="mailto:norivan@gmail.com">Norivan Oliveira</a>
 *
 */

package org.casadocodigo.loja.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author noriv
 *
 */
@Entity
public class Produto {
	
	 @ElementCollection
	private List<Preco> precos;
    private String titulo;
    private String descricao;
    private int paginas;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    

    /**
	 * @return the precos
	 */
	public List<Preco> getPrecos() {
		return precos;
	}
	/**
	 * @param precos the precos to set
	 */
	public void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}
	@Override
    public String toString() {
        return "Produto [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
    }


}
