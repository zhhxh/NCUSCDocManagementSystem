package com.ncusc.dms.service;

import java.util.List;

import com.ncusc.dms.Mapper.AdminMapper;
import com.ncusc.dms.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminService {
    @Autowired
    AdminMapper adminmapper;
    public void add(Admin admin) {
        adminmapper.add(admin);
    }
    public void delete(int aId) {
        adminmapper.delete(aId);
    }
    public void update(Admin admin) {
        adminmapper.update(admin);
    }
    public Admin get(int aId) {
        return adminmapper.get(aId);
    }
    public List<Admin> list() {
        return adminmapper.list();
    }
}
