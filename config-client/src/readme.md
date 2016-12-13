1.特别注意 配置中心的地址一定要放在bootstrap.properties中，这个配置文件是由“根”上下文优先加载，可以保证程序启动之初就感知到远程配置中心的存在，并从远程获取配置，随后继续启动系统，这点十分重要。 
2.而application.properties是由子上下文加载，加载顺序低于前者，如果配置中心地址放在这里，并且你远程配置了一些启动相关的必要参数，那么，你的程序很可能由于缺少参数而启动失败。 
3.下面这段代码，最关键的是第一行，第二行如果不配置系统默认读取spring.application.name，第三行如果不配置，系统默认default，即：${spring.application.name}.properties 
4.我们一般的做法是，在系统启动的时候，用命令行传入--spring.cloud.config.profile=dev|prod|test的方式，因为在启动的时候，我们是明确知道我要获取哪套配置的。 5.bus相关的配置（本例中用的kafka）完全可以放在远程。