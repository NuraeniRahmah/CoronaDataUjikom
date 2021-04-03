package com.example.coronadata;

import java.io.Serializable;
import java.util.List;

public class KelasBesar implements Serializable {
    private List<Provinsi> list_data;

    public KelasBesar(List<Provinsi> list_data) {
        this.list_data = list_data;
    }

    public List<Provinsi> getList_data() {
        return list_data;
    }

    public void setList_data(List<Provinsi> list_data) {
        this.list_data = list_data;
    }
}
