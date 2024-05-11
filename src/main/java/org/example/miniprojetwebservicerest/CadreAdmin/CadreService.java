package org.example.miniprojetwebservicerest.CadreAdmin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadreService {
    @Autowired
    private CadreRepository cadreRepository;

    public List<Cadre> getAllCadre() {
        return cadreRepository.findAll();
    }

    public Cadre getCadreById(long id) {
       return cadreRepository.findById(id).orElse(null);
    }

    public void addCadre(Cadre cadre) {
        cadreRepository.save(cadre);
    }

    public void deleteCadre(long id) {
        cadreRepository.deleteById(id);
    }

    public void updateCadre(Cadre cadre) {
        Cadre isExist = cadreRepository.findById(cadre.getId()).orElse(null);
        if(isExist != null) {
            isExist.setNom(cadre.getNom());
            isExist.setPrenom(cadre.getPrenom());
            isExist.setJobtitle(cadre.getJobtitle());
            cadreRepository.save(isExist);
        }
    }
}
