package com.latinojoel.health.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "HYPER_TENSION_RECORD")
public class HypertensionRecord {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @DateTimeFormat(pattern = "dd-MM-yyyy")
  @NotNull
  @Column(name = "DATE", nullable = false)
  private Date date;

  @NotNull
  @Column(name = "MAX_MMHG", nullable = false)
  private int maxmmHg;

  @NotNull
  @Column(name = "MIN_MMHG", nullable = false)
  private int minmmHg;

  @NotNull
  @Column(name = "BPM", nullable = false)
  private int bpm;

  @NotNull
  @Column(name = "WEIGHT")
  private float weight;

  @Enumerated(EnumType.STRING)
  @Column(name = "MOMENT_TYPE")
  private MomentType momentType;

  @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  private User user;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public int getMaxmmHg() {
    return maxmmHg;
  }

  public void setMaxmmHg(int maxmmHg) {
    this.maxmmHg = maxmmHg;
  }

  public int getMinmmHg() {
    return minmmHg;
  }

  public void setMinmmHg(int minmmHg) {
    this.minmmHg = minmmHg;
  }

  public int getBpm() {
    return bpm;
  }

  public void setBpm(int bpm) {
    this.bpm = bpm;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public MomentType getMomentType() {
    return momentType;
  }

  public void setMomentType(MomentType momentType) {
    this.momentType = momentType;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (!(obj instanceof HypertensionRecord))
      return false;
    final HypertensionRecord other = (HypertensionRecord) obj;
    if (id != other.id)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "HypertensionRecord [id=" + id + ", maxmmHg=" + maxmmHg + ", minmmHg=" + minmmHg
        + ", bpm=" + bpm
        + ", weight=" + weight + ", momentType=" + momentType + "]";
  }
}
