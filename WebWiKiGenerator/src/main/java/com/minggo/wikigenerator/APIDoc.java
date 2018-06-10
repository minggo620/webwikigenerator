package com.minggo.wikigenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//需要生成测试接口需要动态生成
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface APIDoc {
	String title();
	String url();
	String[] param();
	String[] paramDesc();
}
