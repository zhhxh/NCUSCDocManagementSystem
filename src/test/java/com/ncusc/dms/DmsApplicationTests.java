package com.ncusc.dms;

import java.util.List;

import com.ncusc.dms.mapper.AdminMapper;
import com.ncusc.dms.pojo.Admin;
import com.ncusc.dms.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author WANGHAO
 * @version 1.0.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableCaching
public class DmsApplicationTests {

	@Autowired
	RedisTemplate redisTemplate;
	@Test
	public void contextLoads() {
		Assert.assertNotNull(redisTemplate);

		redisTemplate.opsForValue().set("hello", "world");
		String value = redisTemplate.opsForValue().get("hello").toString();
		log.info("value = " + value);

		//redisTemplate.delete("hello");
	}
	@Autowired
	AdminMapper adminMapper;
	@Test
	public void testAdminMapper(){
		List<Admin> list = adminMapper.list();
		for (int i = 0;i<list.size();i++){
			Admin admin = list.get(i);
			System.out.println("ID:"+admin.getId());
			System.out.println("Password:"+admin.getPassword());
			System.out.println("Name:"+admin.getName());
			System.out.println("Sex:"+admin.getSex());
			System.out.println("PhoNum:"+admin.getPhoNum());
			System.out.println("Email:"+admin.getEmail());
			System.out.println("Addr:"+admin.getAddr());
			System.out.println("Limit:"+admin.getLevel());
			System.out.println("Date:"+admin.getDate());
		}

	}
	@Autowired
	AdminService adminService;
	@Test
	public void testAdminService(){

		Admin admin = adminService.get("0");
		System.out.println("ID:"+admin.getId());
		System.out.println("Password:"+admin.getPassword());
		System.out.println("Name:"+admin.getName());
		System.out.println("Sex:"+admin.getSex());
		System.out.println("PhoNum:"+admin.getPhoNum());
		System.out.println("Email:"+admin.getEmail());
		System.out.println("Addr:"+admin.getAddr());
		System.out.println("Limit:"+admin.getLevel());
		System.out.println("Date:"+admin.getDate());

	}

}
