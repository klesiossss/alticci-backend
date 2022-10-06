package com.sequence.alticcisequence.repository;

import com.sequence.alticcisequence.model.Sequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RepositorySequence extends JpaRepository<Sequence, Long> {
    Sequence findBySequence(Integer n);
}
