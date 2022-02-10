package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.Oplog;
import cn.geekhall.server.mapper.OplogMapper;
import cn.geekhall.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
