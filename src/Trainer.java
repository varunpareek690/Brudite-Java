import java.util.List;
import java.util.Objects;

public class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private long contactNumber;
    private List<TechStack> techStackList;

    public Trainer(int trainerId, String name, String email, long contactNumber, List<TechStack> techStackList) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStackList = techStackList;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", techStackList=" + techStackList +
                '}';
    }


    public List<TechStack> getTechStackList() {
        return techStackList;
    }

    public void setTechStackList(List<TechStack> techStackList) {
        this.techStackList = techStackList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return trainerId == trainer.trainerId && contactNumber == trainer.contactNumber && Objects.equals(name, trainer.name) && Objects.equals(email, trainer.email) && Objects.equals(techStackList, trainer.techStackList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId, name, email, contactNumber, techStackList);
    }
}
