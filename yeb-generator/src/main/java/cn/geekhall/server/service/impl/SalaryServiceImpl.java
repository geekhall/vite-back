package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.Salary;
import cn.geekhall.server.mapper.SalaryMapper;
import cn.geekhall.server.service.ISalaryService;
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
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
