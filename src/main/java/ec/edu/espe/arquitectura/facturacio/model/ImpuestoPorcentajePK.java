package ec.edu.espe.arquitectura.facturacio.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ImpuestoPorcentajePK implements Serializable {

    @Column(name = "COD_IMPUESTO", length = 3, nullable = false)
    private String codigoImpuesto;
    @Column(name = "PORCENTAJE", precision = 4, scale = 1, nullable = false)
    private BigDecimal procentaje;

    public ImpuestoPorcentajePK() {
    }

    public ImpuestoPorcentajePK(String codigoImpuesto, BigDecimal procentaje) {
        this.codigoImpuesto = codigoImpuesto;
        this.procentaje = procentaje;
    }

    public String getCodigoImpuesto() {
        return codigoImpuesto;
    }

    public void setCodigoImpuesto(String codigoImpuesto) {
        this.codigoImpuesto = codigoImpuesto;
    }

    public BigDecimal getProcentaje() {
        return procentaje;
    }

    public void setProcentaje(BigDecimal procentaje) {
        this.procentaje = procentaje;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoImpuesto == null) ? 0 : codigoImpuesto.hashCode());
        result = prime * result + ((procentaje == null) ? 0 : procentaje.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ImpuestoPorcentajePK other = (ImpuestoPorcentajePK) obj;
        if (codigoImpuesto == null) {
            if (other.codigoImpuesto != null)
                return false;
        } else if (!codigoImpuesto.equals(other.codigoImpuesto))
            return false;
        if (procentaje == null) {
            if (other.procentaje != null)
                return false;
        } else if (!procentaje.equals(other.procentaje))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ImpuestoPorcentajePK [codigoImpuesto=" + codigoImpuesto + ", procentaje=" + procentaje + "]";
    }

}
