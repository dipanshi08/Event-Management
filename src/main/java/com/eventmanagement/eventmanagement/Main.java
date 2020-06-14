package com.eventmanagement.eventmanagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

public class Main {

    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Value("${app.title}")
    private String url;
    public static void main(String[] args) {


        System.out.println(UUID.randomUUID());
        Main ma = new Main();
        ma.solve();
        System.out.println("");
    }

    private void solve() {
        System.out.println(url);
    }

}

