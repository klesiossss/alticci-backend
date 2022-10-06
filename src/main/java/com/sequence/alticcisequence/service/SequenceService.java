package com.sequence.alticcisequence.service;

import com.sequence.alticcisequence.model.Sequence;
import com.sequence.alticcisequence.repository.RepositorySequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SequenceService {

    @Autowired
    RepositorySequence repositorySequence;

    public Integer resolveSequence(Integer n){
        if(n==0) return 0;
        if (n == 1 || n==2) return 1;

              var sequence = repositorySequence.findBySequence(n);
              if (sequence != null) {
                  return sequence.getResult();
              }
              Integer result = (n-3) + (n-2);
              repositorySequence.save(Sequence.builder()
                      .sequence(n)
                      .result(result)
                      .build());
              return result;
    }

}
