package com.example.handlingformsubmission;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class Greeting {

    @NotNull
    @Min(1)
    private long id;
    @NotNull
    @Size(min=2, max=30)
    private String content;
    public Greeting(){}

    public Greeting(int id, String content){
        this.id=id;
        this.content=content;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
