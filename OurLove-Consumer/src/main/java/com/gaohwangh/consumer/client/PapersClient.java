package com.gaohwangh.consumer.client;

import com.gaohwangh.api.feignClient.PapersCall;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: GH
 * @Date: 2019/7/16 1:02
 * @Version 1.0
 */
@FeignClient("${feign-client.ourlove-server}")
//@Repository
public interface PapersClient extends PapersCall {

}
