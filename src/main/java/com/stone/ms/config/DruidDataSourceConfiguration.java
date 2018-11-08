package com.stone.ms.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/6 22:11
 * @Email zou.shiyong@frontsurf.com
 */
@Configuration
public class DruidDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.druid")
    public DruidDataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 配置监控服务器
     *
     * @return 返回监控注册的servlet对象
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
       ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        // 添加控制台管理用户
       servletRegistrationBean.addInitParameter("loginUsername", "admin");
       servletRegistrationBean.addInitParameter("loginPassword", "admin");
        // 是否能够重置数据
       servletRegistrationBean.addInitParameter("resetEnable", "false");
       return servletRegistrationBean;
    }


    /**
     * 配置服务过滤器
     *
     * @return 返回过滤器配置对象
     */
    @Bean
    public FilterRegistrationBean statFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        // 添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");
        // 忽略过滤格式
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,");
        return filterRegistrationBean;
    }

}
