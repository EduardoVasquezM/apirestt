package org.una.inventario.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.inventario.entities.Departamento;
import java.util.List;

@Repository

public interface IDepartamentoRepository  extends JpaRepository<Departamento, Long> {

    public default List<Departamento> findByEstado(boolean estado) {
        return null;
    }

}
