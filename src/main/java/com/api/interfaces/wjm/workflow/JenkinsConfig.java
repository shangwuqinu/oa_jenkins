package com.api.interfaces.wjm.workflow;

import jakarta.persistence.*;

@Entity
public class JenkinsConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jenkinsToken")
    private String jenkinsToken;
    public String getJenkinsToken() {
        return jenkinsToken;
    }
}