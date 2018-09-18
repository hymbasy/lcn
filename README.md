# lcn分布式事务demo
项目接口：</p>
      lcn-api 为接口层 </p>
      lcn-web web层 </p>
      lcn-demo1 访问数据库dao层 </p>
      lcn-demo2 访问数据库dao层 </p>
      tx-manager是LCN 分布式事务协调器 </p>
需要注意的点：</p>
  tx-manager依赖redis，需要启动redis服务，另外需要事务控制的项目都需要配置tx.properties配置文件，因为在tx-client(transaction-dubbo jar中包含 tx-client)中 com.codingapi.tx.config.ConfigReader直接读取的配置文件名称就是tx.properties。</p>
  
项目需要引用下面两个依赖：</p>
  
        <!--lcn分布式事务dubbo依赖-->
        <dependency>
            <groupId>com.codingapi</groupId>
            <artifactId>transaction-dubbo</artifactId>
            <version>${lcn.last.version}</version>
        </dependency>
        

      <!--lcn分布式事务数据库依赖-->
        <dependency>
            <groupId>com.codingapi</groupId>
            <artifactId>tx-plugins-db</artifactId>
            <version>${lcn.last.version}</version>
        </dependency>

   项目配置文件中需要加上<context:component-scan base-package="com.codingapi.tx.*"/></p>
   LCN原理:https://github.com/codingapi/tx-lcn/wiki/LCN%E5%8E%9F%E7%90%86 </p>
   框架源码:https://github.com/codingapi/tx-lcn</p>
   demo:https://github.com/codingapi/dubbo-lcn-demo</p>

   
   
