package com.example.demo.web.rest;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.StartInstancesRequest;

public class StartEc2 {

    public static void main(String[] args) {

        Ec2Client ec2 = Ec2Client.builder()
                .region(Region.US_EAST_1)
                .build();

        StartInstancesRequest request = StartInstancesRequest.builder()
                .instanceIds("i-0b637c28750c9d424")
                .build();

        ec2.startInstances(request);

        System.out.println("EC2 Instance started successfully");
        ec2.close();
    }
}

