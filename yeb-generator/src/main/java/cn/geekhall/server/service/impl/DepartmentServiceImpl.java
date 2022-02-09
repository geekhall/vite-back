package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.Department;
import cn.geekhall.server.mapper.DepartmentMapper;
import cn.geekhall.server.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yiny
 * @since 2022-02-09
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
