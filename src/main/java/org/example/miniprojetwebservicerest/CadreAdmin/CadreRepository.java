package org.example.miniprojetwebservicerest.CadreAdmin;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadreRepository extends JpaRepository<Cadre, Long> {
}
