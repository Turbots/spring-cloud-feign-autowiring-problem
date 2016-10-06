package be.turbots.example.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "my-service", fallback = MyFeignClientFallback.class, url = "${my.service.url}")
public interface MyFeignClient extends MyRestService {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getText();
}
