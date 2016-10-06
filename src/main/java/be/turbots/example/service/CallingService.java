package be.turbots.example.service;

import be.turbots.example.feign.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallingService {

    private final MyFeignClient myFeignClient;

    @Autowired
    public CallingService(MyFeignClient myFeignClient) {
        this.myFeignClient = myFeignClient;
    }

    public String getTextFromRestService() {
        return this.myFeignClient.getText();
    }
}
