package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.Admin;
import cn.geekhall.server.mapper.AdminMapper;
import cn.geekhall.server.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
