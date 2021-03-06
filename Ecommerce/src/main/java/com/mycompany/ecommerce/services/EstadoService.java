package com.mycompany.ecommerce.services;

import com.mycompany.ecommerce.domains.Estado;
import com.mycompany.ecommerce.domains.Pais;
import com.mycompany.ecommerce.utils.FiltrosPesquisa;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Named;
import javax.persistence.Query;

/**
 *
 * @author Piaia
 */
@Stateless
@Named
public class EstadoService extends BaseService<Estado> {

    @Override
    protected List<FiltrosPesquisa> getFiltros(Map<String, Object> filtros) {
        List<FiltrosPesquisa> fp = new ArrayList<>();
        add(fp, "e.estCod = ?estCod", "estCod", filtros.get("estCod"));
        add(fp, "UPPER(e.estDesc) LIKE UPPER('%?estDesc%')", "estDesc", filtros.get("estDesc"));
        add(fp, "e.estPais = ?estPais", "estPais", filtros.get("estPais"));
        return fp;
    }

    public List<Estado> getEstados() {
        String query = "SELECT E.* FROM ESTADO E";
        return super.executeNativeQuery(Estado.class, query);
    }

    public List<Estado> filtrar(Map<String, Object> filtros) {
        String sql = "SELECT e FROM Estado e";
        sql = adicionarFiltros(sql, getFiltros(filtros));
        Query query = getEntityManager().createQuery(sql);
        return query.getResultList();
    }

    public Estado getEstadoPorCodigo(int codigo) {
        String sql = "SELECT E.* FROM ESTADO E WHERE E.EST_COD = " + codigo;
        List<Estado> estados = executeNativeQuery(Estado.class, sql);
        if (estados.isEmpty()) {
            return null;
        } else {
            return estados.get(0);
        }
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void delete(Estado estado) {
        String sql = "DELETE FROM Estado WHERE EST_COD = " + estado.getEstCod();
        super.executeNativeUpdate(sql);
    }

    public boolean isExisteEstadoDoPais(Pais pais) {
        String sql = "SELECT E.* FROM ESTADO E WHERE E.EST_PAIS = " + pais.getPaisCod();
        List<Estado> retorno = executeNativeQuery(Estado.class, sql);
        return retorno != null && !retorno.isEmpty();
    }

}
