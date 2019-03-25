package com.fengzhongguji.feign;

import com.fengzhongguji.service.MemberService;
import org.springframework.cloud.netflix.feign.FeignClient;



@FeignClient("member")
public interface MemberFeign extends MemberService {

}
