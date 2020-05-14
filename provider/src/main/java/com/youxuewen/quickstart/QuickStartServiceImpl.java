package com.youxuewen.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.youxuewen.ServiceApi;
import org.springframework.stereotype.Component;

/**
 * created by zhangjingchuan on 2020/5/14
 */
@Component
@Service(interfaceClass = ServiceApi.class)
public class QuickStartServiceImpl implements ServiceApi {

    @Override
    public String sendMessage(String message) {
        return "I am provider ".concat(message);
    }
}
