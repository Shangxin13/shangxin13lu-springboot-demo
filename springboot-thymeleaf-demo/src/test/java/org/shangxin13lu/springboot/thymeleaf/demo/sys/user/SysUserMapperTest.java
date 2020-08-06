package org.shangxin13lu.springboot.thymeleaf.demo.sys.user;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.shangxin13lu.springboot.thymeleaf.demo.sys.user.mapper.SysUserMapper;
import org.shangxin13lu.springboot.thymeleaf.demo.sys.user.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SysUserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void testSave() {
        SysUser sysUser = new SysUser();
        sysUser.setUserID("1003");
        sysUser.setUserName("A1003");
        sysUser.setPassword("123456");
        sysUser.setAge(20);
        sysUser.setBirthday(new Date());
        Integer id = sysUserMapper.save(sysUser);
        log.info("save sys user: {}", sysUser);
    }

    @Test
    public void testDeleteSysUser() {
        SysUser sysUser = new SysUser();
        sysUser.setId(3l);
        Integer id = sysUserMapper.delete(sysUser);
        log.info("delete sys user: {}", id);
    }

    @Test
    public void testUpdateSysUser() {
        SysUser sysUser = new SysUser();
        sysUser.setId(3l);
        sysUser.setAge(100);
        sysUser.setUpdateTime(new Date());
        Integer id = sysUserMapper.update(sysUser);
        log.info("find sys user: {}", id);
    }

    @Test
    public void testFindSysUser() {
        SysUser sysUser = new SysUser();
        sysUser.setId(1l);
        SysUser s = sysUserMapper.findSysUser(sysUser);
        log.info("find sys user: {}", s);
    }

    @Test
    public void testFindSysUsers() {
        SysUser sysUser = new SysUser();
        List<SysUser> sysUsers = sysUserMapper.findSysUsers(sysUser);
        log.info("find sys users: {}", sysUsers);
    }
}
