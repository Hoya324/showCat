package toyProject1.showCat.domain;

public class Member {

    private Long id;
    private String clientName;
    private Grade grade;

    private String catName;
    private BreedOfCats breedOfCat;
    private Gender genderOfCat;
    private int catAge;

    public Member(Long id, String clientName, Grade grade, String catName, BreedOfCats breedOfCat, Gender genderOfCat, int catAge) {
        this.id = id;
        this.clientName = clientName;
        this.grade = grade;
        this.catName = catName;
        this.breedOfCat = breedOfCat;
        this.genderOfCat = genderOfCat;
        this.catAge = catAge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getCatName() {
        return catName;
    }
}
