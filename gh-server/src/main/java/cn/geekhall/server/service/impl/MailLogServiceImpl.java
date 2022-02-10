package cn.geekhall.server.service.impl;

import cn.geekhall.server.entity.MailLog;
import cn.geekhall.server.mapper.MailLogMapper;
import cn.geekhall.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
