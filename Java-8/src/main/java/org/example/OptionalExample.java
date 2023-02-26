package org.example;

import java.util.Optional;

public class OptionalExample {

    private int id;
    private String title;
    private boolean closed;
    public Progress progress; // 얼마나 오랫동안 학습을 했는지


    public OptionalExample(int id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Optional<Progress> getProgress() {
        return Optional.ofNullable(progress);

    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
}
