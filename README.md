# 高性能JSON框架之FastJson的简单使用
学习至：https://segmentfault.com/a/1190000011212806
## 1.前言 ##

### 1.1.FastJson的介绍: ###
JSON协议使用方便，越来越流行,JSON的处理器有很多,这里我介绍一下FastJson,FastJson是阿里的开源框架,被不少企业使用,是一个极其优秀的Json框架,Github地址: [FastJson](https://github.com/alibaba/fastjson)
 
### 1.2.FastJson的特点: ###
1.FastJson数度快,无论序列化和反序列化,都是当之无愧的fast  
2.功能强大(支持普通JDK类包括任意Java Bean Class、Collection、Map、Date或enum)  
3.零依赖(没有依赖其它任何类库)  

### 1.3.FastJson的简单说明: ###
FastJson对于json格式字符串的解析主要用到了一下三个类：  
1.JSON：fastJson的解析器，用于JSON格式字符串与JSON对象及javaBean之间的转换  
2.JSONObject：fastJson提供的json对象    
3.JSONArray：fastJson提供json数组对象  
