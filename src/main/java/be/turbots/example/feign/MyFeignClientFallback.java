package be.turbots.example.feign;

import org.springframework.stereotype.Component;

@Component
public class MyFeignClientFallback implements MyFeignClient {

    @Override
    public String getText() {
        return "FALLBACK TEXT";
    }
}
