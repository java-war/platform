/**
 * Copyright &copy; 2004-2016
 * <a href="https://www.ev-link.com.cn">珠海驿联新能源汽车有限公司</a>
 * All rights reserved.
 */
package com.jwar.platform.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * User: XieJihong 
 * Date: 2016/12/13 21:13 
 * Description: ${todo}(用一句话描述该文件做什么) 
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}