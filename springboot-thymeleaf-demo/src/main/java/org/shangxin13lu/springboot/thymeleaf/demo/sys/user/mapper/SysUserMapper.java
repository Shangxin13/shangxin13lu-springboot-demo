package org.shangxin13lu.springboot.thymeleaf.demo.sys.user.mapper;

import org.shangxin13lu.springboot.thymeleaf.demo.sys.user.model.SysUser;

import java.util.List;

public interface SysUserMapper {

    public Integer save(SysUser sysUser);

    public Integer update(SysUser sysUser);

    public Integer delete(SysUser sysUser);

    public SysUser findSysUser(SysUser sysUser);

    public List<SysUser> findSysUsers(SysUser sysUser);
}
