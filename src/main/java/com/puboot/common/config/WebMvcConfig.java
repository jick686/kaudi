package com.puboot.common.config;

import com.puboot.common.config.properties.FileUploadProperties;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Nobita
 * @date 2020/4/18 11:58 上午
 */
@Configuration
@AllArgsConstructor
@EnableConfigurationProperties(FileUploadProperties.class)
public class WebMvcConfig implements WebMvcConfigurer {

    private final FileUploadProperties fileUploadProperties;

    /**
     * 配置本地文件上传的虚拟路径
     * 备注：这是一种图片上传访问图片的方法，实际上也可以使用nginx反向代理访问图片
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(fileUploadProperties.getAccessPathPattern())
                .addResourceLocations("file:" + fileUploadProperties.getUploadFolder());
    }
}
