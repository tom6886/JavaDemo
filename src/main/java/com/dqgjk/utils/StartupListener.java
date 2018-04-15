package com.dqgjk.utils;

import com.dqgjk.domain.Area;
import com.dqgjk.service.AreaService;
import com.dqgjk.service.JedisService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StartupListener implements ApplicationContextAware {

    private static ApplicationContext _applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        _applicationContext = applicationContext;
        saveAreaCache();
    }

    private void saveAreaCache() {
        AreaService areaService = _applicationContext.getBean(AreaService.class);
        List<Area> list = areaService.findAll();
        List<Area> provinces = list.stream().filter(q -> q.getLeveltype() == 1).collect(Collectors.toList());

        JedisService jedisService = _applicationContext.getBean(JedisService.class);
        jedisService.put("Province", provinces);
    }
}
