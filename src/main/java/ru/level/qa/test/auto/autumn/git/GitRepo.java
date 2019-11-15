package ru.level.qa.test.auto.autumn.git;

import java.util.ArrayList;
import java.util.List;

public class GitRepo {

    private String repositoryName;
    private List<String> branches;

    public GitRepo(String repositoryName) {
        this.repositoryName = repositoryName;
        this.branches = new ArrayList<>();
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
}
