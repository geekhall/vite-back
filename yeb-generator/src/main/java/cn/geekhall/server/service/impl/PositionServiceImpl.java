package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.Position;
import cn.geekhall.server.mapper.PositionMapper;
import cn.geekhall.server.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
