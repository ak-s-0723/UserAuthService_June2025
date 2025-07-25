package org.example.userauthservice_june2025.repos;

import org.example.userauthservice_june2025.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepo extends JpaRepository<Session,Long> {
}
