package ru.level.qa.test.auto.autumn.git;

public class SampleClass {

    public static void main(String[] args) {
        System.out.println("Hello git");
        GitCredentials gc = new GitCredentials("vasya", "vasya");
        System.out.println(gc);

        GitRepo gr = new GitRepo("level_up_repo");
        System.out.println("repository name -> " + gr.getRepositoryName());
        gr.setRepositoryName("branch_2_repo");
    }
}
