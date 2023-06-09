package ega.ega.repository;

import ega.ega.entity.Operation;
import ega.ega.entity.OperationType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationRepository extends JpaRepository<Operation, Integer> {
    List<Operation> findByCompteIdAndType(Integer compte_id, OperationType type);
}
