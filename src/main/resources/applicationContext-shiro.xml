<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:util="http://www.springframework.org/schema/util"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd">

    <description>apache shiro配置</description>

    <bean id="shiroFilter" class="org.apache.shiro.spring.web.ShiroFilterFactoryBean">
        <property name="securityManager" ref="securityManager"/>
        <property name="loginUrl" value="/rest/page/login"/>
        <property name="successUrl" value="/rest/index"/>
        <property name="unauthorizedUrl" value="/rest/page/401"/>
        <property name="filterChainDefinitions">
            <value>
                <!-- 静态资源允许访问 -->
                /app/** = anon
                /assets/** = anon
                <!-- 登录页允许访问 -->
                /rest/user/login = anon
                <!-- 其他资源需要认证 -->
                /** = authc
            </value>
        </property>
    </bean>

    <!-- 缓存管理器 使用Ehcache实现 -->
    <bean id="shiroEhcacheManager" class="org.apache.shiro.cache.ehcache.EhCacheManager">
        <property name="cacheManagerConfigFile" value="classpath:ehcache-shiro.xml"/>
    </bean>

    <!-- 会话DAO -->
    <bean id="sessionDAO" class="org.apache.shiro.session.mgt.eis.MemorySessionDAO"/>

    <!-- 会话管理器 -->
    <bean id="sessionManager" class="org.apache.shiro.web.session.mgt.DefaultWebSessionManager">
        <property name="sessionDAO" ref="sessionDAO"/>
    </bean>

    <!-- 安全管理器 -->
    <bean id="securityManager" class="org.apache.shiro.web.mgt.DefaultWebSecurityManager">
        <property name="realms">
            <list>
                <ref bean="securityRealm"/>
            </list>
        </property>
        <!-- cacheManager,集合spring缓存工厂 -->
        <!-- <property name="cacheManager" ref="shiroEhcacheManager" /> -->
        <!-- <property name="sessionManager" ref="sessionManager" /> -->
    </bean>

    <!-- Shiro生命周期处理器 -->
    <bean id="lifecycleBeanPostProcessor" class="org.apache.shiro.spring.LifecycleBeanPostProcessor"/>

</beans>