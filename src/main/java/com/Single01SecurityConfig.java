package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * @author seyha.sin
 * Sep 30, 2022/2022 : 2:19:35 PM
 */
@Configuration
@EnableOAuth2Client
public class Single01SecurityConfig extends WebSecurityConfigurerAdapter {

}
