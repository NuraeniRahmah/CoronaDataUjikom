package com.example.coronadata;

import java.io.Serializable;

public class Umur implements Serializable {
    private String key;
    private int doc_count;

    public Umur(String key, int doc_count) {
        this.key = key;
        this.doc_count = doc_count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getDoc_count() {
        return doc_count;
    }

    public void setDoc_count(int doc_count) {
        this.doc_count = doc_count;
    }
}
