package com.depoproject.Service;

import com.depoproject.Dao.DepoDao;
import com.depoproject.Entity.Depo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepoService {
    @Autowired
    private DepoDao depoDao;

    public Depo saveDepo(Depo depo){
        return depoDao.save(depo);
    }
}
