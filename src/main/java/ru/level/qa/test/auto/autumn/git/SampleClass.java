package ru.level.qa.test.auto.autumn.git;

public class SampleClass {

    public static void main(String[] args) {
        System.out.println("Hello git");
        GitCredentials gc = new GitCredentials("vasya", "vasya");
        System.out.println(gc);

        GitRepo gr = new GitRepo("level_up_repo");
        System.out.println("repository name -> " + gr.getRepositoryName());
        gr.addBranch("master");
        gr.addBranch("branch_3");
        gr.addBranch("branch_1");
        System.out.println("Branches -> " + gr.getBranches());
    }
}
