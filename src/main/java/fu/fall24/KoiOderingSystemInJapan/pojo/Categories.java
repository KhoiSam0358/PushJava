package fu.fall24.KoiOderingSystemInJapan.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cate_name")
    private String cateName;

    @Column(name = "description")
    private String description;

    public Categories() {
    }

    public Categories(int id, String cateName, String description) {
        this.id = id;
        this.cateName = cateName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
