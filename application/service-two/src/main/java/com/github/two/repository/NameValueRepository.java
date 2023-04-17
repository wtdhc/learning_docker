package com.github.two.repository;

import com.github.two.domain.NameValue;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NameValueRepository extends JpaRepository<NameValue, String> {

    @Query(value = "SELECT nv FROM NameValue nv WHERE name = :name")
    Optional<NameValue> findByName(String name);

}
