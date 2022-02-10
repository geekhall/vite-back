package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.Nation;
import cn.geekhall.server.mapper.NationMapper;
import cn.geekhall.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
