package org.example;

import java.time.Duration;

public class Progress {

    private Duration studyDuration; // 얼마나 오랫동안 수업을 했는지
    private boolean finished; // 수료를 했는지

    public Duration getStudyDuration() {
        return studyDuration;
    }

    public void setStudyDuration(Duration studyDuration) {
        this.studyDuration = studyDuration;
    }
}
