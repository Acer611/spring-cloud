package com.style.springcloud.cloudrabbitmq;

import java.io.Serializable;

public class User implements Serializable {

        String name ;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


}
