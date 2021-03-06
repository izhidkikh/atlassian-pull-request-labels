package io.reconquest.bitbucket.labels.rest.response;

import javax.xml.bind.annotation.XmlElement;

import io.reconquest.bitbucket.labels.Label;

public class PullRequestLabelResponse {
  @XmlElement(name = "id")
  private Integer labelId;

  @XmlElement(name = "name")
  private String name;

  @XmlElement(name = "color")
  private String color;

  public PullRequestLabelResponse() {}

  public PullRequestLabelResponse(Label label) {
    this.labelId = label.getLabelId();
    this.name = label.getName();
    this.color = label.getColor();
  }
}
