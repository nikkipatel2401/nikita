package com.example.cuteheart.tabledata;

public class person {
    String institutename,filepath,filename,contactno,email,address,aboutus,quotes;

    public person(String institutename, String filepath) {
    }

    public person(String institutename, String filepath, String filename, String contactno, String email, String address, String aboutus, String quotes) {
        this.institutename = institutename;
        this.filepath = filepath;
        this.filename = filename;
        this.contactno = contactno;
        this.email = email;
        this.address = address;
        this.aboutus = aboutus;
        this.quotes = quotes;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAboutus() {
        return aboutus;
    }

    public void setAboutus(String aboutus) {
        this.aboutus = aboutus;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }
}
