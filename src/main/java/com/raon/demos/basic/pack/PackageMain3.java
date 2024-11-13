package com.raon.demos.basic.pack;

import com.raon.demos.basic.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        com.raon.demos.basic.pack.b.User userB = new com.raon.demos.basic.pack.b.User();
    }
}
