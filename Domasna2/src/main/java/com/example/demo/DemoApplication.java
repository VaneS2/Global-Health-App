package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.ArrayList;
import java.util.Collection;

@SpringBootApplication
@ServletComponentScan
public class DemoApplication {

    public static class Home {
        public  void printf()
        {
            System.out.println("Home");
        }


    }



    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

         class  Apartment extends Home {
            public  void printf()
            {
                System.out.println("Apartment");
            }

        }

         class House extends Home {
            public  void printf()
            {
                System.out.println("House");
            }


        }
        class Haha  {
            public  void printf()
            {
                System.out.println("House");
            }


        }

        ArrayList<Home> homes= new ArrayList<>();
        Apartment apartment= new Apartment();
        homes.add(new Home());
        homes.add(new House());

        for(int i=0;i<homes.size();i++)
        {
            homes.get(i).printf();
        }

    }

}
