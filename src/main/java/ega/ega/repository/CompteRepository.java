package ega.ega.repository;

import ega.ega.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {
    List<Compte> findByClientId(Integer client_id);
}
