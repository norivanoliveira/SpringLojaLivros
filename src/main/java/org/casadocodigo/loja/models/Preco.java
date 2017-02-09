
/**
 * Preco.java
 * 
 * @date 8 de fev de 2017
 * @author <a href="mailto:norivan@gmail.com">Norivan Oliveira</a>
 *
 */

package org.casadocodigo.loja.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

/**
 * @author noriv
 *
 */
@Embeddable
public class Preco {
    private BigDecimal valor;
    private TipoPreco tipo;
   
}
