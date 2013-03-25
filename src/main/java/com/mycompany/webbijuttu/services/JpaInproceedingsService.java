/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webbijuttu.services;

import com.mycompany.webbijuttu.domain.Inproceedings;
import com.mycompany.webbijuttu.repositories.JpaInproceedingsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jirihamb
 */
@Service
public class JpaInproceedingsService implements InproceedingsService {
    
    @Autowired
    private JpaInproceedingsRepository repo;
    @Override
    public Inproceedings create(Inproceedings i) {
        return repo.save(i);
    }

    @Override
    public Inproceedings read(Long id) {
        return repo.findOne(id);
    }

    @Override
    public Inproceedings update(Inproceedings i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Long id) {
        repo.delete(id);
    }

    @Override
    public List<Inproceedings> list() {
        return repo.findAll();
    }
    
}
