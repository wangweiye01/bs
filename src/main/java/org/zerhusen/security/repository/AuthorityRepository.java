package org.zerhusen.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.security.Authority;
import org.zerhusen.model.security.AuthorityName;
import org.zerhusen.model.security.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
