
/**
 * ProdutoDAO.java
 * 
 * @date 7 de fev de 2017
 * @author <a href="mailto:norivan@gmail.com">Norivan Oliveira</a>
 *
 */

package org.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.casadocodigo.loja.models.Produto;
import org.springframework.stereotype.Repository;

/**
 * @author noriv
 *
 */
@Repository
@Transactional
public class ProdutoDAO {

	@PersistenceContext
    private EntityManager manager;

    public void gravar(Produto produto){
        manager.persist(produto);
    }
 }