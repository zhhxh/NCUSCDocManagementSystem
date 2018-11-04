package com.ncusc.dms;

import java.util.List;

import com.ncusc.dms.mapper.AdminMapper;
import com.ncusc.dms.pojo.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DmsApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	AdminMapper adminMapper;
	@Test
	public void testAdminMapper(){
		List<Admin> list = adminMapper.list();
		for (int i = 0;i<list.size();i++){
			Admin admin = list.get(i);
			System.out.println("ID:"+admin.getaId());
			System.out.println("Password:"+admin.getaPassword());
			System.out.println("Name:"+admin.getaName());
			System.out.println("Sex:"+admin.getaSex());
			System.out.println("PhoNum:"+admin.getaPhoNum());
			System.out.println("Addr:"+admin.getaAddr());
			System.out.println("Limit:"+admin.getaLimit());
			System.out.println("Date:"+admin.getaDate());
		}

	}

}
