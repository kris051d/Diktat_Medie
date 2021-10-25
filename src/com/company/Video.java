package com.company;

import java.time.LocalDate;

public class Video extends Medie implements Pause{

    private double durationSecond;
    private String videoFileName;
    private String kameraMand;

    @Override
    public String toString() {
        return "Video{" +
                "titel='" + super.getTitel() + '\'' +
                ", beskrivelse='" + super.getBeskrivelse() + '\'' +
                ", createdDate=" + super.getCreatedDate() +
                ", modifiedDate=" + super.getModifiedDate() +
                ", uid=" + super.getUnikID() +
                '}';
    }

    public Video() {
    }

    public Video(double durationSecond, String kameraMand) {
        this.durationSecond = durationSecond;
        this.kameraMand = kameraMand;
    }

    public Video(String titel, String beskrivelse, LocalDate createdDate, double durationSecond, String kameraMand) {
        super(titel, beskrivelse, createdDate);
        this.durationSecond = durationSecond;
        this.kameraMand = kameraMand;
    }

    public double getDurationSecond() {
        return durationSecond;
    }

    public void setDurationSecond(double durationSecond) {
        this.durationSecond = durationSecond;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }

    @Override
    public void pause() {
        // sætte afspilning på pause
        System.out.println("Videoen er stoppet");
    }
}
