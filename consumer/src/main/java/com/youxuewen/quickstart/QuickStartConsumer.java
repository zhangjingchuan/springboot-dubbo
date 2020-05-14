package com.youxuewen.quickstart;


import com.alibaba.dubbo.config.annotation.Reference;
import com.youxuewen.ServiceApi;
import org.springframework.stereotype.Component;

/**
 * created by zhangjingchuan on 2020/5/14
 */
@Component
public class QuickStartConsumer {

    @Reference
    ServiceApi serviceApi;

    public void sendMessage(String message){
        String s = this.serviceApi.sendMessage(message);
        System.out.println(s);
    }
}
