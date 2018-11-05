package com.ncusc.dms.service;

import java.util.List;

import com.ncusc.dms.mapper.AdminMapper;
import com.ncusc.dms.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * Admin 的service类
 * @author WANGHAO
 * @version 1.0.0
 */
//TODO 一个已知bug:cacheName后会接上两个：，导致Redis出现一级空目录，地点：org.springframework.data.redis.cache.DefaultRedisCachePrefix，该bug未解决
@Service
public class AdminService {
    @Autowired
    AdminMapper adminmapper;

    @Autowired
    RedisTemplate redisTemplate;

    @CachePut(cacheNames = "admin_cache",key = "'id_'+id")//直接更新
    public Admin add(Admin admin) {
        adminmapper.add(admin);
        return adminmapper.get(admin.getId());
    }
    @CacheEvict(cacheNames = "admin_cache", key = "'id_'+#id")//删除
    public void delete(String id) {
        adminmapper.delete(id);
    }
    @CachePut(cacheNames = "admin_cache",key = "'id_'+id")
    public Admin update(Admin admin) {
        adminmapper.update(admin);
        return  adminmapper.get(admin.getId());
    }
    @Cacheable(cacheNames = "admin_cache", key = "'id_'+#id")//检查后更新
    public Admin get(String id) {
        return adminmapper.get(id);
    }
    public List<Admin> list() {
        return adminmapper.list();
    }
}
