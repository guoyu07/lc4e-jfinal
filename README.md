[Light Forum](http://www.eicoding.com)
==========

----------
converted from spring mvc project -> [lc4e-spring](https://github.com/Teddy-Zhu/lc4e-spring)

### It's a Light Forum.

>#### Back
>### Based On `JDK8` `Maven` `Jfinal` `MYSQL` `Shiro` `Jetbrick Template`
>#### Font
>### `Webpack` `HTML5`,`VueJs`,`CSS3`


# [Demo](http://www.eicoding.com) #
----------

# Jfianl 框架增强相关 #
----------

>Jfianl Extend 基于Jfinal轻量级框架   
>实现了类似Spring的Ioc, 更加简单的aop功能
>注解参数验证等功能

# 注解

- `ConfigHandler [T]`:注解Jfianl Config，可以导入多个Config
- `PluginHander [T]`:注解插件类 ，自动加载插件无需在Config中手动配置
- `GlobalHandler [T]`: 注解handler，自动加载全局Handler
- `InterceptorHandler [T]`:注解interceptor 自动加载全局拦截器
- `ExceptionHanders [T]`:注解全局异常处理类，可以手动处理特殊异常，并render
- `ExceptionHander [M]`:配合ExceptionHanders，自动处理指定异常
- `Job [M]`:除了配置之外可以注解Job，自动job
- `Controller [T]`: 注解生成路由配置
- `Service [T]`: 自动注入Service层,需配合 Inject注解，Service 方法加入Transaction 注解 即可自动事物
- `Model [T]`：结合ActiveRecord，自动Mapping数据库， 结合Tools 可以自动生成Dao 与 Mapping数据
- `Inject [F]`: 自动注入，须在Serivce 或者 Controller中。


## 自定义注解插件
> 自定义注解插件,除了系统初始化级别的注解外,`Controller ` 以及`Service ` 内的注解均可以通过此插件进行拓展.	
> 用法(Usage): 具体参考系统一有注解	
> example

```Java
@CustomAnnotation
public class customAn implements CustomAnnotationPlugin {
           // 插件运行顺序
           public int getOrder() {
                return 1000;
            }
            // 需要自定义的注解的class
            public abstract Class<? extends Annotation> getAnnotation();
            //处理此注解的事件
            //参数说明 
            //annotation 为当前注解的实例
            //resolver 处理完事件调用原函数,resolver.invoke()
            // objects 拦截方法的参数
            // target 调用的实例
            // method 拦截的方法
            // isHandled 需要直接返回不处理剩余直接或者其本身事件时,isHandled[0] = true
            public abstract Object intercept(Annotation annotation, AnnotationPluginResolver resolver, Object[] objects, Object target, Method method, boolean[] isHandled) throws Throwable;
}
```
### Jfinal IPlugin 增强
```java
public interface IPlugin {  

	//在configPlugin中初始化  
	   void init(Plugins me);  
    //在configRoute中初始化  
        void init(Routes me);  
    //在configConstant中初始化  
        void init(Constants me);  
    //在configInterceptor中初始化  
        void init(Interceptors me);  
    
    //configHandler中初始化    
        void init(Handlers me);  

    //立即执行的函数  
         boolean start(CustomPlugin configPlugin);  
    
    //暂无作用 预留函数  
         boolean stop(CustomPlugin configPlugin);  
    
    //jifnal 原生 start  
         default boolean start() {  
             return true;  
             }  
    //jifnal 原生 stop  
         default boolean stop() {  
             return true;  
             }  
     }
```

###基于CustonAnnotation的注解插件
- `Transaction [M]`:在方法上注入，可以自动事物
- `RequestHeader[T/M]`:request Header 验证
- `RequestMethod[T/M]`:request 类型验证，实现restful风格的Controller
- `ResponseStatus[T/M]`:强制设置返回状态码
- `SetComVar[M]`:设置数据库配置项，预设值
- `SetUIDate[M]`:设置动态UI变量,可指定方法
- `SetUIDates[M]`:批量SetUIDate
- `ValidateComVar[M]`:验证数据库配置值，预设值
- `ValidateComVars[M]`:批量ValidateComVar
- `ValidateParam[M]`:参数验证,支持String Integer,Long,Double,Float,Date,File,ActiveRecord等验证，同时设置默认值
- `ValidateParams[M]`:批量参数验证,当参数过多时推荐使用
- `ValidateFunctionValue[M]`: 参数验证升级版,可以指定获取某方法的返回值,意味着可以动态获取值去验证
- `ValidateFunctionValues[M]`: 批量的验证
- `ValidateToken[T/M]`:验证TOKEN
- `Cache[M]`:在Service的方法中注解，可以自动缓存结果
- `SetPJAX`:设置PJAX attribute
- `SetAJAX`:设置AJAX attribute

### 基于增强 IPlugin 增加的功能
- `CacheControlPlugin`: 静态文件缓存插件
- `CustomAnPlugin`: [CORE]自定义注解插件, 实现了 CustonAnnotation 功能
- `EventPlugin`: 事件驱动插件
- `ExceptionPlugin`:[CORE]异常处理插件
- `HandlePlugin`: [CORE]处理基于@GlobalHandler的 handler
- `InjectPlugin` : [CORE]自动注入基础插件
-	`InterceptorPlugin`: [CORE]处理 intercept的插件
-	`JfinalPlugin`:[CORE]处理 jfinal本身
-	`QuartzPlugin`:quartz 插件
-	`RESTfulPlugin`: restful 风格 api
-	`RoutePlugin`:[CORE]注解路由
-	`ServicePlugin`:[CORE]注册服务注解类
-	`ShiroPlugin`:shiro 权限控制插件

### Shiro相关注解
- `RequireGuest[T/M]`:
- `RequiresAuthentication[T/M]`:
- `RequiresPermissions[T/M]`:
- `RequiresGuest[T/M]`:
- `RequiresUser[T/M]`:


### 其他
- `BaseController`：增强Controller 增加isAJAX ，isPJAX , 验证码render等
- `DBModel`: 增强Model,自动set updateTime，createTime,自动事务，自动Cache
- `IPlugin`:plugin增强，需使用PluginHander载入，增加 init方法 ，可以设置Plugins，Routes，Constants，Interceptors，Handlers


## 新增异常(待整理)

- Lc4eAutoSetterException:自动设置response attribute 异常  
- Lc4eApplicationException: 业务层异常  
- Lc4eException:  
- Lc4eRuntimeException:Lc4e自定义代码异常  
- ReflectException ：ReflectTool 类中异常  
- Lc4eValidateException:参数验证过程异常  

----------

# 论坛相关 #
----------

> ###轻量级论坛系统  
>1.  主题  
>  1.Markdown支持  
>  2.@楼层功能  
>  3.等...
>2. 用户  
>  1.用户控制权限系统  
>  2.独立自由的用户like,block系统  
>3. 插件拓展系统  
>  1.自由定制系统  
>4. 用户喜好推荐系统  
>  1.浏览习惯推荐主题  
>5. 待补充。。。 



#重大更新#
----------

- 6/13/2015 4:22:59
> Remove Mysql . Replaced with MongoDB.
> Version to V2

- 7/31/2015 1:08:22
> Convert Spring to Jfinal [Origin Project](https://github.com/Teddy-Zhu/lc4e-spring)  
> Rollback MongoDB to MYSQL

- 10/29/2015 13:46:26
> Convert View Render from Beelt to Jetbrick 

- 12/21/2015 19:13:16
>stop woking on the project and wait for sui finished

- 01/11/2016 23:34:42
>update jfinal version to 2.1

- 02/05/2017 10:31:31
>update jfinal version to 2.2

