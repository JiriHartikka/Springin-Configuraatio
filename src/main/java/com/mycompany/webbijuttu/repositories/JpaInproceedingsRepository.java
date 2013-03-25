/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webbijuttu.repositories;

import com.mycompany.webbijuttu.domain.Inproceedings;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jirihamb
 */
public interface JpaInproceedingsRepository extends JpaRepository <Inproceedings, Long>{
    
}
