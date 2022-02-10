package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.Role;
import cn.geekhall.server.mapper.RoleMapper;
import cn.geekhall.server.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yiny
 * @since 2022-02-10
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
