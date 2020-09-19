package cn.incast.demo.controller;

import cn.incast.demo.entity.PaymentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bank")

public class Democontroller {

    @Autowired
    private PaymentProperties prop;

    // hellos
    @GetMapping("hello")
    public String hello() {
        return "风里雨里，我在传智播客等你！";
    }

    // 读取配置文件里的数据
    @GetMapping("readData")
    public String readData() {
         return String.format("单笔支付限额：%d，每日支付限额：%d",
                 prop.getMaxAmountPerDeal(), prop.getMaxAmountTotal());
    }

// fffffffffffffffffffffffffff

}
