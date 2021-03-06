package examples.configasync;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class LocalAsyncConfig {

    // for method where you want to use this type of Executor config set: @Async("localThreadPoolTaskExecutor")
    @Bean(name = "localThreadPoolTaskExecutor")
    public Executor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor myOnMethod = new ThreadPoolTaskExecutor();
        myOnMethod.setCorePoolSize(2);
        myOnMethod.setMaxPoolSize(2);
        myOnMethod.setQueueCapacity(2);
        myOnMethod.setThreadNamePrefix("LocExecutor-");
        return myOnMethod;
    }
}
