package com.bibhuti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.bibhuti.binding.Country;

@Configuration
public class RedisConfig {
	
	public JedisConnectionFactory jedisConn() {
		JedisConnectionFactory jedis = new JedisConnectionFactory();
		
		// Redis server properties
		 jedis.afterPropertiesSet();
		
		return jedis;
	}
	
	@Bean
	public RedisTemplate<String, Country> redisTemplate(){
		
		RedisTemplate<String, Country> rt = new RedisTemplate<>();
		rt.setConnectionFactory(jedisConn());
		rt.afterPropertiesSet();
		
		return rt;
		
	}
	
}
