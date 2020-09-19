package cn.incast.demo.cinfig;

import cn.incast.demo.entity.PaymentProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类，代替xml配置
 * @author 传智-虎哥
 */
@Configuration
public class PaymentConfig {
    /**
     * 通过@Value注解读取配置文件中的属性
     */
    @Value("${pay.nopassword.maxAmountPerDeal}")
    private long maxAmount;

    @Value("${pay.nopassword.maxAmountTotal}")
    private long maxAmountTotal;

    /**
     * 通过{@link Bean @Bean}注解声明一个要注入到Spring中的对象。等同于{@code <bean></bean>}标签
     * @return
     */
    @Bean
    public PaymentProperties paymentProperties(){
        PaymentProperties properties = new PaymentProperties();
        properties.setMaxAmountPerDeal(maxAmount);
        properties.setMaxAmountTotal(maxAmountTotal);
        return properties;
    }
}
