package com.dqgjk.serviceImpl;

import com.dqgjk.dao.AreaDao;
import com.dqgjk.domain.Area;
import com.dqgjk.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("areaService")
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> findAll() {
        return areaDao.findAll();
    }
}
