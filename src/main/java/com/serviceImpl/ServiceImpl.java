package com.serviceImpl;

import com.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "tkdhhh";
    }
}
