package com.example.cuteheart.recyclerview;

public class person {
    String f_name,password,file_path;

    public person() {
    }

    public person(String f_name, String password, String file_path) {
        this.f_name = f_name;
        this.password = password;
        this.file_path = file_path;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }
}
