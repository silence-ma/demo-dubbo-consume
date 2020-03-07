package com.ustc.demo.consumer;

 

import com.ustc.demo.provider.DemoService;

 

public class DemoAction {

       private DemoService demoService;

 

    public void setDemoService(DemoService demoService) {

        this.demoService = demoService;

    }

   

    public void start() throws Exception {

        for (int i = 0; i < Integer.MAX_VALUE; i ++) {

            try {

                String hello = demoService.sayHello("Hello, how much is the current time?");

                System.out.println("From provider: " + hello);

            } catch (Exception e) {

                e.printStackTrace();

            }

            Thread.sleep(2000);

        }

    }

}