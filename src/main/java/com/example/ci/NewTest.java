package com.example.ci;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NewTest {

    @Value("${my.ec2}")
    private String ec2;
}
