/**
 * Copyright &copy; 2004-2016
 * <a href="https://www.ev-link.com.cn">珠海驿联新能源汽车有限公司</a>
 * All rights reserved.
 */
package com.jwar.platform.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: XieJihong 
 * Date: 2016/12/13 21:24 
 * Description: ${todo}(用一句话描述该文件做什么) 
 */
@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${spring.cloud.config.client.name}")
	String name = "World";

	@RequestMapping("/")
	public String home() {
		System.out.println(name);
		return name;
	}
}
