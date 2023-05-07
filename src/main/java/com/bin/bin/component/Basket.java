package com.bin.bin.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;
@SessionScope
@Component
public class Basket {

    private final Set<Integer> ids = new HashSet<>();

    public void add (List<Integer> ids) {
        this.ids.addAll(ids);
    }
    public Set<Integer> get(){
        return Collections.unmodifiableSet(ids);
    }

}
