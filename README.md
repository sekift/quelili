# quelili
quelili(雀哩哩)，凤头卡拉鹰，于1900年灭绝。在这里是一个集成SpringCloud、SpringBoot等工具，用于操作歌词的项目名。后续可能继续编写自动写歌词，自动编曲等功能。<br/>
1、自动写词参考项目：<br />
https://github.com/jcjohnson/torch-rnn<br />
https://github.com/zhangzibin/char-rnn-chinese<br />
https://github.com/crisbal/docker-torch-rnn<br />
nohup th train.lua -input_h5 my_data.h5 -input_json my_data.json -model_type rnn -num_layers 3 -rnn_size 256 -learning_rate 0.0001 -gpu -1 -seq_length 20 &<br />
2、自动编曲思想：<br />
由于找不到类似的项目，估根据歌曲的谱，挑选适当的和弦，然后使用和弦矩阵来控制走向，初级打算只做16/32个常用的和弦矩阵。<br />

## 项目介绍
1）quelili-cloud：SpringCloud，主要用到Eureka注册功能。<br/>
2）quelili-back：SpringBoot，歌词功能API，用到以下工具。<br/>
JDK：1.8.0_121<br/>
集成环境：IntelliJ IDEA 2019.1<br/>
运行容器：Tomcat 9.0.7<br/>
项目管理：Maven 2.5.2<br/>
微服务：SpringCloud Greenwich.SR3<br/>
集成框架：SpringBoot 2.1.8+Spring 5.1.9<br/>
持久层框架：MyBatis 3.4.6+MyBatis-Generator 1.3.2<br/>
数据库：MySql 5.5.25/PostgreSQL 9.6.13<br/>
数据库连接池：Druid 1.1.10<br/>
缓存数据库：Redis 4.0.2.3<br/>
日志框架：Logback 1.2.3<br/>
测试框架：Junit 4.12+Mockito 2.15.0<br/>
在线接口文档：Swagger 2.9.2<br/>

## 项目配置
项目配置请看/doc/quelili配置文档.doc，sql数据表信息请看back.sql。

## 附带功能
1、支持多语言；<br />
2、测试优化；<br />
3、序列化优化、跨域设置；<br />
4、Excel导出功能；<br />

## 功能更新
2019/10/01 更新 <br />
1、添加歌曲信息、专辑信息、歌词信息处理功能。<br />

2019/09/24 更新 <br />
1、第一个版本，搭建基本框架。<br />
2、用户登录、在线功能，歌手信息功能。<br />

## 现有的数据包括：
1、歌手总数：23485<br />
2、专辑总数：477666<br />
3、歌曲总数：4886674<br />
4、歌词总数：2093029<br />

