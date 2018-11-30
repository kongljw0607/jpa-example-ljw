package com.kongtech.WebService.entitiy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "archives")
public class Archive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="wallpaperfiletype")
    private String wallpaperFileType;

    @Column(name ="wallpaperfilesize")
    private Long wallpaperFileSize;

    @Column(name= "wallpaperfilename")
    private String wallpaperFileName;

    @Column(name= "wallpaperfilepath")
    private String wallpaperFilePath;

    @Column(name = "divisionid")
    private int divisionId;

    @Column(name= "launchingdate")
    private Date launchingDate;

    @Column(name = "createdat",nullable = false,updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name = "updatedat",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getWallpaperFileType() {
        return wallpaperFileType;
    }

    public Long getWallpaperFileSize() {
        return wallpaperFileSize;
    }

    public String getWallpaperFileName() {
        return wallpaperFileName;
    }

    public String getWallpaperFilePath() {
        return wallpaperFilePath;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public Date getLaunchingDate() {
        return launchingDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWallpaperFileType(String wallpaperFileType) {
        this.wallpaperFileType = wallpaperFileType;
    }

    public void setWallpaperFileSize(Long wallpaperFileSize) {
        this.wallpaperFileSize = wallpaperFileSize;
    }

    public void setWallpaperFileName(String wallpaperFileName) {
        this.wallpaperFileName = wallpaperFileName;
    }

    public void setWallpaperFilePath(String wallpaperFilePath) {
        this.wallpaperFilePath = wallpaperFilePath;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public void setLaunchingDate(Date launchingDate) {
        this.launchingDate = launchingDate;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "id=" + id +
                ", wallpaperFileType='" + wallpaperFileType + '\'' +
                ", wallpaperFileSize=" + wallpaperFileSize +
                ", wallpaperFileName='" + wallpaperFileName + '\'' +
                ", wallpaperFilePath='" + wallpaperFilePath + '\'' +
                ", divisionId=" + divisionId +
                ", launchingDate=" + launchingDate +
                '}';
    }


}
