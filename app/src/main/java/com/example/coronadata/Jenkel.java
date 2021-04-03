package com.example.coronadata;

import java.io.Serializable;

public class Jenkel implements Serializable {
    private int doc_count;

    public Jenkel(int doc_count) {
        this.doc_count = doc_count;
    }

    public int getDoc_count() {
        return doc_count;
    }

    public void setDoc_count(int doc_count) {
        this.doc_count = doc_count;
    }
}
