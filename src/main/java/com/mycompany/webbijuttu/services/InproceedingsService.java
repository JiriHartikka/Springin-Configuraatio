/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webbijuttu.services;

import com.mycompany.webbijuttu.domain.Inproceedings;
import java.util.List;

/**
 *
 * @author jirihamb
 */
public interface InproceedingsService {
    Inproceedings create(Inproceedings i);
    Inproceedings read(Long id);
    Inproceedings update(Inproceedings i);
    void delete(Long id);
    List<Inproceedings> list();
}
